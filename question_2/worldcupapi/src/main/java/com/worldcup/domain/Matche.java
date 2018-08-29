package com.worldcup.domain;


import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Matche {
	
	private String venue;	
	private String location;	
	private String status;	
	private String time;
	@Id
	private String fifa_id;	
	@Embedded
	private HomeTeamStatistic home_team_statistics;
	@Embedded
	private AwayTeamStatistic away_team_statistics;	
	private Date datetime;	
	private Date last_event_update_at;	
	private Date last_score_update_at;	
	@Embedded
	private HomeTeam home_team;	
	@Embedded
	private AwayTeam away_team;	
	private String  winner;	
	private String winner_code;	
	@ElementCollection 
	private List<HomeTeamEvent> home_team_events;
	@ElementCollection 
	private List<AwayTeamEvent> away_team_events;
	
	public Matche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Matche(String venue, String location, String status, String time, String fifa_id,
			HomeTeamStatistic home_team_statistics, AwayTeamStatistic away_team_statistics, Date datetime,
			Date last_event_update_at, Date last_score_update_at, HomeTeam home_team, AwayTeam away_team, String winner,
			String winner_code, List<HomeTeamEvent> home_team_events, List<AwayTeamEvent> away_team_events) {
		super();
		this.venue = venue;
		this.location = location;
		this.status = status;
		this.time = time;
		this.fifa_id = fifa_id;
		this.home_team_statistics = home_team_statistics;
		this.away_team_statistics = away_team_statistics;
		this.datetime = datetime;
		this.last_event_update_at = last_event_update_at;
		this.last_score_update_at = last_score_update_at;
		this.home_team = home_team;
		this.away_team = away_team;
		this.winner = winner;
		this.winner_code = winner_code;
		this.home_team_events = home_team_events;
		this.away_team_events = away_team_events;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getFifa_id() {
		return fifa_id;
	}

	public void setFifa_id(String fifa_id) {
		this.fifa_id = fifa_id;
	}

	public HomeTeamStatistic getHome_team_statistics() {
		return home_team_statistics;
	}

	public void setHome_team_statistics(HomeTeamStatistic home_team_statistics) {
		this.home_team_statistics = home_team_statistics;
	}

	public AwayTeamStatistic getAway_team_statistics() {
		return away_team_statistics;
	}

	public void setAway_team_statistics(AwayTeamStatistic away_team_statistics) {
		this.away_team_statistics = away_team_statistics;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public Date getLast_event_update_at() {
		return last_event_update_at;
	}

	public void setLast_event_update_at(Date last_event_update_at) {
		this.last_event_update_at = last_event_update_at;
	}

	public Date getLast_score_update_at() {
		return last_score_update_at;
	}

	public void setLast_score_update_at(Date last_score_update_at) {
		this.last_score_update_at = last_score_update_at;
	}

	public HomeTeam getHome_team() {
		return home_team;
	}

	public void setHome_team(HomeTeam home_team) {
		this.home_team = home_team;
	}

	public AwayTeam getAway_team() {
		return away_team;
	}

	public void setAway_team(AwayTeam away_team) {
		this.away_team = away_team;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public String getWinner_code() {
		return winner_code;
	}

	public void setWinner_code(String winner_code) {
		this.winner_code = winner_code;
	}

	public List<HomeTeamEvent> getHome_team_events() {
		return home_team_events;
	}

	public void setHome_team_events(List<HomeTeamEvent> home_team_events) {
		this.home_team_events = home_team_events;
	}

	public List<AwayTeamEvent> getAway_team_events() {
		return away_team_events;
	}

	public void setAway_team_events(List<AwayTeamEvent> away_team_events) {
		this.away_team_events = away_team_events;
	}

	
}
