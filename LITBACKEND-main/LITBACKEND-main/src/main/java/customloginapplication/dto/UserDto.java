package customloginapplication.dto;

public class UserDto {
	
	//DTO stands for Data Transfer Object. It is a design pattern used in 
	//software development to encapsulate the data that needs to be transferred 
	//between different layers of an application. The primary purpose of a DTO is to 
	//group together multiple data fields into a single object, reducing the number of 
	//method calls and making the data transfer more efficient.
	
	
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String mobile;
	private String gender;
	
	
	public UserDto() {
	
	}


public UserDto(String username, String password, String firstname, String lastname, String mobile, String gender) {
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobile = mobile;
		this.gender = gender;
	}


public String getUsername() {
	return username;
}


public String getPassword() {
	return password;
}

public String getGender() {
	return gender;
}

public String getFirstname() {
	return firstname;
}


public String getLastname() {
	return lastname;
}


public String getMobile() {
	return mobile;
}


public void setUsername(String username) {
	this.username = username;
}


public void setPassword(String password) {
	this.password = password;
}


public void setFirstname(String firstname) {
	this.firstname = firstname;
}


public void setLastname(String lastname) {
	this.lastname = lastname;
}


public void setMobile(String mobile) {
	this.mobile = mobile;
}


public void setGender(String gender) {
	// TODO Auto-generated method stub
	this.gender = gender;
}



//	public UserDto(String username, String password, String fullname) {
//		
//		this.username = username;
//		this.password = password;
//		this.fullname = fullname;
//	}


//	public String getUsername() {
//		return username;
//	}
//
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//
//	public String getPassword() {
//		return password;
//	}
//
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//
//	public String getFullname() {
//		return fullname;
//	}
//
//
//	public void setFullname(String fullname) {
//		this.fullname = fullname;
//	}
	
	
	
	
	

}
