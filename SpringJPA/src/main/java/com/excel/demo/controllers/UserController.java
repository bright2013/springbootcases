package com.excel.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excel.demo.domains.User;
import com.excel.demo.service.UserService;

@RestController
@RequestMapping(path="/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/id/{userId}")
	public User getUser(@PathVariable int userId) {
		
		return userService.getUser(userId).get();
	}
	
	@PostMapping
	public int createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping("/sort/paramname")
	public List<User> getAllUsersSorted(@PathVariable String paramname){
		return userService.getAllUsersSorted(paramname);
	}
	
	@GetMapping("/page/{page}/{size}")
	public List<User> getAllUsers(@PathVariable int page,@PathVariable  int size){
		return userService.getAllUsersPaged(page, size).getContent();
	}
	
	@GetMapping("/name/{name}")
	public List<User> getUser(@PathVariable String name){
		return userService.getUser(name);
	}

	@GetMapping("/age/{age1}/{age2}")
	public List<User> getByAge(@PathVariable int age1, @PathVariable int age2){
		return userService.getUsersByAgeRange(age1, age2);
	}
}
