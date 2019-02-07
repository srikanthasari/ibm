package ibm.com.knr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceDemo {
	
	@Autowired
	private DaoDemo daoDemo;
	
	@Transactional
	public void saveForm(EntityDemo demo) {
		
		daoDemo.saveData(demo);
	}

}
