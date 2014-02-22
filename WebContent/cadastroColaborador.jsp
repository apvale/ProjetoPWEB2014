<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Cadastro de Colaboradores</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<script src="js/kickstart.js"></script> <!-- KICKSTART -->
	<link rel="stylesheet" href="design/css/kickstart.css" media="all" /> <!-- KICKSTART -->
	<link type="text/css" rel="stylesheet" href="design/css/projeto.css"/>
	</head>
	<body>
		<a style="text-decoration: none;" href="inicio.html"><h1>Palace Jampa</h1></a>
		<hr class="alt2" />
			
	
	<div class="container">
	
			<p id="instrucaocadastro">Cadastro de Colaborador</p>
			<form action="CadastraColaboradorServlet" method="post">
			<div class="col_4 column">
				<label for="nomeColaborador">Nome: </label><br>
				<input id="nomeColaborador" type="text" />
				<br><br>
				
				<label for="profissao">Profissão: </label><br>
				<input id="profissao" type="text" />
				<br><br>
				
				<label for="empresa">Empresa: </label><br>
				<input id="empresa" type="text" />
				<br><br>
				
				<label for="telefone">Telefone: </label><br>
				<input id="telefone" type="text" />
				<br><br>
				
				<label for="horario_atendimento">Horário de Atendimento: </label><br>
				<input id="horario_atendimento" type="text" /><br><br>
				
				<input type="submit" value="Cadastrar" name="cdColaborador">
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