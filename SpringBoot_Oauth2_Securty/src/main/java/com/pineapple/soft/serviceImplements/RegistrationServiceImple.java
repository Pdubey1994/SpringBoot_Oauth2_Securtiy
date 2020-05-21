package com.pineapple.soft.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pineapple.soft.entities.User;
import com.pineapple.soft.repositories.UserRepository;
import com.pineapple.soft.services.RegistrationService;

@Service
public class RegistrationServiceImple implements RegistrationService {

	
	@Autowired
    private UserRepository userRepository;
  
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public void insertData(User user) {
		
		 user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		 user.setRole("USER");		 
	     userRepository.save(user);
		

	}

}
