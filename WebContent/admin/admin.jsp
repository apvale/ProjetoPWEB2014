<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Área Administrador</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="js/kickstart.js"></script>
<!-- KICKSTART -->
<link rel="stylesheet" href="design/css/kickstart.css" media="all" />
<!-- KICKSTART -->
<link type="text/css" rel="stylesheet" href="design/css/projeto.css" />
</head>
<body>

	<a style="text-decoration: none;" href="inicio.html"><h1>Palace
			Jampa</h1></a>
	<hr class="alt2" />

	<div class="container">

		<p id="instrucaocadastro">
			Olá, Sr(a)
			<c:out value="${admin.nome}" />
		</p>

		<div class="col_6">
			<ul class="menu">
				<li class="current"><a href="listacondominos.jsp">Condôminos</a></li>
				<li><a href="listacolaboradores.jsp">Colaboradores</a></li>
				<li><a href="pagamentos.jsp">Pagamentos</a>
			</ul>
		</div>





		<div class="col_4">
			<div class="footer">
				<i id="iconecafe" class="icon-coffee"></i>
				<p id="direitos">Projeto PWEB II - Amanda e Ana Paula</p>
			</div>
		</div>
	</div>



</body>
</html>