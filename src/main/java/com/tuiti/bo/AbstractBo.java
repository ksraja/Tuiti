package com.tuiti.bo;

import org.springframework.beans.factory.annotation.Autowired;

import com.tuiti.dao.BaseDao;
import com.tuiti.entity.BaseEntity;

public abstract class AbstractBo<T extends BaseEntity> implements BaseBo<T> {

	@Autowired
	protected BaseDao<T> dao;
	
}
