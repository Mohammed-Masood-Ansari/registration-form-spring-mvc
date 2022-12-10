package registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import registration.service.UserService;

@Controller
public class UserController {

	
	@Autowired 
	private UserService service ;
	 
	@GetMapping("/registration")
	public String getString() {
		
		return "registration";
	}
	/*
	 * @PostMapping("/registration") public String handelForm(ModelMap map,User
	 * user) {
	 * 
	 * service.createUser(user); return "registration"; }
	 */
}
