package com.jocata.Mapping_Hibernate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id
	private int A_id;
	private String Ans;
	
	@ManyToOne
	private Question question;
	
	public Answer(int a_id, String ans) {
		super();
		A_id = a_id;
		Ans = ans;
	}
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getA_id() {
		return A_id;
	}
	public void setA_id(int a_id) {
		A_id = a_id;
	}
	public String getAns() {
		return Ans;
	}
	public void setAns(String ans) {
		Ans = ans;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
	
	
	

}
