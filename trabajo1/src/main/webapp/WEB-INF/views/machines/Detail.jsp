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
<title>Machine Detail</title>
</head>
<body>

	<div class="col-md-7 col-md-offset-3">
		<br/>
		<br/>
		<strong><p align="center" >Machine Detail</p></strong>
		
<form action="http://localhost:8080/trabajo1/machines/Detail" method="get" >
		
	<table  class="table" >
		<br/>
		<br/>

		<c:forEach var= "item" items="${machines}">
			<input id="id" name="id" type="hidden"  value="${item.id}"></input>
			<tr >
				<td rowspan="6" valign="middle">
					<img src="<%=request.getContextPath()%>${item.imageMachine}" height="300px" width="300px" align="left" />
				</td>
			</tr>
			<tr>
				<td>
					<strong><font color="#3e6ae3" size="3">	${item.nameMachine } </font></strong>
				</td>
			</tr>
			<tr>
				<td >
				
					
					<strong><font color="#b20000">Price: $${item.priceMachine } </font></strong>
				</td>	
			</tr>
			<tr>
				<td >	
			    	<c:set var="result" value="${item.priceMachine}"/>
					<strong><font color="#b20000">You Save: $ (${item.discountMachine }%) </font></strong>
				</td>	
			</tr>
			<tr>
				<td >	
					<strong><font >Description: </font></strong>
				</td>	
			</tr>			
			<tr>
				<td >	
					<font >${item.descriptionMachine } </font>
				</td>	
			</tr>

		</c:forEach>

	</table>
	</form>
	</div>
</body>
</html>
