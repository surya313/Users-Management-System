package user.springboot.service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.springboot.model.Users;
import user.springboot.repository.UsersRepository;

@Service
public class UsersService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	

	public void createUsers(Users user) {
		// TODO Auto-generated method stub
		
		user.setEnteredTime(Instant.now().plusSeconds(3600).toString().replace('Z', ' ').replace('T', '|').substring(0, 19));
		usersRepository.save(user);
		
	}

	public List<Users> listUsers() {
		// TODO Auto-generated method stub
		return usersRepository.findAll();
		
	}

	public void deleteUsers(Integer id) {
		// TODO Auto-generated method stub
		 usersRepository.deleteById(id);
	}

	public void editUsers(Integer id,Users user) {
		// TODO Auto-generated method stub
		System.out.println("Service");
		Users user1 = usersRepository.findUserById(id);
		 
		user1.setEmailID(user.getEmailID());
		user1.setGender(user.getGender());
		user1.setLastUpdated(Instant.now().plusSeconds(3600).toString().replace('Z', ' ').replace('T', '|').substring(0, 19));
		user1.setStatus(user.getStatus());
		user1.setUserName(user.getUserName());
		 usersRepository.save(user1);
		System.out.println("Service1");
		
		
		
		
	}

	public Optional<Users> listUsersById(Integer id) {
		// TODO Auto-generated method stub
		return usersRepository.findById(id);
		
	}

}
