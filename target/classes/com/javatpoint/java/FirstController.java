package com.javatpoint.java;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class FirstController {
	@RequestMapping("/")
	public void Display()
	{
		System.out.println("This is our first controller ");
	}
}
