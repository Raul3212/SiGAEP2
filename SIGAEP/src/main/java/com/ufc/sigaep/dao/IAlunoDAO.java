package com.ufc.sigaep.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import com.ufc.sigaep.model.Aluno;

public interface IAlunoDAO extends JpaRepository<Aluno, Long>{
	public List<Aluno> findByCursoIdOrderByMediaFinalDesc(Long cursoId);
}
