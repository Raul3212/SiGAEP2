package com.ufc.sigaep.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ufc.sigaep.dao.IUsuarioDAO;
import com.ufc.sigaep.model.Usuario;

@Controller
public class LoginController {

	@Autowired
	private IUsuarioDAO usuarioDao;
		
	@RequestMapping("loginFormulario")
	public String loginFormulario(){
		return "login";
	}
	
	@RequestMapping("/efetuarLogin")
	public String efetuarLogin(Usuario usuario, HttpSession session){
		
		List<Usuario> candidatos = usuarioDao.findByLoginLike(usuario.getLogin());
		if(!candidatos.isEmpty()){
			if(candidatos.get(0).getSenha().equals(usuario.getSenha()) 
					&& candidatos.get(0).getTipo() == usuario.getTipo()){
				session.setAttribute("usuario", candidatos.get(0));
				if(usuario.getTipo() == 1)
					return "operador/menu";
				else if(usuario.getTipo() == 2)
					return "gerente/menu";
			}
		}
		
		return "redirect:loginFormulario";
	}
	
	@RequestMapping("/logout")
	public String efetuarLogout(HttpSession session){
		session.invalidate();
		return "home";
	}
	
}
