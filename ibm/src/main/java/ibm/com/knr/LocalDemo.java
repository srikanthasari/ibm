package ibm.com.knr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class LocalDemo {

	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactoryBean() {
		
		LocalEntityManagerFactoryBean localEntityManagerFactoryBean = new LocalEntityManagerFactoryBean();
		localEntityManagerFactoryBean.setPersistenceUnitName("demo");
		return localEntityManagerFactoryBean;
		
		
		
	}
}
