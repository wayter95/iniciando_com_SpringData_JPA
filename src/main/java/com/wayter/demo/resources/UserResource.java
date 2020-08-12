package com.wayter.demo.resources;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wayter.demo.repository.Users;
import com.wayter.demo.entities.User;
@RestController
@RequestMapping(value="/api")
public class UserResource {
 
	@Autowired
	Users userRepository;
	
	@GetMapping("/users")
	public List<User> returnAll(){
		return userRepository.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User findId(@PathVariable(value="id")long id) {
		return userRepository.findById(id);
	}
	@PostMapping("/users")
	public User create(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@DeleteMapping("/users/{id}")
	public void delete(@PathVariable(value="id")long id) {
		userRepository.deleteById(id);
	}
	@PutMapping("/users/{id}")
	public User update(@RequestBody User user,@PathVariable(value="id")long id) {
	
		return userRepository.save(user);
	}
}
