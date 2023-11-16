<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>마커 생성하기</title>

</head>
<body>

<div id="map" style="width:100%;height:350px;"></div>
<script type="text/javascript" src="resources/js/jquery-3.7.1.js"></script>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey="></script>
<script>
    $(function () {
        //시작하자마자 ajax를 실행해서 json을 받아와서 map을 찍자
        $.ajax({
            url: "map1",
            type: "get",
            dataType: "json",

            success: function (data) {
                console.log(data);

                var mapContainer = document.getElementById('map'), // 지도를 표시할 div
                    mapOption = {
                        center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
                        level: 3 // 지도의 확대 레벨
                    };

                var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

                // 마커가 표시될 위치입니다
                var markerPosition = new kakao.maps.LatLng(data.lat, data.lon);

                // 마커를 생성합니다
                var marker = new kakao.maps.Marker({
                    position: markerPosition
                });

                // 마커가 지도 위에 표시되도록 설정합니다
                marker.setMap(map);

                // 아래 코드는 지도 위의 마커를 제거하는 코드입니다
                // marker.setMap(null);
            },
            error: function (request, status, error) {
                alert("code:" + request.status + "\n" + "message:" + request.responseText + "\n" + "error:" + error);
            }
        })
    })
    // var mapContainer = document.getElementById('map'), // 지도를 표시할 div
    //     mapOption = {
    //         center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
    //         level: 3 // 지도의 확대 레벨
    //     };
    //
    // var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다
    //
    // // 마커가 표시될 위치입니다
    // var markerPosition  = new kakao.maps.LatLng(33.450701, 126.570667);
    //
    // // 마커를 생성합니다
    // var marker = new kakao.maps.Marker({
    //     position: markerPosition
    // });
    //
    // // 마커가 지도 위에 표시되도록 설정합니다
    // marker.setMap(map);
    //
    // // 아래 코드는 지도 위의 마커를 제거하는 코드입니다
    // // marker.setMap(null);
</script>
</body>
</html>