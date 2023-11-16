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
                    url: "json2",
                    type: "GET",
                    dataType: "json", // 서버로부터 받을 데이터 타입
                    success: function (array) {
                        console.log(array);

                        $(array).each(function(i, json) {
                            id_value = json.id;
                            title_value = json.title;
                            content_value = json.content;
                            writer_value = json.writer;

                            data = id_value + " " + title_value + " " + content_value + " " + writer_value + "<br>";
                            $('#result').append(data);
                        })
                        // data for문으로 받아오기
                        for(var i = array.length-1; i>0; i--) {
                            id = array[i].id;
                            title = array[i].title;
                            content = array[i].content;
                            writer = array[i].writer;
                            $('#result').append(id + " " + title + " " + content + " " + writer + "<br>");
                        }
                        // data는 BbsDTO 객체의 배열입니다.
                        // 각 객체의 id, title, content, writer 필드를 사용하여 처리
                    },
                    error: function (xhr, status, error) {
                        console.error("Error occurred: " + xhr.status + " " + error);
                    }
                });
            });
        });

    </script>
</head>
<body>
<button id="b1">JSON으로 받아와보자(string)</button>

<hr color="red">
<div id="result" style="background: yellow; width:800px; hegith:800px;">ajax통신 결과들어가는 곳.<br></div>
</body>
</html>
