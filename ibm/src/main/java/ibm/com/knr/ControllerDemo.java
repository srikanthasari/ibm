package ibm.com.knr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerDemo {
	@Autowired
	private ServiceDemo serviceDemo;
	@RequestMapping(path="/fc",method=RequestMethod.GET)
	public ModelAndView fisrtReq(ModelAndView andView) {
		
		andView.setViewName("registation");
		
		return andView;
		
		
	}
	@RequestMapping(path="/sc",method=RequestMethod.POST)
	public ModelAndView  secondReq(ModelAndView andView,EntityDemo demo) {
		serviceDemo.saveForm(demo);
		andView.setViewName("success");
		
		return andView;
		
		
		
	}
		
	
		
		
	}


