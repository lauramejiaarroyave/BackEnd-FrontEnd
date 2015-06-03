<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

    <%@ page isELIgnored = "false" %>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>




<link rel ="stylesheet" type="text/css" href="../lib/bootstrap/css/bootstrap.css"/>
<script type="text/javascript" src="../lib/bootstrap/js/bootstrap.js">
<!--

//-->
</script>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Machines List</title>
</head>
<body>

	<div class="col-md-7 col-md-offset-3">
		<br/>
		<br/>
		<strong><p align="center" >Machines List</p></strong>
		
<form >
		
	<table  class="table" >
		<br/>
		<br/>

		<c:forEach var= "item" items="${machines}">
			<input id="id" name="id" type="hidden"  value="${item.id}"></input>
			<tr >
				<td rowspan="4" valign="middle">
					<img src="<%=request.getContextPath()%>${item.imageMachine}" height="150px" width="150px" align="left" />
				</td>
			</tr>
			<tr>
				<td>
					<strong><font color="#3e6ae3" size="3">	${item.nameMachine } </font></strong>
				</td>
			</tr>
			<tr>
				<td >	
					<strong><font color="#b20000">$${item.priceMachine } </font></strong>
				</td>
				<td  bgcolor="#FF8000" width="120px" align="center">
					<a href="http://localhost:8080/trabajo1/machines/Detail?id=${item.id }"><font color="white" size="3">View Detail</font></a>
				</td>	
			</tr>
			<tr>
				<td>
					<small>In Stock. Offered By Amazon.com</small>
				</td>

			</tr>


		</c:forEach>

	</table>
	</form>
	</div>
</body>
</html>
