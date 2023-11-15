<%@ page import="com.multi.mvc01.dto.BbsDTO" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.multi.mvc01.dto.ProductDTO" %><%--
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
    ArrayList<ProductDTO> list = (ArrayList<ProductDTO>) request.getAttribute("list2");
    for (ProductDTO bag : list) {

%>
상품 id <%= bag.getId() %> <br>
<a href = "one2?id=<%= bag.getId() %>">상품 title <%= bag.getTitle() %> </a>
<br>
상품 가격 <%= bag.getPrice() %> <br>
<hr color="red">
<% } %>

</body>
</html>
