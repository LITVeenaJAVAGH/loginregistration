package customloginapplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


//entity class 

@Entity //annotation is used to declare a Java class as a JPA (Java Persistence API) 
//entity. JPA is a specification for Java EE that defines how to work with 
//relational databases using Java objects. 
@Table(name="users")
public class User {
	
	@Id //annotation is used to designate a field in a Java class as the primary key 
	// of a persistent entity. This annotation is part of the Java Persistence API (JPA) 
	//and is used to indicate the primary identifier field of an entity
	@GeneratedValue(strategy = GenerationType.AUTO) //is used to specify how the 
	//primary key for an entity should be generated. This annotation is often 
	//used in conjunction with the @Id annotation to define the primary key of an entity.
	private Long id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String mobile;
	private String gender;
	
	public User () {}
	
//	public User(String username, String password, String fullname) {
//		super();
//		this.username = username;
//		this.password = password;
//		this.fullname = fullname;
//	}
	
	public User(String username, String password, String firstname, String lastname, String mobile, String gender) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobile = mobile;
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
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

	public void setId(Long id) {
		this.id = id;
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
		this.gender = gender;
	}
	
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getFullname() {
//		return fullname;
//	}
//	public void setFullname(String fullname) {
//		this.fullname = fullname;
//	}
	
	

}
