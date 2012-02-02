package com.persistent.service;

import java.util.List;

import com.persistent.entity.Tutorial;

public interface TutorialService {

	public List<Tutorial> getAll();
	public Tutorial getById(int id);
	
	public boolean save(Tutorial tutorial);
	
}
