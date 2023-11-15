<%@ page import="com.multi.mvc01.dto.BbsDTO" %>
<%@ page import="com.multi.mvc01.dto.ReplyDTO" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Kang
  Date: 11/9/23
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    BbsDTO bbsDTO = (BbsDTO) request.getAttribute("bbsDTO");
%>
<%
    List<ReplyDTO> replyDTOList = (List<ReplyDTO>) request.getAttribute("replyDTOList");
%>

<html>
<head>
    <title>댓글 작성하기</title>
    <script type="text/javascript" src="resources/js/jquery-3.7.1.js"></script>
    <script type="text/javascript">


        $(function () {
            $("#submitCommentButton").click(function () {
                var content = $("#commentInput").val();
                var oriid = '<%= bbsDTO.getId() %>';
                var writer = '<%= session.getAttribute("loggedInUserId") %>';

                $.ajax({
                    url: '/addComment',
                    type: 'POST',
                    dataType: 'json',
                    data: {
                        oriid: oriid,
                        content: content,
                    },
                    success: function (response) {
                        if(response.result === "success") {
                            // 댓글 목록에 댓글을 추가합니다.
                            var newComment = "<div class='comment'>" +
                                "<p>내용: " + content + "</p>" +
                                "<p>작성자: " + writer + "</p>" +
                                "</div>";
                            $("#comments").append(newComment);
                            $("#commentInput").val(''); // 입력 필드를 비웁니다.
                            alert('댓글이 추가되었습니다.');
                        } else {
                            alert('댓글 추가에 실패했습니다.');
                        }
                    },
                    error: function (xhr, status, error) {
                        // 오류 처리
                        alert('댓글이 데이터에 들어가지 않았습니다: ' + error);
                    }
                });
            });
        });

    </script>
</head>
<body bgcolor="yellow">

게시판 id <%= bbsDTO.getId() %> <br>
게시판 title <%= bbsDTO.getTitle() %> <br>
게시판 content <%= bbsDTO.getContent() %> <br>
게시판 writer <%= bbsDTO.getWriter() %> <br>

<hr color="red">
내용 <input id="commentInput"> <br>
<button id="submitCommentButton">댓글 작성하기</button>

<hr color="black">
<div id="comments">
    <% for (ReplyDTO replyDTO : replyDTOList) { %>
    <div class="comment">
        <p>내용: <%= replyDTO.getContent() %></p>
        <p>작성자: <%= replyDTO.getWriter() %></p>
    </div>
    <br>
    <% } %>
</div>
</body>
</html>
