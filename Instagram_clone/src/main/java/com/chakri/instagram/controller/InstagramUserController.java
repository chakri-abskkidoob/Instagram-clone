package com.chakri.instagram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chakri.instagram.entity.InstagramUser;
import com.chakri.instagram.service.InstagramUserService;

@RestController
public class InstagramUserController {
	
	@Autowired
	private InstagramUserService iuService;
	
	@PostMapping("/register")
	public InstagramUser registerUser(@RequestBody InstagramUser iuser) {
		return iuService.registerUser(iuser);
	}
	
	@GetMapping("/get/{customerId}")
	public InstagramUser findUserByCustomerId(@PathVariable Long customerId) {
		return iuService.findUserByCustomerId(customerId);
	}
	
	@GetMapping("/{name}")
	public List<InstagramUser> findUserByNameOrUsername(@PathVariable String name, String userName) {
		return iuService.findUserByNameOrUsername(name, userName);
	}

}
