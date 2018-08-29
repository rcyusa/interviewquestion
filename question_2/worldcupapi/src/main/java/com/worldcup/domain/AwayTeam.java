package com.worldcup.domain;


import javax.persistence.Embeddable;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class AwayTeam {
	@JsonProperty("country")
	private String away_team_country;
	@JsonProperty("code")
	private String away_team_code;
	@JsonProperty("goals")
	private String away_team_goals;
	
	public AwayTeam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AwayTeam(String away_team_country, String away_team_code, String away_team_goals) {
		super();
		this.away_team_country = away_team_country;
		this.away_team_code = away_team_code;
		this.away_team_goals = away_team_goals;
		
	}

	public String getAway_team_country() {
		return away_team_country;
	}

	public void setAway_team_country(String away_team_country) {
		this.away_team_country = away_team_country;
	}

	public String getAway_team_code() {
		return away_team_code;
	}

	public void setAway_team_code(String away_team_code) {
		this.away_team_code = away_team_code;
	}

	public String getAway_team_goals() {
		return away_team_goals;
	}

	public void setAway_team_goals(String away_team_goals) {
		this.away_team_goals = away_team_goals;
	}

	

}
