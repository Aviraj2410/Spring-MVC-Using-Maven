package com.mom;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyCafeController {
	
	
	@RequestMapping("/getcafe")
	public String getCafe(Model model) 
	{
		return "Welcome-Page.jsp";
	}
	
	@RequestMapping("/ProcessOrder")
	public String ProcessOrder(HttpServletRequest request, Model model)
	{
	String UserEnteredValue = request.getParameter("foodtype");
	
	model.addAttribute("User Input", UserEnteredValue);
		return "Process-Order.jsp";
	}
	


}
