package tw.com.thinkpower.demo2.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;
import tw.com.thinkpower.demo2.model.User;
import tw.com.thinkpower.demo2.model.VO.UserVO;
import tw.com.thinkpower.demo2.service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController {

	public UserController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	UserService userService;

	@GetMapping("/users")
	public List<User> findUsers() {
		return userService.findAll();
	}

	@GetMapping("/users/{id}")
	public User findUserById(@PathVariable Long id) {
		return userService.findById(id);
	}
	
	@GetMapping("/name/{name}")
	public boolean findUserById(@PathVariable String name) {
		return userService.checkoutByName(name);
	}

	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody @Valid UserVO user) {
//	@GetMapping("/create/{name}/{password}")
//	public ResponseEntity<Object> createUser(@PathVariable Long id, @PathVariable String name, @PathVariable String password) {
				 
//		User user = new User();
//		user.setUserName(name);
//		user.setPassword(password);
		 
		System.out.print("xxxxxxx " + user.toString());
		if (userService.findByUsername(user.getUserName()).size() > 0 ) {

			Map<String, Object> response = new HashMap<>();
			response.put("status", HttpStatus.NOT_ACCEPTABLE);
			response.put("errors", "Username is already taken");
			response.put("timestamp", new Date());

			return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
		} else {
			
			userService.createNewUser(new User(user.getUserName(), user.getPassword()));
			User currentUser = userService.findById(user.getUserSeq());
			Map<String, Object> response = new HashMap<>();
			response.put("id", currentUser.getUserSeq());
			response.put("username", currentUser.getUserName());
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}

	@DeleteMapping("/users/{id}")
//	@GetMapping("/delete/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}

	@PutMapping("/users/{id}/{name}")
//	@GetMapping("/users/{id}/{name}")
	public ResponseEntity<Object> updateUser(@PathVariable Long id, @PathVariable String name) {
		User user = userService.findById(id);
		user.setUserName(name);
		userService.updateUser(user);
		
		Map<String, Object> response = new HashMap<>();
		response.put("id", user.getUserSeq());
		response.put("username", user.getUserName());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
