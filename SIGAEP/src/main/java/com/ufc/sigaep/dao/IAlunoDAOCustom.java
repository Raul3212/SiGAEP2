package com.ufc.sigaep.dao;

import java.util.List;

import com.ufc.sigaep.model.TuplaClassificacao;

public interface IAlunoDAOCustom{
	
	public List<TuplaClassificacao> selectClassificacaoPorCurso(int curso);

}
