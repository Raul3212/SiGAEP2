<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<%@include file="css_include.jsp"%>
<title>SIGAEP - Quixadá</title>
</head>
<body>
	<%@include file="nav_bar_menu.jsp"%>
	<div class="section no-pad-bot" id="index-banner">
		<div class="container">
			<br> <br>
			<h1 class="header center yellow-text text-darken-2">EEEP. Maria
				Cavalcante Costa</h1>
			<div class="row center">
				<h5 class="header col s12 light">Lorem ipsum dolor sit amet,
					consectetur adipiscing elit. Vivamus porttitor gravida odio, sed
					porta nisl vulputate non. Etiam mi lectus, tempor sit amet
					hendrerit ac, malesuada eu lacus. Nam porttitor vehicula lacus in
					pharetra.</h5>
			</div>
			<div class="row center">
				<a href="menuClassificacaoPublico"
					class="btn-large waves-effect waves-light yellow darken-2">Ver
					resultados</a>
			</div>
			<br> <br>

		</div>
	</div>

	<div class="container">
		<div class="section">
			<div class="row">
				<c:forEach var="curso" items="${cursos}">
					<div class="col s12 m3">
						<div class="icon-block">
							<h2 class="center green-text">
								<i class="large material-icons">${curso.icone}</i>
							</h2>
							<h5 class="center">${curso.nome}</h5>
							<p class="light">${curso.descricao}</p>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>


	<%@include file="footer.jsp"%>
	<%@include file="scripts_include.jsp"%>
	<script>
		$(".button-collapse").sideNav();
	</script>
</body>


</html>