package com.ufc.sigaep.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.mockito.internal.util.io.IOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ufc.sigaep.dao.ICursoDAO;
import com.ufc.sigaep.model.Curso;

@Controller
public class RootController {

	@Autowired
	private ICursoDAO cursoDao;
	
	@Autowired
	private ServletContext servletContext;
	
	@RequestMapping("/")
	public String home(HttpSession session){
		List<Curso> cursos = cursoDao.findAll();
		session.setAttribute("cursos", cursos);
		return "home";
	}
	
	@RequestMapping("/menuClassificacaoPublico")
	public String menuClassificacaoPublico(@RequestParam(name = "mensagem", required = false)String mensagem, HttpSession session, Model model){
		List<Curso> cursos = cursoDao.findAll();
		session.setAttribute("cursos", cursos);
		model.addAttribute("mensagem", mensagem);
		return "menuClassificacao";
	}
	
	@RequestMapping("/verPdfClassificacao")
	public String verPdfClassificacao(Long curso, ServletResponse response){
		
		Curso c = cursoDao.findOne(curso);
		String path = servletContext.getRealPath("/") + "/resources/pdf/" + c.getNome().replace(' ', '_') + ".pdf";
		File pdfFile = new File(path);
		if(pdfFile.exists()){
			FileInputStream fis;
			try {
				fis = new FileInputStream(path);
				IOUtils.copy(fis, response.getOutputStream());
				response.flushBuffer();
				response.setContentType("application/pdf");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		else{
			return "redirect:menuClassificacaoPublico?mensagem=Classificacao indisponivel. Tente novamente mais tarde.";
		}
		
	}
	
}
