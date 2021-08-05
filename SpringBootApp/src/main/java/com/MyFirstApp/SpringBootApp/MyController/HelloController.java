<<<<<<< HEAD
package com.MyFirstApp.SpringBootApp.MyController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String HelloWorld()
	{
		return "Welcome to MyFirstSpring App";
	}
	
}
=======
package com.MyFirstApp.SpringBootApp.MyController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String HelloWorld()
	{
		return "Welcome to MyFirstSpring App";
	}
	
}
>>>>>>> branch 'master' of https://github.com/shashidharreddys/SpringBoot.git
