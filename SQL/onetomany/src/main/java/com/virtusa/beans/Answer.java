package com.virtusa.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	
	@Column(length=50)
	private String answers;
	@Column(length=20)
	private String PostedBy;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	public String getPostedBy() {
		return PostedBy;
	}
	public void setPostedBy(String postedBy) {
		PostedBy = postedBy;
	}
}
