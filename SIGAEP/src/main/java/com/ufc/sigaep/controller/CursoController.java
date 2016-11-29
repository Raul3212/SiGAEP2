package com.ufc.sigaep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ufc.sigaep.dao.ICursoDAO;
import com.ufc.sigaep.model.Curso;

@Controller
public class CursoController {

	@Autowired
	ICursoDAO cursoDao;
	
	@RequestMapping("/cadastrarCurso")
	public String cadastrarCurso(Curso curso){
		cursoDao.save(curso);
		return "redirect:menuGerente";
	}
	
}
