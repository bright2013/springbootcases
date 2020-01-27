package com.excel.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.excel.demo.domains.User;
import com.excel.demo.repositories.UserJpaRepository;

@Service
public class UserService {

	@Autowired
	private UserJpaRepository userRepo;
	
	public Optional<User> getUser(int id) {
		return userRepo.findById(id);
	}
	
	public int createUser(User user) {
		return userRepo.save(user).getId();
	}

	public List<User> getAllUsersSorted(String paramname) {
		return userRepo.findAll(Sort.by(Sort.Direction.ASC,paramname));
	}
	
	public Page<User> getAllUsersPaged(int page, int size) {
		return userRepo.findAll(PageRequest.of(page, size));
	}
	
	public List<User> getUser(String name) {
		return userRepo.findByName(name);
	}
	
	public List<User> getUsersByAgeRange(int age1, int age2){
		return userRepo.queryByAgeRange(age1, age2);
	}
}
