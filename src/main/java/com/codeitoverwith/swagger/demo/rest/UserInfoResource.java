package com.codeitoverwith.swagger.demo.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.codeitoverwith.swagger.demo.domain.UserInfo;


@RestController
@RequestMapping ("/api")
public class UserInfoResource {

	ArrayList<UserInfo> users = new ArrayList<UserInfo> ();
	
	@GetMapping("/{id}")
	public UserInfo getUser(@PathVariable int id) {
		UserInfo ui = users.stream().filter(a -> a.getId() == id).collect(Collectors.toList()).get(0);
		return ui;
	}
	

	@GetMapping("/")
	public List<UserInfo> getUsers() {
		return users;
	}
	
	@PostMapping ("/")
	public UserInfo addUserInfo (@RequestBody UserInfo user) {
		users.add(user);
		return user;
	}
	
}
