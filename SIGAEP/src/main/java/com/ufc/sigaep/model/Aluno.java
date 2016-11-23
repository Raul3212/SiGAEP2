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
	
	//Médias para 6, 7 e 8 anos
	private float ano6Portugues, ano6Artes, ano6EdFisica, ano6Historia, ano6Geografia, ano6Ciencias, ano6Matematica;
	private float ano7Portugues, ano7Artes, ano7EdFisica, ano7Historia, ano7Geografia, ano7Ciencias, ano7Matematica;
	private float ano8Portugues, ano8Artes, ano8EdFisica, ano8Historia, ano8Geografia, ano8Ciencias, ano8Matematica;
	
	//Médias BIMESTRAIS para 9 ano
	private float ano9Portugues1, ano9Artes1, ano9EdFisica1, ano9Historia1, ano9Geografia1, ano9Ciencias1, ano9Matematica1;
	private float ano9Portugues2, ano9Artes2, ano9EdFisica2, ano9Historia2, ano9Geografia2, ano9Ciencias2, ano9Matematica2;
	private float ano9Portugues3, ano9Artes3, ano9EdFisica3, ano9Historia3, ano9Geografia3, ano9Ciencias3, ano9Matematica3;
	
	//Médias para 9 ano
	private float ano9Portugues, ano9Artes, ano9EdFisica, ano9Historia, ano9Geografia, ano9Ciencias, ano9Matematica;
	
	//Médias para cada área
	private float mediaLinguagens, mediaCienciasHumanas, mediaCienciasNaturais, mediaMatematica;
	
	//Média final
	private float mediaFinal;
	
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
	public float getAno6Portugues() {
		return ano6Portugues;
	}
	public float getAno6Artes() {
		return ano6Artes;
	}
	public float getAno6EdFisica() {
		return ano6EdFisica;
	}
	public float getAno6Historia() {
		return ano6Historia;
	}
	public float getAno6Geografia() {
		return ano6Geografia;
	}
	public float getAno6Ciencias() {
		return ano6Ciencias;
	}
	public float getAno6Matematica() {
		return ano6Matematica;
	}
	public float getAno7Portugues() {
		return ano7Portugues;
	}
	public float getAno7Artes() {
		return ano7Artes;
	}
	public float getAno7EdFisica() {
		return ano7EdFisica;
	}
	public float getAno7Historia() {
		return ano7Historia;
	}
	public float getAno7Geografia() {
		return ano7Geografia;
	}
	public float getAno7Ciencias() {
		return ano7Ciencias;
	}
	public float getAno7Matematica() {
		return ano7Matematica;
	}
	public float getAno8Portugues() {
		return ano8Portugues;
	}
	public float getAno8Artes() {
		return ano8Artes;
	}
	public float getAno8EdFisica() {
		return ano8EdFisica;
	}
	public float getAno8Historia() {
		return ano8Historia;
	}
	public float getAno8Geografia() {
		return ano8Geografia;
	}
	public float getAno8Ciencias() {
		return ano8Ciencias;
	}
	public float getAno8Matematica() {
		return ano8Matematica;
	}
	public float getAno9Portugues1() {
		return ano9Portugues1;
	}
	public float getAno9Artes1() {
		return ano9Artes1;
	}
	public float getAno9EdFisica1() {
		return ano9EdFisica1;
	}
	public float getAno9Historia1() {
		return ano9Historia1;
	}
	public float getAno9Geografia1() {
		return ano9Geografia1;
	}
	public float getAno9Ciencias1() {
		return ano9Ciencias1;
	}
	public float getAno9Matematica1() {
		return ano9Matematica1;
	}
	public float getAno9Portugues2() {
		return ano9Portugues2;
	}
	public float getAno9Artes2() {
		return ano9Artes2;
	}
	public float getAno9EdFisica2() {
		return ano9EdFisica2;
	}
	public float getAno9Historia2() {
		return ano9Historia2;
	}
	public float getAno9Geografia2() {
		return ano9Geografia2;
	}
	public float getAno9Ciencias2() {
		return ano9Ciencias2;
	}
	public float getAno9Matematica2() {
		return ano9Matematica2;
	}
	public float getAno9Portugues3() {
		return ano9Portugues3;
	}
	public float getAno9Artes3() {
		return ano9Artes3;
	}
	public float getAno9EdFisica3() {
		return ano9EdFisica3;
	}
	public float getAno9Historia3() {
		return ano9Historia3;
	}
	public float getAno9Geografia3() {
		return ano9Geografia3;
	}
	public float getAno9Ciencias3() {
		return ano9Ciencias3;
	}
	public float getAno9Matematica3() {
		return ano9Matematica3;
	}
	public float getAno9Portugues() {
		return ano9Portugues;
	}
	public float getAno9Artes() {
		return ano9Artes;
	}
	public float getAno9EdFisica() {
		return ano9EdFisica;
	}
	public float getAno9Historia() {
		return ano9Historia;
	}
	public float getAno9Geografia() {
		return ano9Geografia;
	}
	public float getAno9Ciencias() {
		return ano9Ciencias;
	}
	public float getAno9Matematica() {
		return ano9Matematica;
	}
	public float getMediaLinguagens() {
		return mediaLinguagens;
	}
	public float getMediaCienciasHumanas() {
		return mediaCienciasHumanas;
	}
	public float getMediaCienciasNaturais() {
		return mediaCienciasNaturais;
	}
	public float getMediaMatematica() {
		return mediaMatematica;
	}
	public float getMediaFinal() {
		return mediaFinal;
	}
	public void setAno6Portugues(float ano6Portugues) {
		this.ano6Portugues = ano6Portugues;
	}
	public void setAno6Artes(float ano6Artes) {
		this.ano6Artes = ano6Artes;
	}
	public void setAno6EdFisica(float ano6EdFisica) {
		this.ano6EdFisica = ano6EdFisica;
	}
	public void setAno6Historia(float ano6Historia) {
		this.ano6Historia = ano6Historia;
	}
	public void setAno6Geografia(float ano6Geografia) {
		this.ano6Geografia = ano6Geografia;
	}
	public void setAno6Ciencias(float ano6Ciencias) {
		this.ano6Ciencias = ano6Ciencias;
	}
	public void setAno6Matematica(float ano6Matematica) {
		this.ano6Matematica = ano6Matematica;
	}
	public void setAno7Portugues(float ano7Portugues) {
		this.ano7Portugues = ano7Portugues;
	}
	public void setAno7Artes(float ano7Artes) {
		this.ano7Artes = ano7Artes;
	}
	public void setAno7EdFisica(float ano7EdFisica) {
		this.ano7EdFisica = ano7EdFisica;
	}
	public void setAno7Historia(float ano7Historia) {
		this.ano7Historia = ano7Historia;
	}
	public void setAno7Geografia(float ano7Geografia) {
		this.ano7Geografia = ano7Geografia;
	}
	public void setAno7Ciencias(float ano7Ciencias) {
		this.ano7Ciencias = ano7Ciencias;
	}
	public void setAno7Matematica(float ano7Matematica) {
		this.ano7Matematica = ano7Matematica;
	}
	public void setAno8Portugues(float ano8Portugues) {
		this.ano8Portugues = ano8Portugues;
	}
	public void setAno8Artes(float ano8Artes) {
		this.ano8Artes = ano8Artes;
	}
	public void setAno8EdFisica(float ano8EdFisica) {
		this.ano8EdFisica = ano8EdFisica;
	}
	public void setAno8Historia(float ano8Historia) {
		this.ano8Historia = ano8Historia;
	}
	public void setAno8Geografia(float ano8Geografia) {
		this.ano8Geografia = ano8Geografia;
	}
	public void setAno8Ciencias(float ano8Ciencias) {
		this.ano8Ciencias = ano8Ciencias;
	}
	public void setAno8Matematica(float ano8Matematica) {
		this.ano8Matematica = ano8Matematica;
	}
	public void setAno9Portugues1(float ano9Portugues1) {
		this.ano9Portugues1 = ano9Portugues1;
	}
	public void setAno9Artes1(float ano9Artes1) {
		this.ano9Artes1 = ano9Artes1;
	}
	public void setAno9EdFisica1(float ano9EdFisica1) {
		this.ano9EdFisica1 = ano9EdFisica1;
	}
	public void setAno9Historia1(float ano9Historia1) {
		this.ano9Historia1 = ano9Historia1;
	}
	public void setAno9Geografia1(float ano9Geografia1) {
		this.ano9Geografia1 = ano9Geografia1;
	}
	public void setAno9Ciencias1(float ano9Ciencias1) {
		this.ano9Ciencias1 = ano9Ciencias1;
	}
	public void setAno9Matematica1(float ano9Matematica1) {
		this.ano9Matematica1 = ano9Matematica1;
	}
	public void setAno9Portugues2(float ano9Portugues2) {
		this.ano9Portugues2 = ano9Portugues2;
	}
	public void setAno9Artes2(float ano9Artes2) {
		this.ano9Artes2 = ano9Artes2;
	}
	public void setAno9EdFisica2(float ano9EdFisica2) {
		this.ano9EdFisica2 = ano9EdFisica2;
	}
	public void setAno9Historia2(float ano9Historia2) {
		this.ano9Historia2 = ano9Historia2;
	}
	public void setAno9Geografia2(float ano9Geografia2) {
		this.ano9Geografia2 = ano9Geografia2;
	}
	public void setAno9Ciencias2(float ano9Ciencias2) {
		this.ano9Ciencias2 = ano9Ciencias2;
	}
	public void setAno9Matematica2(float ano9Matematica2) {
		this.ano9Matematica2 = ano9Matematica2;
	}
	public void setAno9Portugues3(float ano9Portugues3) {
		this.ano9Portugues3 = ano9Portugues3;
	}
	public void setAno9Artes3(float ano9Artes3) {
		this.ano9Artes3 = ano9Artes3;
	}
	public void setAno9EdFisica3(float ano9EdFisica3) {
		this.ano9EdFisica3 = ano9EdFisica3;
	}
	public void setAno9Historia3(float ano9Historia3) {
		this.ano9Historia3 = ano9Historia3;
	}
	public void setAno9Geografia3(float ano9Geografia3) {
		this.ano9Geografia3 = ano9Geografia3;
	}
	public void setAno9Ciencias3(float ano9Ciencias3) {
		this.ano9Ciencias3 = ano9Ciencias3;
	}
	public void setAno9Matematica3(float ano9Matematica3) {
		this.ano9Matematica3 = ano9Matematica3;
	}
	public void setAno9Portugues(float ano9Portugues) {
		this.ano9Portugues = ano9Portugues;
	}
	public void setAno9Artes(float ano9Artes) {
		this.ano9Artes = ano9Artes;
	}
	public void setAno9EdFisica(float ano9EdFisica) {
		this.ano9EdFisica = ano9EdFisica;
	}
	public void setAno9Historia(float ano9Historia) {
		this.ano9Historia = ano9Historia;
	}
	public void setAno9Geografia(float ano9Geografia) {
		this.ano9Geografia = ano9Geografia;
	}
	public void setAno9Ciencias(float ano9Ciencias) {
		this.ano9Ciencias = ano9Ciencias;
	}
	public void setAno9Matematica(float ano9Matematica) {
		this.ano9Matematica = ano9Matematica;
	}
	public void setMediaLinguagens(float mediaLinguagens) {
		this.mediaLinguagens = mediaLinguagens;
	}
	public void setMediaCienciasHumanas(float mediaCienciasHumanas) {
		this.mediaCienciasHumanas = mediaCienciasHumanas;
	}
	public void setMediaCienciasNaturais(float mediaCienciasNaturais) {
		this.mediaCienciasNaturais = mediaCienciasNaturais;
	}
	public void setMediaMatematica(float mediaMatematica) {
		this.mediaMatematica = mediaMatematica;
	}
	public void setMediaFinal(float mediaFinal) {
		this.mediaFinal = mediaFinal;
	}
		
}
