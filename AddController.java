package com.aviraj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AddController {
	@ResponseBody
	@RequestMapping("/Add")
	
	public String Add()
	{
		return "display.jsp";
	}
}
