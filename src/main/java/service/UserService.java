package service;

import org.springframework.stereotype.Service;

import model.User;

@Service
public class UserService extends BaseService{

	public User getUser() {
		User user = new User();
		user.setFirstName("Reetom");
		user.setLastName("Hazarika");
		user.setGender("Male");
		return user;
	}
	
}
