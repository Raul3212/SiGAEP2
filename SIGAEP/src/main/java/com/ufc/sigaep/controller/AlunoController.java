package com.ufc.sigaep.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.async.TimeoutDeferredResultProcessingInterceptor;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.action.PdfRendition;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.TextAlignment;
import com.ufc.sigaep.dao.IAlunoDAO;
import com.ufc.sigaep.dao.ICursoDAO;
import com.ufc.sigaep.dao.IEscolaDAO;
import com.ufc.sigaep.model.Aluno;
import com.ufc.sigaep.model.Curso;
import com.ufc.sigaep.model.Escola;
import com.ufc.sigaep.model.TuplaClassificacao;

@Controller
public class AlunoController {

	@Autowired
	private IAlunoDAO alunoDao;
	@Autowired
	private IEscolaDAO escolaDao;
	@Autowired
	private ICursoDAO cursoDao;
	
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
	
	@RequestMapping("/gerarClassificacao")
	public void gerarClassificacaoAdministracao(Long curso, HttpServletResponse response){
		List<Aluno> alunos = alunoDao.findByCursoIdOrderByMediaFinalDesc(curso);
		Curso c = cursoDao.findOne(curso);
		PdfWriter writer;
		try {
			writer = new PdfWriter(response.getOutputStream());
			PdfDocument pdf = new PdfDocument(writer);
			Document document = new Document(pdf);
			
			Table table = new Table(3);
			table.setTextAlignment(TextAlignment.CENTER);
			table.addCell("ESCOLA");
			table.addCell("ALUNO");
			table.addCell("MÉDIA FINAL");
			for(Aluno a : alunos){
				table.addCell(a.getEscola().getNome());
				table.addCell(a.getNome());
				table.addCell(String.valueOf(a.getMediaFinal()));
			}
			
			Paragraph nomeEscola = new Paragraph("EEEP. MARIA CAVALCANTE COSTA");
			nomeEscola.setTextAlignment(TextAlignment.CENTER);
			nomeEscola.setFontSize(16);
			document.add(nomeEscola);
			
			Paragraph titulo = new Paragraph("CLASSIFICAÇÃO GERAL PARA O CURSO DE " + c.getNome().toUpperCase());
			titulo.setTextAlignment(TextAlignment.CENTER);
			titulo.setFontSize(14);
			document.add(titulo);
			
			document.add(table);
			
			document.close();
			response.setContentType("application/pdf");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
