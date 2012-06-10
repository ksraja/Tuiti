package com.tuiti.bo;

import java.util.List;

import com.tuiti.entity.BaseEntity;

public interface BaseBo<T extends BaseEntity> {

	public List<T> getAll();
	
	public T getById(int id);
	
	public boolean save(T entity);
	
	public void delete(T entity);
}
