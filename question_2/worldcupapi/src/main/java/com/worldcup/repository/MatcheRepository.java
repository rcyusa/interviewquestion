package com.worldcup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.worldcup.domain.Matche;

public interface MatcheRepository extends CrudRepository<Matche, Long> {
	
	//@Query(nativeQuery = true, value = "SELECT * FROM matche m where m.home_team_country=:x or m.away_team_country=:x")
	//@Query("FROM Matche  ORDER BY home_team_country DESC,away_team_country DESC")
	//@Query(value = "SELECT * FROM matche ORDER BY home_team_country DESC,away_team_country DESC ", nativeQuery = true)
	//List<Matche> matchesPlayed(@Param("x") String team);

}
