<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/style.css" rel="stylesheet" type="text/css">
<title>Operaciones</title>
</head>
<body>
<h1>Prueba</h1>
	<form action="ServletOperaciones" method="post">
		<label>Input a number</label> <input type="text" name="txtNumber1" />
		<label>Input another number</label> <input type="text" name="txtNumber2" /> 
		<input type="submit" value="Acept">
	</form>
	<table>
<thead><th> Usuarios</th><th> Contraseña</th></thead>
<tbody>
	<% for (int i=1; i<100; i++) {
	out.println("<tr><td><input type=\"text\" name=\"admin"+i+"\" placeholder=\"admin"+i+"\"</td><td>admin"+i+"</td> </tr>");
		}%>
</tbody>
</table>
	
	
</body>
</html>