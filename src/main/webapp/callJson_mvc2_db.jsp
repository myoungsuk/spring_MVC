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
            $('#b3').click(function () {
                $.ajax({
                    url: "jsonbbs",
                    type: "get",
                    dataType: "json",
                    success: function (array) {
                        console.log(array);

                        header = "<table><tr><td width = 200>글번호</td><td width = 200>글제목</td><td width = 200>글내용</td><td width = 200>작성자</td></tr></table>";
                        $('#result').append(header);

                        for (var i = 0; i < array.length; i++) {
                            var obj = array[i];
                            var str = "";
                            str += "<table border='1'>";
                            str += "<tr>";
                            str += "<td width = 200>" + obj.id + "</td>";
                            str += "<td width = 200>" + obj.title + "</td>";
                            str += "<td width = 200>" + obj.content + "</td>";
                            str += "<td width = 200>" + obj.writer + "</td>";
                            str += "</tr>";
                            str += "</table>";

                            $('#result').append(str);
                        }

                    } // success

                });
            });
        });

    </script>
</head>
<body>

<button id="b3">JSON으로 받아와보자(list)</button>
<hr color="red">
<div id="result" style="background: yellow; width:800px; hegith:800px;">ajax통신 결과들어가는 곳.<hr></div>
</body>
</html>
