<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<%@include file="css_include.jsp"%>
<title>SIGAEP - Quixadá</title>
<script type="text/javascript" src="js/app.js"></script>
</head>
<body>
	<!-- Modal Structure -->
	<div id="modelMensagem" class="modal">
		<div class="modal-content">
			<h4>${mensagem}</h4>
		</div>
		<div class="modal-footer">
			<a href="#!"
				class=" modal-action modal-close waves-effect waves-green btn-flat">Ok</a>
		</div>
	</div>

	<%@include file="nav_bar_menu.jsp"%>
	<div class="container">
		<div class="section">
			<h5>Selecione o curso:</h5>
			<div class="row">
				<c:forEach var="curso" items="${cursos}">
					<div class="col s12 m3">
						<div class="icon-block">
							<a href="verPdfClassificacao?curso=${curso.id}"
								class="green-text">
								<h2 class="center green-text">
									<i class="large material-icons">${curso.icone}</i>
								</h2>
								<h5 class="center">${curso.nome}</h5>
							</a>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>

	<%@include file="scripts_include.jsp"%>
	
	<script type="text/javascript">
		$(document).ready(function(){
			$('.modal').modal();
		    var mensagem = GET('mensagem');
		    if(mensagem != null){
		    	$('#modelMensagem').modal('open');
		    }
		});
	</script>
	
</body>


</html>