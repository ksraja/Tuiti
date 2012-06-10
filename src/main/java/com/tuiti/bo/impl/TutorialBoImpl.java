package com.tuiti.bo.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tuiti.bo.AbstractBo;
import com.tuiti.entity.Tutorial;

@Service
public class TutorialBoImpl extends AbstractBo<Tutorial> {

	@Override
	public List<Tutorial> getAll() {
		return dao.findAll();
	}

	@Override
	public Tutorial getById(int id) {
		return dao.findById(id);
	}

	@Override
	public boolean save(Tutorial entity) {
		return dao.save(entity);
	}

	@Override
	public void delete(Tutorial entity) {
		dao.delete(entity);
	}

}
