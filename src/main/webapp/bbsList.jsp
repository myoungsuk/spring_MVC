<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
  <title>게시판 목록</title>
</head>
<body>
<h1>게시판 목록</h1>
<table border="1">
  <tr>
    <th>제목</th>
    <th>내용</th>
  </tr>
  <c:forEach var="bbs" items="${bbsList}">
    <tr>
      <td>${bbs.title}</td>
      <td>${bbs.content}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
