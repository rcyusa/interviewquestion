package com.worldcup;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.worldcup.config.SecurityUtility;
import com.worldcup.domain.MatchResult;
import com.worldcup.domain.Matche;
import com.worldcup.domain.User;
import com.worldcup.domain.Team;
import com.worldcup.domain.security.Role;
import com.worldcup.domain.security.UserRole;
import com.worldcup.service.MatchResultService;
import com.worldcup.service.MatcheService;
import com.worldcup.service.TeamService;
import com.worldcup.service.UserService;

@SpringBootApplication
public class WorldCupApiApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(WorldCupApiApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setFirstName("user");
		user1.setLastName("user");
		user1.setUsername("user");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("user"));
		user1.setEmail("user@user.com");
		user1.setPhone("07889372283");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));
		
		userService.createUser(user1, userRoles);
		
		userRoles.clear();
		
		User user2 = new User();
		user2.setFirstName("Admin");
		user2.setLastName("Admin");
		user2.setUsername("admin");
		user2.setPassword(SecurityUtility.passwordEncoder().encode("admin"));
		user2.setEmail("admin@gmail.com");
		user2.setPhone("0788904628");
		Role role2 = new Role();
		role2.setRoleId(0);
		role2.setName("ROLE_ADMIN");
		userRoles.add(new UserRole(user2, role2));
		
		userService.createUser(user2, userRoles);
	}
	@Bean
	CommandLineRunner runner(TeamService teamService){
	    return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Team>> typeReference = new TypeReference<List<Team>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/teams.json");
			 
			try {
				List<Team> teams = mapper.readValue(inputStream,typeReference);
				teamService.save(teams);
				System.out.println("teams Saved!");
			} catch (IOException e){
				System.out.println("Unable to save teams: " + e.getMessage());
			}
	    };
	}
	@Bean
	CommandLineRunner runner1(MatcheService matcheService){
	    return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Matche>> typeReference = new TypeReference<List<Matche>>(){};
			
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/matches.json");
			 
			try {
				List<Matche> matches = mapper.readValue(inputStream,typeReference);
				matcheService.save(matches);
				System.out.println("matches Saved!");
			} catch (IOException e){
				System.out.println("Unable to save matches: " + e.getMessage());
			}
	    };
	}
	
	@Bean
	CommandLineRunner runner2(MatchResultService matchResultService){
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
