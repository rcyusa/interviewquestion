package com.worldcup.repository;

import org.springframework.data.repository.CrudRepository;

import com.worldcup.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

}
