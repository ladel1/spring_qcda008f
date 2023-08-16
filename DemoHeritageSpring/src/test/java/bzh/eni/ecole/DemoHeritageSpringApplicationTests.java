package bzh.eni.ecole;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import bzh.eni.ecole.bo.Medecin;
import bzh.eni.ecole.bo.Patient;
import bzh.eni.ecole.bo.Personne;
import bzh.eni.ecole.dal.PersonneDao;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@SpringBootTest
class DemoHeritageSpringApplicationTests {
	
	@Autowired
	private EntityManager em;
	@Autowired
	private PersonneDao personneDao;
	
	@Transactional
	@Rollback(false)
	@Test
	void testHeritage() {
//		Personne m1 = new Personne();
//		m1.setNom("Dupont");
//		m1.setPrenom("Eric");
//		m1.setAdresse("bbbb");
//		em.persist(m1);
//		Personne m2 = new Personne();
//		m2.setNom("Maisel");
//		m2.setPrenom("pierre");
//		m2.setAdresse("bbbb");
//		em.persist(m2);
//		Personne m3 = new Personne();
//		m3.setNom("Delor");
//		m3.setPrenom("Lucas");
//		m3.setAdresse("bbbb");
//		em.persist(m3);
	}

	@Test
	void testQueriesPersonne() {
		Personne m3 = new Personne();
		m3.setNom("Delor");
		m3.setPrenom("Lucas");
		m3.setAdresse("bbbb");

		List<Personne> pers = personneDao.findByNomIgnoreCase("delor");
		System.out.println(pers);
		assertEquals(m3, pers.get(0));	
	}
	
	
	@Test
	void contextLoads() {
	}


}
