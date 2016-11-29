package com.ufc.sigaep.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ufc.sigaep.model.Curso;

@Repository
public interface ICursoDAO extends JpaRepository<Curso, Long>{

}
