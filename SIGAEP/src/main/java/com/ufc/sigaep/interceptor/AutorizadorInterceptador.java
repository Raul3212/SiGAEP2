package com.ufc.sigaep.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.ufc.sigaep.model.Usuario;

@Component
public class AutorizadorInterceptador extends HandlerInterceptorAdapter {

	private String[] urls_liberadas = {"/", "home", "efetuarLogin", "loginFormulario", 
			"logout", ".png", ".gif"};
	
	private String[] urls_gerente = {"gerenciarUsuariosPage", "addUsuarioFormulario", "menuGerente", 
			"addUsuario", "deletarUsuario"};
	
	private String[] urls_operador = {"cadastrarEscolaPage", "menuOperador", "cadastrarAlunoPage", "cadastrarEscola", "cadastrarAluno"};
		
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		String uri = request.getRequestURI();
		
		if(urlTerminaCom(uri, urls_liberadas)) 
			return true;
		
		Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");
		
		if(usuario != null){
			if(usuario.getTipo() == Usuario.GERENTE)
				return urlTerminaCom(uri, urls_gerente);
			else if(usuario.getTipo() == Usuario.OPERADOR)
				return urlTerminaCom(uri, urls_operador);
		}
		
		response.sendRedirect("loginFormulario");
		return false;
	}
	
	private boolean urlTerminaCom(String uri, String[] urls){
		for(String s : urls){
			if(uri.endsWith(s)) return true;
		}
		return false;
	}
}
