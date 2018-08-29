package com.worldcup.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.worldcup.domain.MatchResult;

import com.worldcup.service.MatchResultService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("app/teams")
public class MatchResultController {
	
	private MatchResultService matchResultService;

    public MatchResultController(MatchResultService matchResultService) {
        this.matchResultService = matchResultService;
    }
    @ApiOperation(value = "View a list of all Matches Result ")
    @GetMapping("/list")
    public Iterable<MatchResult> list() {
    	
    	
        return matchResultService.list();
    }
    @ApiOperation(value = "View a list of Best Ranked ")
    @GetMapping("/bestRanked")
    public Iterable<MatchResult>  bestRanked() {
    	
    	
       return matchResultService.bestRanked();
    }
    @ApiOperation(value = "View Games Played By a Team")
    @RequestMapping("/{fifa_code}/matches")
	public int oneMatchResult(@PathVariable("fifa_code") String fifa_code){
    	MatchResult matchResult=matchResultService.matchePlayed(fifa_code);
    	int games_played=matchResult.getGames_played();
        return games_played;
    	
	}
    @ApiOperation(value = "View Games wins By a Team")
    @RequestMapping("app/teams/{fifa_code}")
    public int played(@PathVariable("fifa_code") String fifa_code) {
    	MatchResult matchResult=matchResultService.matchePlayed(fifa_code);
    	int games_wins=matchResult.getWins();
        return games_wins;
    }
}
