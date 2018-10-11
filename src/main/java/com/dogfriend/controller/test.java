package com.dogfriend.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class test{
@RequestMapping("/test") //requestMapping + mothod get
	public String jsptest(Model model,
						@RequestParam(value="test")String test) {
	model.addAttribute("message", test);
	return "/test";
	}

	@RequestMapping("/vue")
	public String vueTest() {
		return "/vueTest";
	}

	@PostMapping("/post")
	public String postTest(HttpServletRequest res, Model model)
	{
		String name = res.getParameter("name");
		model.addAttribute("name", name);
		System.out.println(name);
		return "/post";
    }
}