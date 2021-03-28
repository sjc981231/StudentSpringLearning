package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloMVCController{

	@RequestMapping(value="/mvc",method=RequestMethod.GET)
	    public String printHello(ModelMap model){
			model.addAttribute("message","Hello Spring mvc my friend");
	        return "welcome";
	    }

}
