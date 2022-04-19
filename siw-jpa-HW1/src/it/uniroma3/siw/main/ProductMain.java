package it.uniroma3.siw.main;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;



public class ProductMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("products-unit");
		EntityManager em = emf.createEntityManager();

		
		
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
	
		tx.commit();
		
		
		em.close();
		emf.close();
	}
}