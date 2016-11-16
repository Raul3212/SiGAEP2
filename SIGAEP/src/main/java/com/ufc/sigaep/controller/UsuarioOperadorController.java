package com.ufc.sigaep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ufc.sigaep.dao.IUsuarioDAO;
import com.ufc.sigaep.model.Usuario;

@Controller
public class UsuarioOperadorController {

	@Autowired
	private IUsuarioDAO usuarioDao;
	
	@RequestMapping("/addUsuario")
	public String addUsuario(Usuario usuario){
		usuarioDao.save(usuario);
		return "redirect:gerenciarUsuariosPage";
	}
	
	@RequestMapping("/deletarUsuario")
	public String deletarUsuario(Long id){
		usuarioDao.delete(id);
		return "redirect:gerenciarUsuariosPage";
	}
	
}
