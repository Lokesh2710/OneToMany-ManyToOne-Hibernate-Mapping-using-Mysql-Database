package com.jocata.Mapping_Hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Question {
	
	@Id
	private int Q_id;
	private String que;
	
	@OneToMany(mappedBy="question")
	private List<Answer> answer;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Question(int q_id, String que, List<Answer> answer) {
		super();
		Q_id = q_id;
		this.que = que;
		this.answer = answer;
	}



	public List<Answer> getAnswer() {
		return answer;
	}



	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}



	public int getQ_id() {
		return Q_id;
	}
	public void setQ_id(int q_id) {
		Q_id = q_id;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	
	
	
	
	
	

}
