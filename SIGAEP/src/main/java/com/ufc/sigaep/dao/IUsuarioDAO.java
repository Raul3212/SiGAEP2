package com.ufc.sigaep.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufc.sigaep.model.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long>{

	public List<Usuario> findByLoginLike(String login);
	public List<Usuario> findByTipoLike(int tipo);
	
}
