package com.mypage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myPage/")
public class MyPageController {
	
	@GetMapping("myPageMainMenu")
	public void myPageMainMenu() {
		
	}
	
	@GetMapping("cart")
	public void cart() {
		
	}
	
	@GetMapping("couponPoint")
	public void couponPoint() {
		
	}
}
