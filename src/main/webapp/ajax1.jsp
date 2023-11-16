<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>댓글 작성하기</title>
	<script type="text/javascript" src="resources/js/jquery-3.7.1.js"></script>
	<script type="text/javascript">
		$(function () {
			$("#submitCommentButton").click(function() {
				var content = $("#commentInput").val();
				var oriid = $("#oriidInput").val();
				var writer = $("#writerInput").val();

				$.ajax({
					url: '/addComment',
					type: 'POST',
					data: {
						oriid: oriid,
						content: content,
						writer: writer
					},
					success: function(response) {
						// 성공 처리
						alert('댓글이 추가되었습니다.');
						// 댓글 목록을 새로고침하거나 댓글을 페이지에 동적으로 추가하는 코드를 여기에 추가
					},
					error: function(xhr, status, error) {
						// 오류 처리
						alert('댓글 추가에 실패했습니다: ' + error);
					}
				});
			});
		});

	</script>
</head>
<body>
내용 : <input id="commentInput" ><br>
oriid : <input id = "oriidInput"> <br>
writer : <input id = "writerInput"><br>
<button id="submitCommentButton">댓글 작성하기</button>

<hr color="red">
<div id="result">ajax통신 결과들어가는 곳.</div>
</body>
</html>
