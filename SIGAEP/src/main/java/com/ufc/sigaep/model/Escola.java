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
	
	public static final int PUBLICA = 1;
	public static final int PARTICULAR = 2;
	
	@Id
	@Column(nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	
	@Column(nullable=false)
	private int tipo;
	
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
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public Collection<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(Collection<Aluno> alunos) {
		this.alunos = alunos;
	}
	
}
