package com.iiht.training.eloan.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.training.eloan.dto.UserDto;
import com.iiht.training.eloan.exception.ManagerNotFoundException;
import com.iiht.training.eloan.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/register-clerk")
	public ResponseEntity<UserDto> registerClerk(@RequestBody @Valid UserDto userDto,
			BindingResult result) {
		
		ResponseEntity<UserDto> response = null;
		
		if(result.hasErrors()) {
			
			throw new ManagerNotFoundException(ExceptionApi.toErrMsg(result.getAllErrors()));
			
		} else {
			
			userDto = adminService.registerClerk(userDto);
			
			response = new ResponseEntity<UserDto>(userDto, HttpStatus.OK);
		}
		
		return response;
	}
	
	@PostMapping("/register-manager")
	public ResponseEntity<UserDto> registerManager(@RequestBody @Valid UserDto userDto,
			BindingResult result) {
		
		ResponseEntity<UserDto> response = null;
		
		if(result.hasErrors()) {
			
			throw new ManagerNotFoundException(ExceptionApi.toErrMsg(result.getAllErrors()));
			
		} else {			
			
			userDto = adminService.registerManager(userDto);
			
			response = new ResponseEntity<UserDto>(userDto, HttpStatus.OK);
		}
		
		return response;
	}	
	
	@GetMapping("/all-clerks/{role}")
	public ResponseEntity<List<UserDto>> getAllClerks(@PathVariable("role") String role){
		
		//List<UserDto> userDto = adminService.getAllClerks(role);
		return new ResponseEntity<List<UserDto>>(adminService.getAllClerks(role), HttpStatus.OK);
		
	}
	
	@GetMapping("/all-managers/{role}")
	public ResponseEntity<List<UserDto>> getAllManagers(@PathVariable("role") String role){
		
		return new ResponseEntity<List<UserDto>>(adminService.getAllClerks(role), HttpStatus.OK);
	}	
}
