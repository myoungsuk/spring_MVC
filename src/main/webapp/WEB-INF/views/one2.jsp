
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
<body bgcolor = "yellow">
    <%
        ProductDTO bag = (ProductDTO) request.getAttribute("one2");
    %>
상품 id <%= bag.getId() %> <br>
상품 title <%= bag.getTitle() %> <br>
상품 content <%= bag.getContent() %> <br>
상품 price <%= bag.getPrice() %> <br>
상품 img
    <img src = "resources/img/<%= bag.getImg() %> " width="100" height="50"> <br>
상품 company <%= bag.getCompany() %> <br>

</body>
</html>
