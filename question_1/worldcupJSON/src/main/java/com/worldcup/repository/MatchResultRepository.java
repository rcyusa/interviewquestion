package com.worldcup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.worldcup.domain.MatchResult;

public interface MatchResultRepository extends CrudRepository<MatchResult, Long>{

	@Query("FROM MatchResult ORDER BY points DESC,goal_differential DESC")
	List<MatchResult> bestRanked();
	
	@Query(value = "select m from MatchResult m where m.country=:x")
	MatchResult findBygoalScored(@Param("x") String country);
	
	

	@Query(value = "select m from MatchResult m where m.group_letter=:x ORDER BY wins DESC")
	List<MatchResult> bestTeam(@Param("x") String group_letter);
}
