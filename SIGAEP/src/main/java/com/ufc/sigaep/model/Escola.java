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
public class Escola {
	
	@Id
	@Column(nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	
	@OneToMany(mappedBy = "escola", 
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
	public Collection<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(Collection<Aluno> alunos) {
		this.alunos = alunos;
	}
	
}
