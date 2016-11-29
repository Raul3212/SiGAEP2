package com.ufc.sigaep.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufc.sigaep.model.Aluno;

public interface IAlunoDAO extends JpaRepository<Aluno, Long>{
	
}
