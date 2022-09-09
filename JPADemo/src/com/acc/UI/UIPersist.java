package com.acc.UI;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.acc.jpaentity.Empentity;

public class UIPersist {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Empentity emp=new Empentity();
		//emp.setEmpId(5);setEmpId invokation can be possible when using merge() operation
		emp.setEmpName("Alok Ranjan");
		emp.setRole("Senior Analyst");
		emp.setSalary(60000.00);
		emp.setHiredate(java.sql.Date.valueOf("2022-01-08"));
		entityManager.getTransaction().begin();
		//entityManager.merge(emp);
		entityManager.persist(emp);
		entityManager.getTransaction().commit();
		System.out.println("Employee Registered Successfully");
		entityManager.close();
		entityManagerFactory.close();
		
		

	}

}
