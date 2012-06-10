package com.tuiti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name="tutorials")
@NamedQueries( { @NamedQuery(name = "Tutorial.findAll", query = "SELECT t FROM Tutorial t") })
public class Tutorial extends BaseEntity {
	
	@Column(name="tutorial_id")
	private int tutorialId;
	
	@Column(name="tutorial_name")
	private String tutorialName;
	
	@Column(name="tutorial_desc")
	private String tutorialDesc;
	
	@Column(name="user_id")
	private String userId;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getTutorialId() {
		return tutorialId;
	}
	public String getTutorialName() {
		return tutorialName;
	}
	public String getTutorialDesc() {
		return tutorialDesc;
	}
	public String getUserId() {
		return userId;
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
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
