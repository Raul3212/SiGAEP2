package com.ufc.sigaep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ufc.sigaep.dao.IUsuarioDAO;
import com.ufc.sigaep.model.Usuario;

@Controller
public class PaginasGerenteController {
	
	@Autowired
	IUsuarioDAO usuarioDao;
	
	@RequestMapping("/gerenciarUsuariosPage")
	public String gerenciarUsuariosPage(Model model){
		List<Usuario> usuarios = usuarioDao.findByTipoLike(Usuario.OPERADOR);
		model.addAttribute("usuarios", usuarios);
		return "gerente/gerenciarUsuarios";
	}

	@RequestMapping("/addUsuarioFormulario")
	public String addUsuarioFormulario(){
		return "gerente/addUsuario";
	}
	
	@RequestMapping("/menuGerente")
	public String menuGenrente(){
		return "gerente/menu";
	}
	
}
