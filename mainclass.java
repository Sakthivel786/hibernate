package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class mainclass {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
        
        
        Voterid v=new Voterid();
        
        v.setDistrict("dister");
        v.setDOB("12/12/2012");
        v.setState("tamil nadu");
        v.setVoterno("12354");
        
        Person p=new Person();
        p.setAge(12);
        p.setGender("Male");
        p.setName("Vale");
        p.setPhone(12456789);
        
        p.setV(v);
        
        et.begin();
        em.persist(v);
        em.persist(p);
        et.commit();
	}

}
