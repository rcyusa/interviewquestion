package com.worldcup.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldcup.domain.MatchResult;
import com.worldcup.service.MatchResultService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/rest")
public class MatchResultController {
	
	private MatchResultService matchResultService;

    public MatchResultController(MatchResultService matchResultService) {
        this.matchResultService = matchResultService;
    }
    @ApiOperation(value = "View a list of available Matches Result")
	@ApiResponses(value={
			@ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
			})
    @RequestMapping("/list")
    public Iterable<MatchResult> list() {
        return matchResultService.list();
    }

    @GetMapping("/bestRanked")
    public Iterable<MatchResult>  bestRanked() {
    	
    	
       return matchResultService.bestRanked();
    }
    
    @RequestMapping("goalscored/{country}")
    public int goalScored(@PathVariable("country") String country) {
    	MatchResult matchResult=matchResultService.goalScored(country);
    	int goalScored=matchResult.getGoals_for();
        return goalScored;
    }
    
    @RequestMapping("team/won/{country}")
    public int teamwon(@PathVariable("country") String country) {
    	MatchResult matchResult=matchResultService.goalScored(country);
    	int teamwon=matchResult.getWins();
        return teamwon;
    }
    
    @GetMapping("/bestTeam/{group_letter}")
    public List<MatchResult> bestTeam(@PathVariable("group_letter") String group_letter) {
    	
       return matchResultService.bestTeam(group_letter);
    }
}
