package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.service.LaoWangServicec;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	LaoWangServicec laowang;
	
	@RequestMapping("/query")
	public String query(Model model) {
		
		model.addAttribute("list",laowang.query());
		
		return "index";
	}
	
}
