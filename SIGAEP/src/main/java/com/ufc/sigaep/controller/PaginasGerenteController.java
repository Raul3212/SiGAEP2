package com.ufc.sigaep.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ufc.sigaep.dao.ICursoDAO;
import com.ufc.sigaep.dao.IUsuarioDAO;
import com.ufc.sigaep.model.Curso;
import com.ufc.sigaep.model.Usuario;

@Controller
public class PaginasGerenteController {
	
	@Autowired
	IUsuarioDAO usuarioDao;
	
	@Autowired
	ICursoDAO cursoDao;
	
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
	
	@RequestMapping("/addCursoFormulario")
	public String addCursoFormuario(){
		return "gerente/cadastrarCurso";
	}
	
	@RequestMapping("/menuGerente")
	public String menuGenrente(){
		return "gerente/menu";
	}
	
	@RequestMapping("/menuClassificacao")
	public String menuClassficacao(HttpSession session){
		List<Curso> cursos = cursoDao.findAll();
		session.setAttribute("cursos", cursos);
		return "gerente/menuClassificacao";
	}
	
}
