package tw.com.thinkpower.demo2.service;

import java.util.List;

import tw.com.thinkpower.demo2.model.User;

public interface UserService {

	List<User> findAll();

	void createNewUser(User user);

	List<User> findByUsername(String username);

	User findById(Long id);

	void deleteUser(Long id);

	User updateUser(User user);

	boolean checkoutByName(String name);

}
