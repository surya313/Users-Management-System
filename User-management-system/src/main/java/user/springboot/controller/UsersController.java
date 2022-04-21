package user.springboot.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import user.springboot.model.Users;
import user.springboot.service.UsersService;

@CrossOrigin(origins = "https://users-management-system-app.herokuapp.com")
@RestController
public class UsersController  {
	
	@Autowired
	private UsersService usersService;
	
	
	@RequestMapping(method=RequestMethod.POST, value="/createUser")
	public String addUser(@RequestBody Users user) {
		usersService.createUsers(user);
		return null;
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/editUser/{id}")
	public String editUser(@PathVariable Integer id,@RequestBody Users user) {
		System.out.println("controller");
		usersService.editUsers(id,user);
		System.out.println("controller1");
		return null;
		
	}
	
	@GetMapping("/listUsers")
	public List<Users> listUsers() {
		return usersService.listUsers();
		
	}
	
	@GetMapping("/listUsersById/{id}")
	public Optional<Users> listUsersById(@PathVariable Integer id) {
		return usersService.listUsersById(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/deleteUser/{id}")
	public String deleteUser(@PathVariable Integer id) {
		System.out.print("delete");
		 usersService.deleteUsers(id);
		 return "string";
	}
	

}
