package ibm.com.hyd;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebDemo implements WebApplicationInitializer{

	
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(InternalDemo.class);
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
		Dynamic dynamic = servletContext.addServlet("ds", dispatcherServlet);
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(5);
	}

}
