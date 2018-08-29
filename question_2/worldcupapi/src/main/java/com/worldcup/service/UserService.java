package com.worldcup.service;

import java.util.List;
import java.util.Set;

import com.worldcup.domain.User;
import com.worldcup.domain.security.UserRole;

public interface UserService {
	
	User createUser(User user, Set<UserRole> userRoles);

	User findByUsername(String username);
	
	User findByEmail (String email);
	
	User save(User user);
	
	User findById(Long id);
	
	List<User> findAll();
	
	void removeOne(Long id);

	
}
