package com.ufc.sigaep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ufc.sigaep.dao.IEscolaDAO;
import com.ufc.sigaep.model.Escola;

@Controller
public class PaginasOperadorController {
	
	@Autowired
	IEscolaDAO escolaDao;

	@RequestMapping("/cadastrarEscolaPage")
	public String cadastrarEscolaPage(){
		return "operador/cadastrarEscola";
	}
	
	@RequestMapping("/menuOperador")
	public String menuGenrente(){
		return "operador/menu";
	}
	
	@RequestMapping("/cadastrarAlunoPage")
	public String cadastrarAlunoPage(Model model){
		List<Escola> escolas = escolaDao.findAll();
		model.addAttribute("escolas", escolas);
		return "operador/cadastrarAluno";
	}
	
}
