package fr.eni.demojpa;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import fr.eni.demojpa.bll.ClientService;
import fr.eni.demojpa.bo.Address;
import fr.eni.demojpa.bo.Article;
import fr.eni.demojpa.bo.Client;
import fr.eni.demojpa.bo.Comment;
import fr.eni.demojpa.bo.IdArticle;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@SpringBootTest
class DemojpaApplicationTests {

	@Autowired
	private ClientService clientService;
	
	@Autowired
	private EntityManager entityManager;
	
//	@Test
//	void testerClientAddress() {
//		Address address = new Address();
//		address.setNomRue("blabalalb");
//		address.setNumRue(12);
//		address.setCp("29000");
//		address.setVille("Quimper");
//		Client client = new Client();
//		client.setFirstname("Gael");
//		client.setLastname("Maisel");
//		client.setBday(LocalDate.of(1992, 10, 10));
//		client.setAddress(address);
//		client.setTel("0564879521");
//		clientService.addClient(client);
//		System.out.println(client);
//		assertTrue(true);
//	}
	
//	@Test
//	@Transactional
//	@Rollback(false)
//	void testerOneToMany() {
//		IdArticle idA = new IdArticle("Samsung S21", "adel");
//		Article article = new Article(idA, "smartphone", 1200F, null);
//		entityManager.persist(article);
//	}
	
	@Test
	@Transactional
	@Rollback(false)
	void testerajoutCommentOneToMany() {
		IdArticle idA = new IdArticle("Samsung S21", "adel");
		Article article = entityManager.find(Article.class, idA);
		System.out.println(article.getComments().get(0));
		Comment cm = article.getComments().get(0);
		article.removeComment(cm);
		entityManager.persist(article);
		System.out.println(article);
	}
	
	
	@Test
	void contextLoads() {
	}
	

}
