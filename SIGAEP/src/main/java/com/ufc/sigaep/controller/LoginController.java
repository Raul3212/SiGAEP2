package com.ufc.sigaep.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ufc.sigaep.dao.IUsuarioDAO;
import com.ufc.sigaep.model.Usuario;
import com.ufc.sigaep.util.SigaepCripUtil;

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
			if(logar(candidatos.get(0), usuario)){
				session.setAttribute("usuario", candidatos.get(0));
				if(usuario.getTipo() == Usuario.OPERADOR)
					return "operador/menu";
				else if(usuario.getTipo() == Usuario.GERENTE)
					return "gerente/menu";
			}
		}
		
		return "redirect:loginFormulario";
	}
	
	private boolean logar(Usuario candidado, Usuario usuario){
		String senhaHash = SigaepCripUtil.hashSenha(usuario.getSenha());
		return candidado.getSenha().equals(senhaHash) && candidado.getTipo() == usuario.getTipo();
	}
	
	@RequestMapping("/logout")
	public String efetuarLogout(HttpSession session){
		session.invalidate();
		return "redirect:/";
	}
	
}
