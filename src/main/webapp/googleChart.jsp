<%--
  Created by IntelliJ IDEA.
  User: Kang
  Date: 11/17/23
  Time: 2:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="resources/js/jquery-3.7.1.js"></script>
<%--    구글차트넣기--%>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type = "text/javascript">

    <%-- 구글차트 만들기--%>
    google.charts.load('current', {'packages':['corechart']});
    google.charts.setOnLoadCallback(drawChart);

    function drawChart() {
        alert("function drawChart() 실행");
        $.ajax({
            url: "getChartList",
            dataType: "json",
            success: function (array) {
                alert(array[0].doing + " " + array[0].time)
                var data = google.visualization.arrayToDataTable([
                    ['Task', 'Hours per Day'],
                    [array[0].doing,array[0].time],
                    [array[1].doing,array[1].time],
                    [array[2].doing,array[2].time],
                ]);
                var options = {
                    title: 'My Daily Activities'
                };

                var chart = new google.visualization.PieChart(document.getElementById('piechart'));
                chart.draw(data, options);
            },
        })
    }
</script>

</head>
<body>
    <div id = "piechart" style = "width: 900px; height: 500px;"></div>
</body>
</html>
