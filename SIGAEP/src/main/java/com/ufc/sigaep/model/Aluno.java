package com.ufc.sigaep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Aluno {

	@Id
	@Column(nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "escola_id")
	private Escola escola;
	
	@Column(name = "escola_id", updatable = false, insertable = false)
	private Long escolaId;
	
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
	public Escola getEscola() {
		return escola;
	}
	public Long getEscolaId() {
		return escolaId;
	}
	public void setEscola(Escola escola) {
		this.escola = escola;
	}
	public void setEscolaId(Long escolaId) {
		this.escolaId = escolaId;
	}
		
}
