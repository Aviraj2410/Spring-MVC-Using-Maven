package com.aviraj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SisController {
	
	@ResponseBody
	@RequestMapping("/MakeUP")
	public String getMakeUP()
	{
		return "Here Take Makeup Kit";
	}

}
