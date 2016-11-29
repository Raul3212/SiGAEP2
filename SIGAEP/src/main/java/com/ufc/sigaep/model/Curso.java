package com.ufc.sigaep.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Curso {

	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private String icone;
	
	@OneToMany(mappedBy = "curso", 
			cascade = CascadeType.REMOVE,
			fetch = FetchType.EAGER)
	private Collection<Aluno> alunos;
	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getIcone() {
		return icone;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setIcone(String icone) {
		this.icone = icone;
	}

	public Collection<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Collection<Aluno> alunos) {
		this.alunos = alunos;
	}
	
}
