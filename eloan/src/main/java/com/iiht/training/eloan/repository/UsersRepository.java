package com.iiht.training.eloan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.training.eloan.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
	
	String findByFirstName(String firstName);
	
	List<Users> findAllByRole(String role);

	boolean existsByRole(String roleName);

	Users findByRole(String roleName);

}
