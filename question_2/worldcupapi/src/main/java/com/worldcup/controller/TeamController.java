package com.worldcup.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.worldcup.domain.Team;
import com.worldcup.service.TeamService;


@RestController
@RequestMapping("/app/teams")
public class TeamController {
	
	private TeamService teamService;


    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @RequestMapping("")
    public Iterable<Team> list() {
        return teamService.list();
    }
    
   

}
