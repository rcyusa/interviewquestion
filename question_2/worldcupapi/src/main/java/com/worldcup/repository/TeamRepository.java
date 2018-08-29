package com.worldcup.repository;

import org.springframework.data.repository.CrudRepository;

import com.worldcup.domain.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {

}
