package bzh.eni.ecole;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import bzh.eni.ecole.bo.Medecin;
import bzh.eni.ecole.bo.Patient;
import bzh.eni.ecole.bo.Personne;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@SpringBootTest
class DemoHeritageSpringApplicationTests {
	
	@Autowired
	private EntityManager em;
	
	@Transactional
	@Rollback(false)
	@Test
	void testHeritage() {

		Patient m = new Patient();
		m.setNom("Dupont");
		m.setPrenom("pierre");
		m.setAdresse("bbbb");

		em.persist(m);
	}
	
	
	@Test
	void contextLoads() {
	}


}
