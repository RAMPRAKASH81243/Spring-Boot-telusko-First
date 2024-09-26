package com.ram.SpringBootweb1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1")int a, @RequestParam("num2")int b, ModelAndView mv) {
		
		int result= a+b;
		mv.addObject("result", result);
		mv.setViewName("result");
		return mv;
	}
}
