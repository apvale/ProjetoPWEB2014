<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Condomínio Feminino</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<script src="js/kickstart.js"></script> <!-- KICKSTART -->
	<link rel="stylesheet" href="design/css/kickstart.css" media="all" /> <!-- KICKSTART -->
	<link type="text/css" rel="stylesheet" href="design/css/projeto.css"/>
</head>
<body>
	<h1>Condomínio Feminino</h1>
	<hr>

	<div class="login">
		<div class="container">
	
			
			<form action="AutenticaServlet" method="post">
			<div class="col_4 column">
				<label for="login">Login: </label><br>
				<input id="login" type="text" name="login" />
				<br><br>
				
				<label for="senha">Senha: </label><br>
				<input id="senha" type="password" name="senha" />
				<br><br>
				
				<input class="button" type="submit" value="Entrar" name="entrar">
				<a class="button" href="inicio.html">Voltar</a>
				
			</div>
			
			
				
		
			</form>
		</div>
	</div>
	
	<div class="col_4">
			<div class="footer">
				<i id="iconecafe" class="icon-coffee"></i><p id="direitos">Projeto PWEB II - Amanda e Ana Paula</p>
			</div>
		</div>
	

</body>
</html>