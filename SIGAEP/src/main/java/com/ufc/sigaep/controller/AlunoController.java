package com.ufc.sigaep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ufc.sigaep.dao.IAlunoDAO;
import com.ufc.sigaep.dao.IEscolaDAO;
import com.ufc.sigaep.model.Aluno;
import com.ufc.sigaep.model.Escola;

@Controller
public class AlunoController {

	@Autowired
	private IAlunoDAO alunoDao;
	@Autowired
	private IEscolaDAO escolaDao;
	
	@RequestMapping("/cadastrarAluno")
	public String cadastrarAluno(Aluno aluno){
		Escola escola = escolaDao.findOne(aluno.getEscolaId());
		aluno.setEscola(escola);
		
		System.out.println(aluno.getEscolaId());
		
		//Calcula e seta todas as médias para o aluno
		Aluno.calcularNotas(aluno);
		
		alunoDao.save(aluno);
		return "redirect:menuOperador";
	}
	
	
}
