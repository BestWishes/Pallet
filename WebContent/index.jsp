<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="WEB-INF/views/comm/comm.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/user/user.js"></script>
</head>
<body>
	<div class="easyui-panel" title="login">
		<form action="user/login" method="post" id="userlogin_form">
			<table id="userlogin_table">
				<tbody>
					<tr>
						<td align="left">userName:</td>
						<td><input class="easyui-validatebox" data-options="required:true" type="text" id="name" name="name"/></td>
					</tr>
					<tr>
						<td align="left">password:</td>
						<td><input class="easyui-textbox" type="password" id="password" name="password"/></td>
					</tr>
				</tbody>
			</table>
			<button class="easyui-linkbutton" type="submit">login</button>
		</form>
	</div>
</body>
</html>