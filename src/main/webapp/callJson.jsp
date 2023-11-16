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
            $('#b1').click(function () {
                $.ajax({
                    url: "string",
                    success: function (string) {
                        alert(string)
						if(string == 'winner') {
							$('#result').append(string);
						}else{
							$('#result').append("looser");
						}
                    } // success

                });
            });
        });

    </script>
</head>
<body>
<button id="b1">JSON으로 받아와보자(string)</button>
<button id="b2">JSON2으로 받아와보자(json)</button>
<button id="b3">JSON2으로 받아와보자(array)</button>
<hr color="red">
<div id="result" style="background: yellow; width:800px; hegith:800px;">ajax통신 결과들어가는 곳.</div>
</body>
</html>
