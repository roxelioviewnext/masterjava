package com.curso.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@TestMethodOrder(OrderAnnotation.class)
class JpaUnitTest {
	protected static EntityManagerFactory emf;
	protected static EntityManager em;
	
	@BeforeAll
	static void setUpStaticTest() {
		Persistence.generateSchema("noticias", null);
		emf = Persistence.createEntityManagerFactory("noticias");
		
	}
	@BeforeEach
	void setUpTest() {
		em = emf.createEntityManager();
	}
	
	@AfterAll
	static void downStaticTest() {
		emf.close();
	}
	
	@AfterEach
	void downTest() {
		em.clear();
		em.close();
	}
	

	@Test
	static void entityManagerFactoryTest() {
		assertNotNull(emf);
	}

	@Test
	static void entityManagerTest() {
		assertNotNull(em);
	}
	

}
