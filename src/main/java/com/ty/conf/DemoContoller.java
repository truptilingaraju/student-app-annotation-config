package com.ty.conf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoContoller {

	//Model
	//ModelMap
	//ModelAndView
	
	@GetMapping("/info")
	public String showMessage(Model model) {
		
		model.addAttribute("myName", "Geet");
		model.addAttribute("myMessage", "Hi Aditya, Nice to meet you......");
		
		model.addAttribute("my_Name", "Aditya");
		model.addAttribute("my_Message", "Hello Geet, Same Here");
		
		return "mymessage.jsp";
	}
}
