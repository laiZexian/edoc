<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>增加电子文档</title>
    
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
    
    <!-- <td>${en.id} </td>
			<td>${en.title}</td>
			<td>${en.summary}</td>
			<td>${en.uploadUser}</td>
			<td>${en.createDate}</td> -->
    <form action="cate/update" method="post">
    <input type="hidden" name="categoryId" value="${entry.categoryId}" />
    <input type="hidden" name="id" value="${entry.id}" />
    <table border="1" width="500px">
    <tr><td colspan="2" align="center">更新电子文档</td></tr>
    	<tr>
    		<td>文档名称：</td>
    		<td><input type="text" name="title" value="${entry.title}"/> </td>
    	</tr>
    	<tr>
    		<td>文档摘要</td>
    		<td><input type="text" name="summary"  value="${entry.summary}"/> </td>
    	</tr>
    	<tr>
    		<td>上传人</td>
    		<td><input type="text" name="uploadUser" value="${entry.uploadUser}" /> </td>
    	</tr>
    	<tr>
    		<td>上传时间</td>
    		<td><input type="text" name="createDate" value="<fmt:formatDate value="${entry.createDate }" pattern="yyyy/MM/dd"/>" /> </td>
    	</tr>
    	<tr>
    		<td><input type="button" value="返回" /> </td>
    		
    		<td><input type="submit" value="提交" /> </td>
    	</tr>
    </table>
    </form>
  </body>
</html>
