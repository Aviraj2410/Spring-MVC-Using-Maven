package com.aviraj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class CoronaVirus {
	
	@ResponseBody
	@RequestMapping("/https://www.mohfw.gov.in/")
	public String VirusGo()
	{
		return "";
	}
	

}
