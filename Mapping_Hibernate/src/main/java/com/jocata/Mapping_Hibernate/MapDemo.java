package com.jocata.Mapping_Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class MapDemo {

	public static void main(String[] args) {

    	Configuration configDemo = new Configuration().configure().addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class);
    	org.hibernate.service.ServiceRegistry registryDemo = new ServiceRegistryBuilder().applySettings(configDemo.getProperties()).buildServiceRegistry();
    	SessionFactory sfDemo = configDemo.buildSessionFactory(registryDemo);
    	Session sessionDemo = sfDemo.openSession();
    	
    	// Creating  Question
    	Question q1 = new Question();
    	q1.setQ_id(1212);
    	q1.setQue("What is java");
    	
    	//Creating answer
    	Answer a1 = new Answer();
    	a1.setA_id(343);
    	a1.setAns("Java is progrming language");
    	a1.setQuestion(q1);
    	
    	Answer a2 = new Answer();
    	a2.setA_id(345);
    	a2.setAns("Java is OOPS,Platform-independent language");
    	a2.setQuestion(q1);
    	

    	Answer a3 = new Answer();
    	a3.setA_id(347);
    	a3.setAns("Java is used to develope Enterprise application software ");
    	a3.setQuestion(q1);
    	
    	List<Answer> ans_list = new ArrayList<Answer>();
    	ans_list.add(a1);
    	ans_list.add(a2);
    	ans_list.add(a3);
    	
    	q1.setAnswer(ans_list);
    	
    	sessionDemo.beginTransaction();
    	sessionDemo.save(q1);
    	sessionDemo.save(a3);
    	sessionDemo.save(a2);
    	sessionDemo.save(a1);
    	
    	
    	/*Question q = (Question) sessionDemo.get(Question.class,1212);
    	System.out.println(q.getQue());
    	
    	for(Answer a: q.getAnswer())
    	{
    		System.out.println(a.getAns());
    	}
    	*/
    	
    	sessionDemo.getTransaction().commit();
    	
    	sessionDemo.close();
		

	}

}
