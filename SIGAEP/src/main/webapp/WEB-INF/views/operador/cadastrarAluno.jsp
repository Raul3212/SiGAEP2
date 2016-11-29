<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<div class="row center col s12">
			<div class="icon-block">
				<h2 class="center green-text">
					<i class="large material-icons">person_add</i>
				</h2>
				<h5 class="center">Cadastra novo Aluno</h5>
			</div>
		</div>

		<form method="post" action="cadastrarAluno" class="col s12">
			<div class="card-panel light-green lighten-5">
				<h5>Dados Pessoais</h5>
				<div class="row">
					<div class="input-field col s12">
						<input id="nome" type="text" class="validate" name="nome">
						<label for="nome">Nome Completo</label>
					</div>
				</div>
				<div class="row">
					<div class="input-field col s12">
						<select name="escolaId">
							<option value="" disabled selected>Selecione Escola</option>
							<c:forEach var="escola" items="${escolas}">
								<option value="${escola.id}">${escola.nome}</option>
							</c:forEach>
						</select> <label>Escola</label>
					</div>
				</div>
				<div class="row">
					<div class="input-field col s12">
						<select name="curso">
							<option value="" disabled selected>Selecione Curso</option>
							<c:forEach var="curso" items="${cursos}">
								<option value="${curso.id}">${curso.nome}</option>
							</c:forEach>
						</select> <label>Curso Desejado</label>
					</div>
				</div>
			</div>
			<div class="card-panel blue lighten-5">
				<h5>Notas do 6º ano</h5>
				<div class="row">
									
					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano6Portugues">
						<label for="media6">Média em Português</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano6Artes">
						<label for="media7">Média em Artes</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano6EdFisica">
						<label for="media8">Média em Ed. Física</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano6Ingles">
						<label for="media8">Média em Inglês</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano6Historia">
						<label for="media8">Média em História</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano6Geografia">
						<label for="media8">Média em Geografia</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano6Ciencias">
						<label for="media8">Média em Ciências</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate"
							name="ano6Matematica"> <label for="media8">Média
							em Matemática</label>
					</div>
				</div>
			</div>
			<div class="card-panel red lighten-4">
				<h5>Notas do 7º ano</h5>
				<div class="row">

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano7Portugues">
						<label for="media6">Média em Português</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano7Artes">
						<label for="media7">Média em Artes</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano7EdFisica">
						<label for="media8">Média em Ed. Física</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano7Ingles">
						<label for="media8">Média em Inglês</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano7Historia">
						<label for="media8">Média em História</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano7Geografia">
						<label for="media8">Média em Geografia</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano7Ciencias">
						<label for="media8">Média em Ciências</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate"
							name="ano7Matematica"> <label for="media8">Média
							em Matemática</label>
					</div>
				</div>
			</div>
			<div class="card-panel yellow lighten-3">
				<h5>Notas do 8º ano</h5>
				<div class="row">

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano8Portugues">
						<label for="media6">Média em Português</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano8Artes">
						<label for="media7">Média em Artes</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano8EdFisica">
						<label for="media8">Média em Ed. Física</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano8Ingles">
						<label for="media8">Média em Inglês</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano8Historia">
						<label for="media8">Média em História</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano8Geografia">
						<label for="media8">Média em Geografia</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate" name="ano8Ciencias">
						<label for="media8">Média em Ciências</label>
					</div>

					<div class="input-field col">
						<input id="nome" type="text" class="validate"
							name="ano8Matematica"> <label for="media8">Média
							em Matemática</label>
					</div>
				</div>
			</div>

			<div class="card-panel teal lighten-5">
				<h5>Notas do 9º ano</h5>

				<div class="card-panel deep-purple lighten-4">
					<h5>1º bimestre</h5>
					<div class="row">

						<div class="input-field col">
							<input id="nome" type="text" class="validate"
								name="ano9Portugues1"> <label for="media6">Média
								em Português</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate" name="ano9Artes1">
							<label for="media7">Média em Artes</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate"
								name="ano9EdFisica1"> <label for="media8">Média
								em Ed. Física</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate" name="ano9Ingles1">
							<label for="media8">Média em Inglês</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate"
								name="ano9Historia1"> <label for="media8">Média
								em História</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate"
								name="ano9Geografia1"> <label for="media8">Média
								em Geografia</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate"
								name="ano9Ciencias1"> <label for="media8">Média
								em Ciências</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate"
								name="ano9Matematica1"> <label for="media8">Média
								em Matemática</label>
						</div>
					</div>
				</div>

				<div class="card-panel yellow lighten-5">
					<h5>2º bimestre</h5>
					<div class="row">

						<div class="input-field col">
							<input id="nome" type="text" class="validate"
								name="ano9Portugues2"> <label for="media6">Média
								em Português</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate" name="ano9Artes2">
							<label for="media7">Média em Artes</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate"
								name="ano9EdFisica2"> <label for="media8">Média
								em Ed. Física</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate" name="ano9Ingles2">
							<label for="media8">Média em Inglês</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate"
								name="ano9Historia2"> <label for="media8">Média
								em História</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate"
								name="ano9Geografia2"> <label for="media8">Média
								em Geografia</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate"
								name="ano9Ciencias2"> <label for="media8">Média
								em Ciências</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate"
								name="ano9Matematica2"> <label for="media8">Média
								em Matemática</label>
						</div>
					</div>
				</div>

				<div class="card-panel orange lighten-3">
					<h5>3º bimestre</h5>
					<div class="row">

						<div class="input-field col">
							<input id="nome" type="text" class="validate"
								name="ano9Portugues3"> <label for="media6">Média
								em Português</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate" name="ano9Artes3">
							<label for="media7">Média em Artes</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate"
								name="ano9EdFisica3"> <label for="media8">Média
								em Ed. Física</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate" name="ano9Ingles3">
							<label for="media8">Média em Inglês</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate"
								name="ano9Historia3"> <label for="media8">Média
								em História</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate"
								name="ano9Geografia3"> <label for="media8">Média
								em Geografia</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate"
								name="ano9Ciencias3"> <label for="media8">Média
								em Ciências</label>
						</div>

						<div class="input-field col">
							<input id="nome" type="text" class="validate"
								name="ano9Matematica3"> <label for="media8">Média
								em Matemática</label>
						</div>
					</div>
				</div>

			</div>

			<div class="row center">
				<div class="input-field col s12">
					<button class="btn waves-effect waves-light green" name="action"
						type="submit">Cadastrar</button>
				</div>
			</div>
		</form>

	</div>

	<%@include file="../scripts_include.jsp"%>
	<script type="text/javascript">
		$(document).ready(function() {
			$('select').material_select();
		});
	</script>
</body>


</html>