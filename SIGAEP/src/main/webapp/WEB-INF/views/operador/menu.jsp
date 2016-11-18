<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<%@include file="../css_include.jsp"%>
<title>SIGAEP - ${usuario.nome}</title>
</head>
<body>
	<%@include file="nav_bar_operador.jsp"%>
	<div class="container">
		<div class="section">
			<div class="row">
				
				<div class="col s12 m3">
					
				</div>
				
				<div class="col s12 m3">
					<div class="icon-block">
						<a href="cadastrarAlunoPage" class="green-text">
							<h2 class="center green-text">
								<i class="large material-icons">person_add</i>
							</h2>
							<h5 class="center">Cadastrar Alunos</h5>
						</a>
					</div>
				</div>

				<div class="col s12 m3">
					<div class="icon-block">
						<a href="cadastrarEscolaPage" class="green-text">
							<h2 class="center green-text">
								<i class="large material-icons">school</i>
							</h2>
							<h5 class="center">Cadastrar Escolas</h5>
						</a>
					</div>
				</div>
			</div>
		</div>
		<br>
		<br>

		<div class="section"></div>
	</div>
	
	<%@include file="../scripts_include.jsp"%>
</body>


</html>