package com.worldcup.domain;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class HomeTeamEvent {
	@JsonProperty("id")
	private String home_team_events_id;
	@JsonProperty("type_of_event")
	private String home_team_events_type_of_event;
	@JsonProperty("player")
	private String home_team_events_player;
	@JsonProperty("time")
	private String home_team_events_time;
	
	public HomeTeamEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public HomeTeamEvent(String home_team_events_id, String home_team_events_type_of_event, String home_team_events_player,
			String home_team_events_time) {
		super();
		this.home_team_events_id = home_team_events_id;
		this.home_team_events_type_of_event = home_team_events_type_of_event;
		this.home_team_events_player = home_team_events_player;
		this.home_team_events_time = home_team_events_time;
	}



	public String getHome_team_events_id() {
		return home_team_events_id;
	}

	public void setHome_team_events_id(String home_team_events_id) {
		this.home_team_events_id = home_team_events_id;
	}

	public String getHome_team_events_type_of_event() {
		return home_team_events_type_of_event;
	}

	public void setHome_team_events_type_of_event(String home_team_events_type_of_event) {
		this.home_team_events_type_of_event = home_team_events_type_of_event;
	}

	public String getHome_team_events_player() {
		return home_team_events_player;
	}

	public void setHome_team_events_player(String home_team_events_player) {
		this.home_team_events_player = home_team_events_player;
	}

	public String getHome_team_events_time() {
		return home_team_events_time;
	}

	public void setHome_team_events_time(String home_team_events_time) {
		this.home_team_events_time = home_team_events_time;
	}

	
}
