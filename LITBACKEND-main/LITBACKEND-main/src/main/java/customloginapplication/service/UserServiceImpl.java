package customloginapplication.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import customloginapplication.dto.UserDto;
import customloginapplication.model.User;
import customloginapplication.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	private UserRepository userRepository;
	
	

	public UserServiceImpl(UserRepository userRepository) {
	
		this.userRepository = userRepository;
	}

	@Override
	public User findByUsername(String username) {
		
		return userRepository.findByUsername(username);
	}

//	private String username;
//	private String password;
//	private Collection<? extends GrantedAuthority> authorities;
//	private String firstname;
//	private String lastname;
//	private String mobile;
	@Override
	public User save(UserDto userDto) {
		User user = new User(userDto.getUsername(), passwordEncoder.encode(userDto.getPassword()), userDto.getFirstname(),userDto.getLastname(),userDto.getMobile(),userDto.getGender());
		return userRepository.save(user);
	}
	
	

}
