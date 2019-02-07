package ibm.com.knr;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class DaoDemo {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void saveData(EntityDemo demo) {
		
		entityManager.persist(demo);
	}

}
