package tw.com.thinkpower.demo2.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.com.thinkpower.demo2.model.User;
import tw.com.thinkpower.demo2.repository.UserRepository;

@Service
public class UserServiceImp implements tw.com.thinkpower.demo2.service.UserService {

	public UserServiceImp() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private UserRepository repository;

	@Override
	public void createNewUser(User user) {
		repository.save(user);
	}

	@Override
	public List<User> findAll() {
		
		Iterable<User> users = repository.findAll();
		
		List<User> userList = new ArrayList<>();
		
		users.forEach(u -> userList.add(u));
		return userList;
	}

	@Override
	public List<User> findByUsername(String username) {
		return repository.findByUserName(username);
	}

	@Override
	public User findById(Long id) {
		return repository.findById(id).orElse(new User());
	}
	
	@Override
	public boolean checkoutByName(String name) {
		return repository.existsByUserName(name);
	}

	@Override
	public void deleteUser(Long id) {
		repository.deleteById(id);
	}
	
	@Override
	public User updateUser(User user) {
		return repository.save(user);
	}

}
