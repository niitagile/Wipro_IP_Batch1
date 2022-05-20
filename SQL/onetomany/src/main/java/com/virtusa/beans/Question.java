package com.virtusa.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int qid;
	
	@Column(length=50)
	private String ques;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="ques_ans", joinColumns= {@JoinColumn(name="qid")}, inverseJoinColumns= {@JoinColumn(name="aid")})
	private List<Answer> answers;
	
	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	

}