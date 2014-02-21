<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Cadastro de Condôminos</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<script src="js/kickstart.js"></script> <!-- KICKSTART -->
	<link rel="stylesheet" href="design/css/kickstart.css" media="all" /> <!-- KICKSTART -->
	<link type="text/css" rel="stylesheet" href="design/css/projeto.css"/>
	</head>
	<body>
		<a style="text-decoration: none;" href="inicio.html"><h1>Condomínio Feminino</h1></a>
		<hr class="alt2" />
			
	
	<div class="container">
	
			<p id="instrucaocadastro">Cadastro de Condômino</p>
			<form action="CadastraCondominoServlet" method="post">
			<div class="col_4 column">
				<label for="proprietario">Proprietário: </label>
				<input id="proprietario" type="text" name="nomeproprietario"/>
				<br><br>
				
				<label for="apto">Apto: </label>
				<input id="apto" type="text" name="apto" />
				<br><br>
				
				<label for="telefone">Telefone: </label>
				<input id="telefone" type="text" name="telefone"/>
				<br><br>
				
				<label for="email">E-mail: </label>
				<input id="email" type="text" name="email" />
				<br><br>
				
				<label for="moradores_unidade">N.º de moradores: </label>
				<input id="moradores_unidade" type="text" name="moradoresunidade"/><br><br>
				
				<label for="loginCondomino">Login:</label>
				<input id="loginCondomino" type="text" name="loginCondomino"/><br><br>
				
				<label for="senhaCondomino">Senha: </label>
				<input id="senhaCondomino" type="password" name="senhaCondomino"/><br><br>
				
				<input class="button" type="submit" value="Cadastrar" name="cdCondomino">
				<a class="button" href="inicio.html">Cancelar</a>
				<a class="button" href="inicio.html">Voltar</a>
				
			</div>
			
			
				
		
			</form>
		</div>
		<div class="col_4">
			<div class="footer">
				<i id="iconecafe" class="icon-coffee"></i><p id="direitos">Projeto PWEB II - Amanda e Ana Paula</p>
			</div>
		</div>
	</body>
</html>