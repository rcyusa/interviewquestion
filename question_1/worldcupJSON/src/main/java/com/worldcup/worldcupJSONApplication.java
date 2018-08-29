package com.worldcup;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.worldcup.domain.MatchResult;
import com.worldcup.service.MatchResultService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class worldcupJSONApplication {

	public static void main(String[] args) {
		SpringApplication.run(worldcupJSONApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(MatchResultService matchResultService){
	    return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<MatchResult>> typeReference = new TypeReference<List<MatchResult>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/match_results.json");
			 
			try {
				List<MatchResult> matchResults = mapper.readValue(inputStream,typeReference);
				matchResultService.save(matchResults);
				System.out.println("matchResults Saved!");
			} catch (IOException e){
				System.out.println("Unable to save matchResults: " + e.getMessage());
			}
	    };
	}
}
