package com.iiht.training.eloan.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.eloan.dto.UserDto;
import com.iiht.training.eloan.exception.ClerkNotFoundException;
import com.iiht.training.eloan.repository.UsersRepository;
import com.iiht.training.eloan.service.AdminService;
import com.iiht.training.eloan.service.util.EMParser;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public UserDto registerClerk(UserDto userDto) {
		
		if(userDto != null) {			
			
			String firstName = usersRepository.findByFirstName(userDto.getFirstName());
			if (firstName != null) {
				
				throw new ClerkNotFoundException("First Name# " + userDto.getFirstName() + " exists in DB");
			}			
			
			userDto = EMParser.parse(usersRepository.save(EMParser.parse(userDto)));
		}
		return userDto;
	}

	@Override
	public UserDto registerManager(UserDto userDto) {
		
		if(userDto != null) {			
			
			String firstName = usersRepository.findByFirstName(userDto.getFirstName());
			if (firstName != null) {
				
				throw new ClerkNotFoundException("First Name# " + userDto.getFirstName() + " exists in DB");
			}
			
			userDto = EMParser.parse(usersRepository.save(EMParser.parse(userDto)));
		}
		return userDto;
	}

	@Override
	public List<UserDto> getAllClerks(String roleName) {
		
		List<UserDto> allClerks = usersRepository.findAllByRole(roleName).stream().map(e->EMParser.parse(e)).collect(Collectors.toList());
		
		return allClerks;
	}

	@Override
	public List<UserDto> getAllManagers(String roleName) {
		
		List<UserDto> allManagers = usersRepository.findAllByRole(roleName).stream().map(e->EMParser.parse(e)).collect(Collectors.toList());
		
		return allManagers;
	}	

}
