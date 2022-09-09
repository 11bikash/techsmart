package com.acc.UI;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.acc.jpaentity.Empentity;

public class UIDelete {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Empentity emp=entityManager.find(Empentity.class,3);
		if(emp!=null) {
			entityManager.getTransaction().begin();
			entityManager.remove(emp);
			entityManager.getTransaction().commit();
			System.out.println("Employee Deleted Successfully");
		}
		else {
			System.out.println("Employee is not found!");
		}
	}

}
