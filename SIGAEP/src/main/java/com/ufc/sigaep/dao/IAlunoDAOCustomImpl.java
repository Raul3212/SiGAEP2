package com.ufc.sigaep.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ufc.sigaep.model.TuplaClassificacao;

@Repository
public class IAlunoDAOCustomImpl implements IAlunoDAOCustom{

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<TuplaClassificacao> selectClassificacaoPorCurso(int curso) {
		
		String sql = "SELECT e.nome as nomeEscola, a.nome as nomeAluno, a.media_final as mediaFinal "
				+ "from alunos as a "
				+ "join escola as e "
				+ "on a.escola_id = e.id "
				+ "where a.curso = :curso"
				+ "order by a.media_final";
		
		Query query = manager.createQuery(sql);
		query.setParameter("curso", curso);
		
		List<TuplaClassificacao> result = query.getResultList();
		return result;
		
	}

}
