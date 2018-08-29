package com.worldcup.domain;


import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class HomeTeam {
	@JsonProperty("country")
	private String home_team_country;
	@JsonProperty("code")
	private String home_team_code;
	@JsonProperty("goals")
	private String home_team_goals;
	
	
	public HomeTeam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HomeTeam(String home_team_country, String home_team_code, String home_team_goals) {
		super();
		this.home_team_country = home_team_country;
		this.home_team_code = home_team_code;
		this.home_team_goals = home_team_goals;
		
	}

	public String getHome_team_country() {
		return home_team_country;
	}

	public void setHome_team_country(String home_team_country) {
		this.home_team_country = home_team_country;
	}

	public String getHome_team_code() {
		return home_team_code;
	}

	public void setHome_team_code(String home_team_code) {
		this.home_team_code = home_team_code;
	}

	public String getHome_team_goals() {
		return home_team_goals;
	}

	public void setHome_team_goals(String home_team_goals) {
		this.home_team_goals = home_team_goals;
	}

	
}
