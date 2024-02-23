package com.example.CodePlayground.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CodePlayground.JavaHandler.JavaHandler;



@RestController
@RequestMapping("/code")
@CrossOrigin("*")
public class RequestController {
	JavaHandler javaHandler = null;
	public static final String JAVA = "java";
	public static final String USER = "system_Yash";
	
	@GetMapping("/")
	public String getResponse()
	{
		javaHandler = new JavaHandler();
		javaHandler.handleRequest(USER,"");
		return "Code Working Fine!!! Yash";
	}
	
	
	@PostMapping("/code")
	public void runProcess(@RequestBody String code)
	{
		 System.out.println(code);
		 if(JAVA == "java")
		 {
			 javaHandler = new JavaHandler(); 
			 javaHandler.handleRequest(USER,code);
		 }
		 
	}
}
