package com.xworkz.laptop.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepoImpl implements LaptopRepo {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public boolean saveLaptopEntity(Object obj) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(obj);
			entityManager.getTransaction().commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		} finally {
			if (entityManager != null) {
				System.out.println("Data saved");
			} else {
				System.out.println("Data not saved");
			}
		}

		return false;
	}

}
