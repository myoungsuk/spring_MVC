<%@ page import="com.multi.mvc01.dto.BbsDTO2" %><%--
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
<body bgcolor = "yellow">
    <%
        BbsDTO2 bag = (BbsDTO2) request.getAttribute("list");
    %>
게시판 id <%= bag.getId() %> <br>
게시판 title <%= bag.getTitle() %> <br>
게시판 content <%= bag.getContent() %> <br>
게시판 writer <%= bag.getWriter() %> <br>
</body>
</html>
