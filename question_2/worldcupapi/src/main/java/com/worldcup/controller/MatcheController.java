package com.worldcup.controller;


import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldcup.domain.Matche;
import com.worldcup.service.MatcheService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/matche/list")
public class MatcheController {

	private MatcheService matcheService;

    public MatcheController(MatcheService matcheService) {
        this.matcheService = matcheService;
    }
    @ApiOperation(value = "View a list of all Matches ")
    @RequestMapping("")
    public Iterable<Matche> list() {
        return matcheService.list();
    }
   /* @RequestMapping("/team/{team}")
    public List<Matche> matchesPlayed(String team) {
        return matcheService.matchesPlayed(team);
    }*/
}
