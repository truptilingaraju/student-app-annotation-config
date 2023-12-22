package com.ty.conf1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestEmployeeController {

	@GetMapping("/emp")
	public String employee() {
		
		return "employee.jsp";
	}
}
