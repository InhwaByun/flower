package com.flower.inqiry;

import org.springframework.web.bind.annotation.GetMapping;

public class InquiryController {
	@GetMapping("/inquiry2")
	public String inquiry2() {
		return "customer_center/inquiry2";
	}
}