package com.flower.user;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
	@GetMapping("/Login")
	public String Login() {
		return "login/Login";
	}
}