package com.worldcup.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.worldcup.domain.MatchResult;
import com.worldcup.repository.MatchResultRepository;


@Service
public class MatchResultService {
	
	private MatchResultRepository matchResultRepository;

    public MatchResultService(MatchResultRepository matchResultRepository) {
        this.matchResultRepository = matchResultRepository;
    }

    public Iterable<MatchResult> list() {
        return matchResultRepository.findAll();
    }

    public MatchResult save(MatchResult matchResult) {
        return matchResultRepository.save(matchResult);
    }

    public void save(List<MatchResult> matchResults) {
    	matchResultRepository.save(matchResults);
    }

    public Iterable<MatchResult>  bestRanked() {
        return matchResultRepository.bestRanked();
    }
    
    
    public MatchResult goalScored(String country) {
        return matchResultRepository.findBygoalScored(country);
    }
    public List<MatchResult> bestTeam(String group_letter) {
        return matchResultRepository.bestTeam(group_letter);
    }
}
