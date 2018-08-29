package com.worldcup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.worldcup.domain.MatchResult;

public interface MatchResultRepository extends CrudRepository<MatchResult, Long> {

	@Query("FROM MatchResult ORDER BY wins DESC")
	List<MatchResult> findAll();

	@Query(value = "select m from MatchResult m where m.fifa_code=:x")
	MatchResult findBygames_played(@Param("x") String fifaCode);

	//@Query(nativeQuery = true, value = "select * FROM MatchResult  ORDER BY points DESC,goal_differential DESC LIMIT 1")
	
	@Query("FROM MatchResult ORDER BY points DESC,goal_differential DESC")
	List<MatchResult> bestRanked();

}
