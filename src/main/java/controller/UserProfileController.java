package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.User;
import service.UserService;

@RestController
@RequestMapping(value="/users")
public class UserProfileController extends BaseController{
	@Autowired
	UserService us;

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	@RequestMapping(value="/all")
	public User view() {
		return us.getUser();
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
