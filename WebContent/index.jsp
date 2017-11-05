<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
	if(request.getAttribute("cateList")==null)
	response.sendRedirect("cate/list");
 %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>电子文档列表</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
	<script type="text/javascript" >
		function dele(){
			return confirm("确定删除文当吗？");
		}
		$(function(){
			$("#btn").click(function(){
				var cateId =$("[name='categoryId']").val();
				if (cateId==='0') {
					alert("请选择分类！");
					return;
				}
				location="cate/into?cateId="+cateId;
			});
		});
	</script>
	
  </head>
  
  <body>
   
    <form action="cate/list" method="get">
		<label >文档分类</label>
		
			  <select name="categoryId"  >
				<c:if test=" ${cateList != null }">
				   <option value="0">--请选择--</option>
				   <c:forEach var="cate" items="${cateList}">
				   		<option <c:if test="${cate.id == queryCateId }" >selected="selected"</c:if>
				   		value="${cate.id}">${cate.name}</option>
				   </c:forEach>
				</c:if>
			</select>
			<input type="submit" value="查询" />
			</form>
	<label class="control-label col-md-3 col-sm-3 col-xs-12"><input type="button"value="新增电子文档" id="btn"/></label>
	</div>
	<div>
	<table border="1" width="900px">
		<tr>
			<td colspan="6" align="center"><h1>电子文档列表</h1></td>
			
		</tr>
		<tr>
			<td>文档编号</td>
			<td>文档名称</td>
			<td>文档摘要</td>
			<td>上传人</td>
			<td>上传时间</td>
			<td>操作</td>
		</tr>
		<c:forEach var="en" items="${entryList}">
			<tr>
			<td>${en.id} </td>
			<td>${en.title}</td>
			<td>${en.summary}</td>
			<td>${en.uploadUser}</td>
			<td><fmt:formatDate value="${en.createDate }" pattern="yyyy/MM/dd"/></td>
			<td><a href="cate/one?id=${en.id}">修改</a><a href="cate/del/${en.id}" onclick="return dele()">删除</a></td>
		</tr>	   		
		 </c:forEach>
	</table>
	
  </body>
</html>
