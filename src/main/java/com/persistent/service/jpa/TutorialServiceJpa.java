package com.persistent.service.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.persistent.entity.Tutorial;
import com.persistent.service.TutorialService;

@Service("tutorialService")
public class TutorialServiceJpa implements TutorialService {

	private EntityManager entityManager;
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Tutorial> getAll() {
		Query query = entityManager.createNamedQuery("Tutorial.findAll");
		List<Tutorial> tutorials = null;
		tutorials = query.getResultList();
		return tutorials;
	}

	@Override
	public Tutorial getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Tutorial tutorial) {
		// TODO Auto-generated method stub
		return false;
	}

}
