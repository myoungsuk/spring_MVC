<%@ page import="com.multi.mvc01.dto.BbsDTO2" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Kang
  Date: 11/9/23
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="yellow">
<%
    ArrayList<BbsDTO2> list = (ArrayList<BbsDTO2>) request.getAttribute("list");
    for (BbsDTO2 bag : list) {

%>
게시판 id <%= bag.getId() %> <br>
<a href = "one?id=<%= bag.getId() %>">게시판 title <%= bag.getTitle() %> </a>
<br>
게시판 writer <%= bag.getWriter() %> <br>
<hr color="red">
<% } %>

</body>
</html>
