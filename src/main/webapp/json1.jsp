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
                    url: "json1",
                    type:"GET",
                    dataType:"json",
                    success: function (data) {
                        console.log(data);
                        console.log(data.writer);

                        id_value = data.id;
                        title_value = data.title;
                        content_value = data.content;
                        writer_value = data.writer;

                        jsondata = id_value + " " + title_value + " " + content_value + " " + writer_value;
                        $('#result').append(jsondata + "<br>");
                    }, // success
                    error:function(xhr, status, error){
                        alert("에러발생");
                    } // error
                });
            });
        });

    </script>
</head>
<body>
<button id="b1">JSON으로 받아와보자(string)</button>

<hr color="red">
<div id="result" style="background: yellow; width:800px; hegith:800px;">ajax통신 결과들어가는 곳.</div><br>
</body>
</html>
