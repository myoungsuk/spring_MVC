<%@ page import="org.json.simple.JSONObject" %>
<%@ page import="org.json.simple.JSONArray" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>

<%
	JSONObject jsonObject = new JSONObject();
	jsonObject.put("id", "root");
	jsonObject.put("pw", "1234");
	jsonObject.put("tel", "010-1234-5678");

	JSONObject jsonObject2 = new JSONObject();
	jsonObject2.put("id", "root2");
	jsonObject2.put("pw", "12345");
	jsonObject2.put("tel", "010-1234-5678");

	JSONArray jsonArray = new JSONArray();
	jsonArray.add(jsonObject);
	jsonArray.add(jsonObject2);

	out.print(jsonArray.toJSONString());
%>
