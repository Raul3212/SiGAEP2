<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
	<%@include file="../css_include.jsp" %>
  	<title>SIGAEP - Quixadá</title>
  </head>
  <body>
    <%@include file="nav_bar_gerente.jsp" %>
  	<div class="container">
  		<br>
  		<a href="addUsuarioFormulario" class="waves-effect waves-light btn green right"><i class="large material-icons left">add</i>Adicionar Usuário</a>
		
		<c:if test="${fn:length(usuarios) > 0}">
			<table>
				<thead>
			    	<tr>
			        	<th data-field="id">Nome</th>
			            <th data-field="name">Login</th>
			        </tr>
			 	</thead>
			
			    <tbody>
					<c:forEach var="usuario" items="${usuarios}">
						<tr>
							<td>${usuario.nome}</td>
							<td>${usuario.login}</td>
							<td><a href="deletarUsuario?id=${usuario.id}" class="waves-effect waves-light btn red"><i class="large material-icons left">delete_forever</i>Excluir</a></td>
						</tr>    
					</c:forEach>
				</tbody>
			</table>
		</c:if>		    
	</div>
	
  	<%@include file="../scripts_include.jsp" %>
  </body>
  
  
</html>