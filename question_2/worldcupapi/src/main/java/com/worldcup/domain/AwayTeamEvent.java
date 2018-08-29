package com.worldcup.domain;



import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class AwayTeamEvent {
	@JsonProperty("id")
	private String away_team_events_id;
	@JsonProperty("type_of_event")
	private String away_team_events_type_of_event;
	@JsonProperty("player")
	private String away_team_events_player;
	@JsonProperty("time")
	private String away_team_events_time;
	
	public AwayTeamEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public AwayTeamEvent(String away_team_events_id, String away_team_events_type_of_event, String away_team_events_player,
			String away_team_events_time) {
		super();
		this.away_team_events_id = away_team_events_id;
		this.away_team_events_type_of_event = away_team_events_type_of_event;
		this.away_team_events_player = away_team_events_player;
		this.away_team_events_time = away_team_events_time;
	}


	public String getAway_team_events_id() {
		return away_team_events_id;
	}

	public void setAway_team_events_id(String away_team_events_id) {
		this.away_team_events_id = away_team_events_id;
	}

	public String getAway_team_events_type_of_event() {
		return away_team_events_type_of_event;
	}

	public void setAway_team_events_type_of_event(String away_team_events_type_of_event) {
		this.away_team_events_type_of_event = away_team_events_type_of_event;
	}

	public String getAway_team_events_player() {
		return away_team_events_player;
	}

	public void setAway_team_events_player(String away_team_events_player) {
		this.away_team_events_player = away_team_events_player;
	}

	public String getAway_team_events_time() {
		return away_team_events_time;
	}

	public void setAway_team_events_time(String away_team_events_time) {
		this.away_team_events_time = away_team_events_time;
	}

	
}
