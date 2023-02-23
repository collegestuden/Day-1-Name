package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Technologgy {
	
	@RequestMapping("/hello")
	public String display(HttpServletRequest req)
	{
		String Colorname=req.getParameter("Colorname");
		HttpSession session = req.getSession();
session.setAttribute("displaycolorName",Colorname );
		
		return "NewFile.jsp";
	}

}