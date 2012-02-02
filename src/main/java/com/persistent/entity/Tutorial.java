package com.persistent.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Tutorial")
@NamedQueries( { @NamedQuery(name = "Tutorial.findAll", query = "SELECT t FROM Tutorial t") })
public class Tutorial {
	
	private int tutorialId;
	private String tutorialName;
	private String tutorialDesc;
	
	@Id
	public int getTutorialId() {
		return tutorialId;
	}
	public String getTutorialName() {
		return tutorialName;
	}
	public String getTutorialDesc() {
		return tutorialDesc;
	}
	
	public void setTutorialId(int tutorialId) {
		this.tutorialId = tutorialId;
	}
	public void setTutorialName(String tutorialName) {
		this.tutorialName = tutorialName;
	}
	public void setTutorialDesc(String tutorialDesc) {
		this.tutorialDesc = tutorialDesc;
	}
	
	
	
}
