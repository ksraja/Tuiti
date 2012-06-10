package com.tuiti.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.tuiti.dao.BaseDao;
import com.tuiti.entity.Tutorial;

@Repository
public class TutorialDaoImpl implements BaseDao<Tutorial> {

	@PersistenceContext(unitName="tuiti-pu")
	protected EntityManager entityManager;
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Tutorial> findAll() {
		return entityManager.createNamedQuery("Tutorial.findAll").getResultList();
	}

	@Override
	public Tutorial findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Tutorial entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete(Tutorial entity) {
		// TODO Auto-generated method stub
		
	}


	
}
