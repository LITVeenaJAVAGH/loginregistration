package customloginapplication.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails {
	
	private String username;
	private String password;
	private Collection<? extends GrantedAuthority> authorities;
	private String firstname;
	private String lastname;
	private String mobile;
	
	
	

public CustomUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities,
			String firstname, String lastname, String mobile) {
		this.username = username;
		this.password = password;
		this.authorities = authorities;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobile = mobile;
	}



//	public CustomUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities,
//			String fullname) {
//		
//		this.username = username;
//		this.password = password;
//		this.authorities = authorities;
//		this.fullname = fullname;	
//	}
	 
	

	public String getFirstname() {
		return firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public String getMobile() {
		return mobile;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return authorities;
	}

	@Override
	public String getPassword() {
		
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
