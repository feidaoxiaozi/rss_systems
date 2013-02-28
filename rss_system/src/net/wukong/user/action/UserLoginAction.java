package net.wukong.user.action;

import net.wukong.rssnews.User;
import net.wukong.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class UserLoginAction extends ActionSupport{
	private User user;
	private UserService service;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}
	@Override
	public String execute() throws Exception {
		
		if (service.verifyUser(user.getUsername(), user.getPassword())) {
			System.out.println("username="+user.getUsername());
			System.out.println("password="+user.getUsername());
			return SUCCESS;
		}
		return INPUT;
	}

}
