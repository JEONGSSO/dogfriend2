package com.dogfriend.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller	//controller + reponseBody 객체를 리턴하면 json으로 출력
public class jspTest {
	
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

	@RequestMapping("/") //requestMapping + mothod get
	public String jsptest() {
	return "/test";
	}


}

/*@RequestMapping("/thyme")
	public String thymeleaf(tempHumiVO vo, Model model) {
		vo.setHumi("3123");
		vo.setTemp("2323");

		model.addAttribute("data", vo);
		model.addAttribute("message", "WOW");
		return "test";
	}*/