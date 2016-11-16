<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   	<meta charset="utf-8">
	<meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>SiGAEP - Quixadá</title>
	<%@include file="css_include.jsp" %>
  </head>
  <body>
    <%@include file="nav_bar_menu.jsp" %>
    <div class="row">
    
    		<div class="row center col s12">
    			<div class="icon-block">
		            <h2 class="center green-text"><i class="large material-icons">lock</i></h2>
		            <h5 class="center">Área Administrativaa</h5>
		            <p class="light">
		            	Você precisa realizar login para acessar essa área.
		            </p>
	          	</div>
    		</div>
			
			<form method="post" action="efetuarLogin" class="col s12">
				<div class="row">
					<div class="input-field col s12">
					    <select name="tipo">
					     	<option value="" disabled selected>Selecione opção</option>
					     	<option value="1">Operador</option>
					      	<option value="2">Gerente</option>
					    </select>
					    <label>Tipo de Usuário</label>
					</div>
				</div>
				<div class="row">
			       	<div class="input-field col s12">
			          <input id="login" type="text" class="validate" name="login">
			          <label for="login">Login</label>
			        </div>
			   	</div>
				
				<div class="row">
			        <div class="input-field col s12">
			          <input id="password" type="password" class="validate" name="senha">
			          <label for="password">Senha</label>
			        </div>
			    </div>	
				
				<div class="row center">
				 	<div class="input-field col s12">
						<button class="btn waves-effect waves-light green" name="action" type="submit">Entrar</button>
					</div>
				</div>
			</form>			
		</div>
    <%@include file="scripts_include.jsp" %>
       
    <script type="text/javascript">
    $(document).ready(function() {
      $('select').material_select();
    });
    </script>
  </body>
</html>