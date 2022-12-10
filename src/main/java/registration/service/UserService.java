package registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import registration.dao.UserDao;
import registration.dto.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public String createUser(User user) {
		
		return userDao.saveUser(user);
	}
}
