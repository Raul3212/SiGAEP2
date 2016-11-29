package com.ufc.sigaep.controller;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.action.PdfRendition;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.ufc.sigaep.dao.IAlunoDAO;
import com.ufc.sigaep.dao.IEscolaDAO;
import com.ufc.sigaep.model.Aluno;
import com.ufc.sigaep.model.Escola;
import com.ufc.sigaep.model.TuplaClassificacao;

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
	
	/*@RequestMapping("/gerarClassificacao")
	public String gerarClassificacaoAdministracao(int curso){
		List<TuplaClassificacao> alunos = alunoDao.selectClassificacaoPorCurso(curso);
		
		for(TuplaClassificacao t : alunos){
			System.out.println(t);
		}
		
		PdfWriter writer;
		try {
			writer = new PdfWriter("");
			PdfDocument pdf = new PdfDocument(writer);
			Document document = new Document(pdf);
			
			document.add(new Paragraph("Hello World!!!"));
			
			document.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "";
		
	}*/
	
}
