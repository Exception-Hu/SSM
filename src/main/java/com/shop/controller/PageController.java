package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {
	@RequestMapping("test.do")
	public String test() {
		System.out.println("PageController.test()");
		return "test";
	}
}
