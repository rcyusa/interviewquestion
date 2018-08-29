package com.worldcup.domain;


import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class AwayTeamStatistic {
    @JsonProperty("attempts_on_goal")
	private String away_team_statistic_attempts_on_goal;
    @JsonProperty("on_target")
	private String away_team_statistic_on_target;
    @JsonProperty("off_target")
	private String away_team_statistic_off_target;
    @JsonProperty("blocked")
	private String away_team_statistic_blocked;
    @JsonProperty("woodwork")
	private String away_team_statistic_woodwork;
    @JsonProperty("corners")
	private String away_team_statistic_corners;
    @JsonProperty("offsides")
	private String away_team_statistic_offsides;
    @JsonProperty("ball_possession")
	private String away_team_statistic_ball_possession;
    @JsonProperty("pass_accuracy")
	private String away_team_statistic_pass_accuracy;
    @JsonProperty("num_passes")
	private String away_team_statistic_num_passes;
    @JsonProperty("passes_completed")
	private String away_team_statistic_passes_completed;
    @JsonProperty("distance_covered")
	private String away_team_statistic_distance_covered;
    @JsonProperty("balls_recovered")
	private String away_team_statistic_balls_recovered;
    @JsonProperty("tackles")
	private String away_team_statistic_tackles;
    @JsonProperty("clearances")
	private String away_team_statistic_clearances;
    @JsonProperty("yellow_cards")
	private String away_team_statistic_yellow_cards;
    @JsonProperty("red_cards")
	private String away_team_statistic_red_cards;	
    @JsonProperty("fouls_committed")
	private String away_team_statistic_fouls_committed;
    @JsonProperty("country")
	private String away_team_statistic_country;
	public AwayTeamStatistic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AwayTeamStatistic(String away_team_statistic_attempts_on_goal, String away_team_statistic_on_target,
			String away_team_statistic_off_target, String away_team_statistic_blocked, String away_team_statistic_woodwork,
			String away_team_statistic_corners, String away_team_statistic_offsides, String away_team_statistic_ball_possession,
			String away_team_statistic_pass_accuracy, String away_team_statistic_num_passes,
			String away_team_statistic_passes_completed, String away_team_statistic_distance_covered,
			String away_team_statistic_balls_recovered, String away_team_statistic_tackles,
			String away_team_statistic_clearances, String away_team_statistic_yellow_cards, String away_team_statistic_red_cards,
			String away_team_statistic_fouls_committed, String away_team_statistic_country) {
		super();
		this.away_team_statistic_attempts_on_goal = away_team_statistic_attempts_on_goal;
		this.away_team_statistic_on_target = away_team_statistic_on_target;
		this.away_team_statistic_off_target = away_team_statistic_off_target;
		this.away_team_statistic_blocked = away_team_statistic_blocked;
		this.away_team_statistic_woodwork = away_team_statistic_woodwork;
		this.away_team_statistic_corners = away_team_statistic_corners;
		this.away_team_statistic_offsides = away_team_statistic_offsides;
		this.away_team_statistic_ball_possession = away_team_statistic_ball_possession;
		this.away_team_statistic_pass_accuracy = away_team_statistic_pass_accuracy;
		this.away_team_statistic_num_passes = away_team_statistic_num_passes;
		this.away_team_statistic_passes_completed = away_team_statistic_passes_completed;
		this.away_team_statistic_distance_covered = away_team_statistic_distance_covered;
		this.away_team_statistic_balls_recovered = away_team_statistic_balls_recovered;
		this.away_team_statistic_tackles = away_team_statistic_tackles;
		this.away_team_statistic_clearances = away_team_statistic_clearances;
		this.away_team_statistic_yellow_cards = away_team_statistic_yellow_cards;
		this.away_team_statistic_red_cards = away_team_statistic_red_cards;
		this.away_team_statistic_fouls_committed = away_team_statistic_fouls_committed;
		this.away_team_statistic_country = away_team_statistic_country;
	}
	public String getAway_team_statistic_attempts_on_goal() {
		return away_team_statistic_attempts_on_goal;
	}
	public void setAway_team_statistic_attempts_on_goal(String away_team_statistic_attempts_on_goal) {
		this.away_team_statistic_attempts_on_goal = away_team_statistic_attempts_on_goal;
	}
	public String getAway_team_statistic_on_target() {
		return away_team_statistic_on_target;
	}
	public void setAway_team_statistic_on_target(String away_team_statistic_on_target) {
		this.away_team_statistic_on_target = away_team_statistic_on_target;
	}
	public String getAway_team_statistic_off_target() {
		return away_team_statistic_off_target;
	}
	public void setAway_team_statistic_off_target(String away_team_statistic_off_target) {
		this.away_team_statistic_off_target = away_team_statistic_off_target;
	}
	public String getAway_team_statistic_blocked() {
		return away_team_statistic_blocked;
	}
	public void setAway_team_statistic_blocked(String away_team_statistic_blocked) {
		this.away_team_statistic_blocked = away_team_statistic_blocked;
	}
	public String getAway_team_statistic_woodwork() {
		return away_team_statistic_woodwork;
	}
	public void setAway_team_statistic_woodwork(String away_team_statistic_woodwork) {
		this.away_team_statistic_woodwork = away_team_statistic_woodwork;
	}
	public String getAway_team_statistic_corners() {
		return away_team_statistic_corners;
	}
	public void setAway_team_statistic_corners(String away_team_statistic_corners) {
		this.away_team_statistic_corners = away_team_statistic_corners;
	}
	public String getAway_team_statistic_offsides() {
		return away_team_statistic_offsides;
	}
	public void setAway_team_statistic_offsides(String away_team_statistic_offsides) {
		this.away_team_statistic_offsides = away_team_statistic_offsides;
	}
	public String getAway_team_statistic_ball_possession() {
		return away_team_statistic_ball_possession;
	}
	public void setAway_team_statistic_ball_possession(String away_team_statistic_ball_possession) {
		this.away_team_statistic_ball_possession = away_team_statistic_ball_possession;
	}
	public String getAway_team_statistic_pass_accuracy() {
		return away_team_statistic_pass_accuracy;
	}
	public void setAway_team_statistic_pass_accuracy(String away_team_statistic_pass_accuracy) {
		this.away_team_statistic_pass_accuracy = away_team_statistic_pass_accuracy;
	}
	public String getAway_team_statistic_num_passes() {
		return away_team_statistic_num_passes;
	}
	public void setAway_team_statistic_num_passes(String away_team_statistic_num_passes) {
		this.away_team_statistic_num_passes = away_team_statistic_num_passes;
	}
	public String getAway_team_statistic_passes_completed() {
		return away_team_statistic_passes_completed;
	}
	public void setAway_team_statistic_passes_completed(String away_team_statistic_passes_completed) {
		this.away_team_statistic_passes_completed = away_team_statistic_passes_completed;
	}
	public String getAway_team_statistic_distance_covered() {
		return away_team_statistic_distance_covered;
	}
	public void setAway_team_statistic_distance_covered(String away_team_statistic_distance_covered) {
		this.away_team_statistic_distance_covered = away_team_statistic_distance_covered;
	}
	public String getAway_team_statistic_balls_recovered() {
		return away_team_statistic_balls_recovered;
	}
	public void setAway_team_statistic_balls_recovered(String away_team_statistic_balls_recovered) {
		this.away_team_statistic_balls_recovered = away_team_statistic_balls_recovered;
	}
	public String getAway_team_statistic_tackles() {
		return away_team_statistic_tackles;
	}
	public void setAway_team_statistic_tackles(String away_team_statistic_tackles) {
		this.away_team_statistic_tackles = away_team_statistic_tackles;
	}
	public String getAway_team_statistic_clearances() {
		return away_team_statistic_clearances;
	}
	public void setAway_team_statistic_clearances(String away_team_statistic_clearances) {
		this.away_team_statistic_clearances = away_team_statistic_clearances;
	}
	public String getAway_team_statistic_yellow_cards() {
		return away_team_statistic_yellow_cards;
	}
	public void setAway_team_statistic_yellow_cards(String away_team_statistic_yellow_cards) {
		this.away_team_statistic_yellow_cards = away_team_statistic_yellow_cards;
	}
	public String getAway_team_statistic_red_cards() {
		return away_team_statistic_red_cards;
	}
	public void setAway_team_statistic_red_cards(String away_team_statistic_red_cards) {
		this.away_team_statistic_red_cards = away_team_statistic_red_cards;
	}
	public String getAway_team_statistic_fouls_committed() {
		return away_team_statistic_fouls_committed;
	}
	public void setAway_team_statistic_fouls_committed(String away_team_statistic_fouls_committed) {
		this.away_team_statistic_fouls_committed = away_team_statistic_fouls_committed;
	}
	public String getAway_team_statistic_country() {
		return away_team_statistic_country;
	}
	public void setAway_team_statistic_country(String away_team_statistic_country) {
		this.away_team_statistic_country = away_team_statistic_country;
	}
	
				
}
