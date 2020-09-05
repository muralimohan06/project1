package com.apps.eurekadiscoveryservice.account.controller.ui;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

	@GetMapping("/user/status")
	public String getStatus() {
		return "working account";

	}

}
