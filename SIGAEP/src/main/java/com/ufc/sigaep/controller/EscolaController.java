package com.ufc.sigaep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ufc.sigaep.dao.IEscolaDAO;
import com.ufc.sigaep.model.Escola;

@Controller
public class EscolaController {
	
	@Autowired
	private IEscolaDAO escolaDao;
	
	@RequestMapping("/cadastrarEscola")
	public String cadastrarEscola(Escola escola){
		escolaDao.save(escola);
		return "operador/menu";
	}
	
}
