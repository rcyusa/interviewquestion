package com.worldcup.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.worldcup.domain.Team;
import com.worldcup.repository.TeamRepository;


@Service
public class TeamService {
	
	private TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Iterable<Team> list() {
        return teamRepository.findAll();
    }

    public Team save(Team team) {
        return teamRepository.save(team);
    }

    public void save(List<Team> teams) {
    	teamRepository.save(teams);
    }

	

}
