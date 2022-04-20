package user.springboot.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String enteredTime;
	private String lastUpdated;
	
	//@NotBlank(message = "Name is mandatory")
	private String userName;
	
	private char gender;
	private String status;
	private String emailID;
	
	public Users() {
		
	}

	public Users(Integer id, String enteredTime, String lastUpdated, String userName, char gender, String status,
			String emailID) {
		super();
		this.id = id;
		this.enteredTime = enteredTime;
		this.lastUpdated = lastUpdated;
		this.userName = userName;
		this.gender = gender;
		this.status = status;
		this.emailID = emailID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEnteredTime() {
		return enteredTime;
	}

	public void setEnteredTime(String enteredTime) {
		this.enteredTime = enteredTime;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	
}
