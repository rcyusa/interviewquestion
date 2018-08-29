package com.worldcup.service;

import java.util.List;
import org.springframework.stereotype.Service;


import com.worldcup.domain.Matche;
import com.worldcup.repository.MatcheRepository;

@Service
public class MatcheService {

	private MatcheRepository matcheRepository;

    public MatcheService(MatcheRepository matcheRepository) {
        this.matcheRepository = matcheRepository;
    }

    public Iterable<Matche> list() {
        return matcheRepository.findAll();
    }
    public Matche matcheById(Long id) {
        return matcheRepository.findOne(id);
    }
    public Matche save(Matche matche) {
        return matcheRepository.save(matche);
    }

    
    
    public void save(List<Matche> matches) {
    	matcheRepository.save(matches);
    }
    
	/*public List<Matche> matchesPlayed(String team) {
		return matcheRepository.matchesPlayed(team);
	}
*/
}
