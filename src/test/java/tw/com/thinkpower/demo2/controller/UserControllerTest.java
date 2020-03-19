package tw.com.thinkpower.demo2.controller;

import java.util.Collections;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.when;

import static org.springframework.http.HttpStatus.OK;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import tw.com.thinkpower.demo2.model.User;
import tw.com.thinkpower.demo2.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

//	https://www.baeldung.com/spring-mock-mvc-rest-assured
    @Mock
    private UserService userService;
    @InjectMocks
    private UserController userController;
//    @InjectMocks
//    private CourseControllerExceptionHandler courseControllerExceptionHandler;

    
    @Before
    public void initialiseRestAssuredMockMvcStandalone() {
        RestAssuredMockMvc.standaloneSetup(userController);
    }
    
//	@GetMapping("/users")
//	public List<User> findUsers() {
//		return userService.findAll();
//	}
	
    @Test
    public void givenNoExistingCoursesWhenGetCoursesThenRespondWithStatusOkAndEmptyArray() {
        when(userService.findAll()).thenReturn(Collections.emptyList());

        given()
        .when()
          .get("/users").andReturn();
//        .then()
//          .log().ifValidationFails()
//          .statusCode(OK.value());
//          .contentType(JSON);
//          .body(is(equalTo("[]")));
    }
    
//	@GetMapping("/users/{id}")
//	public User findUserById(@PathVariable Long id) {
//		return userService.findById(id);
//	}
	
//	@GetMapping("/name/{name}")
//	public boolean findUserById(@PathVariable String name) {
//		return userService.checkoutByName(name);
//	}

//	@PostMapping("/users")
//	public ResponseEntity<Object> createUser(@RequestBody User user) {
//		 
//		if (userService.findByUsername(user.getUserName()).size() > 0 ) {
//
//			Map<String, Object> response = new HashMap<>();
//			response.put("status", HttpStatus.NOT_ACCEPTABLE);
//			response.put("errors", "Username is already taken");
//			response.put("timestamp", new Date());
//
//			return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
//		} else {
//			userService.createNewUser(user);
//			User currentUser = userService.findById(user.getUserSeq());
//			Map<String, Object> response = new HashMap<>();
//			response.put("id", currentUser.getUserSeq());
//			response.put("username", currentUser.getUserName());
//			return new ResponseEntity<>(response, HttpStatus.OK);
//		}
//	}

//	@DeleteMapping("/users/{id}")
//	public void deleteUser(@PathVariable Long id) {
//		userService.deleteUser(id);
//	}

//	@PutMapping("/users/{id}/{name}")
//	public ResponseEntity<Object> updateUser(@PathVariable Long id, @PathVariable String name) {
//		User user = userService.findById(id);
//		user.setUserName(name);
//		userService.updateUser(user);
//		
//		Map<String, Object> response = new HashMap<>();
//		response.put("id", user.getUserSeq());
//		response.put("username", user.getUserName());
//		return new ResponseEntity<>(response, HttpStatus.OK);
//	}

}
