package com.ufc.sigaep.model;

public class TuplaClassificacao {

	private String nomeAluno;
	private String nomEscola;
	private double mediaFinal;
	
	public TuplaClassificacao(String nomeAluno, String nomEscola, double mediaFinal) {
		this.nomeAluno = nomeAluno;
		this.nomEscola = nomEscola;
		this.mediaFinal = mediaFinal;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public String getNomEscola() {
		return nomEscola;
	}
	public double getMediaFinal() {
		return mediaFinal;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public void setNomEscola(String nomEscola) {
		this.nomEscola = nomEscola;
	}
	public void setMediaFinal(double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}
	public String toString(){
		return this.nomEscola + " - " + nomeAluno + " - " + mediaFinal;
	}
}
