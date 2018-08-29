package com.worldcup.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.worldcup.domain.MatchResult;
import com.worldcup.domain.Matche;
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
    public MatchResult matchResultById(Long id) {
        return matchResultRepository.findOne(id);
    }
    public MatchResult save(MatchResult matchResult) {
        return matchResultRepository.save(matchResult);
    }

    public MatchResult matchePlayed(String fifaCode) {
        return matchResultRepository.findBygames_played(fifaCode);
    }
    
    public void save(List<MatchResult> matchResults) {
    	matchResultRepository.save(matchResults);
    }
    
    public Iterable<MatchResult>  bestRanked() {
        return matchResultRepository.bestRanked();
    }

}
