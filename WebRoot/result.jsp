<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'result.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <table border="1">
      <tr>
        <td>书名</td>
        <td>价格</td>
      </tr>
      <%
      //获得查询价格
      Map<String,Integer> result=(Map<String,Integer>)request.getAttribute("result");
      //对查询结果进行循环，并输出查询结果
      for(Map.Entry<String,Integer> entry:result.entrySet()){
       %>
       <tr>
          <!-- 将当前元素的key插入到第一列的单元格中 -->
          <td><%=entry.getKey() %></td>
          <!-- 将当前元素的value值插入到第2列的单元格中 -->
          <td><%=entry.getValue() %></td>
       </tr>
       <%} %>
    </table>
  </body>
</html>
