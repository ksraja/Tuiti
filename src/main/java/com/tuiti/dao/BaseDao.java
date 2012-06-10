package com.tuiti.dao;

import java.util.List;

public interface BaseDao<T> {

	public List<T> findAll();
	
	public T findById(int id);
	
	public boolean save(T entity);
	
	public void delete(T entity);
	
}
