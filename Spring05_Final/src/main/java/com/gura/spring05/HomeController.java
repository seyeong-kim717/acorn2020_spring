package com.gura.spring05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

<<<<<<< HEAD
@Controller
public class HomeController {
=======


@Controller
public class HomeController {
	
>>>>>>> refs/remotes/origin/irene
	
	@RequestMapping("/home")
	public String home() {
		
		return "home";
	}
	
}
