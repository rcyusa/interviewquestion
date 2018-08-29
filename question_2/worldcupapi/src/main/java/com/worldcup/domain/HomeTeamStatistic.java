package com.worldcup.domain;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class HomeTeamStatistic {
	@JsonProperty("attempts_on_goal")
	private String home_team_statistic_attempts_on_goal;
	@JsonProperty("on_target")
	private String home_team_statistic_on_target;
	@JsonProperty("off_target")
	private String home_team_statistic_off_target;	
	@JsonProperty("blocked")
	private String home_team_statistic_blocked;
	@JsonProperty("woodwork")
	private String home_team_statistic_woodwork;	
	@JsonProperty("corners")
	private String home_team_statistic_corners;
	@JsonProperty("offsides")
	private String home_team_statistic_offsides;
	@JsonProperty("ball_possession")
	private String home_team_statistic_ball_possession;
	@JsonProperty("pass_accuracy")
	private String home_team_statistic_pass_accuracy;
	@JsonProperty("num_passes")
	private String home_team_statistic_num_passes;
	@JsonProperty("passes_completed")
	private String home_team_statistic_passes_completed;
	@JsonProperty("distance_covered")
	private String home_team_statistic_distance_covered;
	@JsonProperty("balls_recovered")
	private String home_team_statistic_balls_recovered;
	@JsonProperty("tackles")
	private String home_team_statistic_tackles;
	@JsonProperty("clearances")
	private String home_team_statistic_clearances;
	@JsonProperty("yellow_cards")
	private String home_team_statistic_yellow_cards;
	@JsonProperty("red_cards")
	private String home_team_statistic_red_cards;
	@JsonProperty("fouls_committed")
	private String home_team_statistic_fouls_committed;
	@JsonProperty("country")
	private String home_team_statistic_country;
	public HomeTeamStatistic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HomeTeamStatistic(String home_team_statistic_attempts_on_goal, String home_team_statistic_on_target,
			String home_team_statistic_off_target, String home_team_statistic_blocked,
			String home_team_statistic_woodwork, String home_team_statistic_corners,
			String home_team_statistic_offsides, String home_team_statistic_ball_possession,
			String home_team_statistic_pass_accuracy, String home_team_statistic_num_passes,
			String home_team_statistic_passes_completed, String home_team_statistic_distance_covered,
			String home_team_statistic_balls_recovered, String home_team_statistic_tackles,
			String home_team_statistic_clearances, String home_team_statistic_yellow_cards,
			String home_team_statistic_red_cards, String home_team_statistic_fouls_committed,
			String home_team_statistic_country) {
		super();
		this.home_team_statistic_attempts_on_goal = home_team_statistic_attempts_on_goal;
		this.home_team_statistic_on_target = home_team_statistic_on_target;
		this.home_team_statistic_off_target = home_team_statistic_off_target;
		this.home_team_statistic_blocked = home_team_statistic_blocked;
		this.home_team_statistic_woodwork = home_team_statistic_woodwork;
		this.home_team_statistic_corners = home_team_statistic_corners;
		this.home_team_statistic_offsides = home_team_statistic_offsides;
		this.home_team_statistic_ball_possession = home_team_statistic_ball_possession;
		this.home_team_statistic_pass_accuracy = home_team_statistic_pass_accuracy;
		this.home_team_statistic_num_passes = home_team_statistic_num_passes;
		this.home_team_statistic_passes_completed = home_team_statistic_passes_completed;
		this.home_team_statistic_distance_covered = home_team_statistic_distance_covered;
		this.home_team_statistic_balls_recovered = home_team_statistic_balls_recovered;
		this.home_team_statistic_tackles = home_team_statistic_tackles;
		this.home_team_statistic_clearances = home_team_statistic_clearances;
		this.home_team_statistic_yellow_cards = home_team_statistic_yellow_cards;
		this.home_team_statistic_red_cards = home_team_statistic_red_cards;
		this.home_team_statistic_fouls_committed = home_team_statistic_fouls_committed;
		this.home_team_statistic_country = home_team_statistic_country;
	}
	public String getHome_team_statistic_attempts_on_goal() {
		return home_team_statistic_attempts_on_goal;
	}
	public void setHome_team_statistic_attempts_on_goal(String home_team_statistic_attempts_on_goal) {
		this.home_team_statistic_attempts_on_goal = home_team_statistic_attempts_on_goal;
	}
	public String getHome_team_statistic_on_target() {
		return home_team_statistic_on_target;
	}
	public void setHome_team_statistic_on_target(String home_team_statistic_on_target) {
		this.home_team_statistic_on_target = home_team_statistic_on_target;
	}
	public String getHome_team_statistic_off_target() {
		return home_team_statistic_off_target;
	}
	public void setHome_team_statistic_off_target(String home_team_statistic_off_target) {
		this.home_team_statistic_off_target = home_team_statistic_off_target;
	}
	public String getHome_team_statistic_blocked() {
		return home_team_statistic_blocked;
	}
	public void setHome_team_statistic_blocked(String home_team_statistic_blocked) {
		this.home_team_statistic_blocked = home_team_statistic_blocked;
	}
	public String getHome_team_statistic_woodwork() {
		return home_team_statistic_woodwork;
	}
	public void setHome_team_statistic_woodwork(String home_team_statistic_woodwork) {
		this.home_team_statistic_woodwork = home_team_statistic_woodwork;
	}
	public String getHome_team_statistic_corners() {
		return home_team_statistic_corners;
	}
	public void setHome_team_statistic_corners(String home_team_statistic_corners) {
		this.home_team_statistic_corners = home_team_statistic_corners;
	}
	public String getHome_team_statistic_offsides() {
		return home_team_statistic_offsides;
	}
	public void setHome_team_statistic_offsides(String home_team_statistic_offsides) {
		this.home_team_statistic_offsides = home_team_statistic_offsides;
	}
	public String getHome_team_statistic_ball_possession() {
		return home_team_statistic_ball_possession;
	}
	public void setHome_team_statistic_ball_possession(String home_team_statistic_ball_possession) {
		this.home_team_statistic_ball_possession = home_team_statistic_ball_possession;
	}
	public String getHome_team_statistic_pass_accuracy() {
		return home_team_statistic_pass_accuracy;
	}
	public void setHome_team_statistic_pass_accuracy(String home_team_statistic_pass_accuracy) {
		this.home_team_statistic_pass_accuracy = home_team_statistic_pass_accuracy;
	}
	public String getHome_team_statistic_num_passes() {
		return home_team_statistic_num_passes;
	}
	public void setHome_team_statistic_num_passes(String home_team_statistic_num_passes) {
		this.home_team_statistic_num_passes = home_team_statistic_num_passes;
	}
	public String getHome_team_statistic_passes_completed() {
		return home_team_statistic_passes_completed;
	}
	public void setHome_team_statistic_passes_completed(String home_team_statistic_passes_completed) {
		this.home_team_statistic_passes_completed = home_team_statistic_passes_completed;
	}
	public String getHome_team_statistic_distance_covered() {
		return home_team_statistic_distance_covered;
	}
	public void setHome_team_statistic_distance_covered(String home_team_statistic_distance_covered) {
		this.home_team_statistic_distance_covered = home_team_statistic_distance_covered;
	}
	public String getHome_team_statistic_balls_recovered() {
		return home_team_statistic_balls_recovered;
	}
	public void setHome_team_statistic_balls_recovered(String home_team_statistic_balls_recovered) {
		this.home_team_statistic_balls_recovered = home_team_statistic_balls_recovered;
	}
	public String getHome_team_statistic_tackles() {
		return home_team_statistic_tackles;
	}
	public void setHome_team_statistic_tackles(String home_team_statistic_tackles) {
		this.home_team_statistic_tackles = home_team_statistic_tackles;
	}
	public String getHome_team_statistic_clearances() {
		return home_team_statistic_clearances;
	}
	public void setHome_team_statistic_clearances(String home_team_statistic_clearances) {
		this.home_team_statistic_clearances = home_team_statistic_clearances;
	}
	public String getHome_team_statistic_yellow_cards() {
		return home_team_statistic_yellow_cards;
	}
	public void setHome_team_statistic_yellow_cards(String home_team_statistic_yellow_cards) {
		this.home_team_statistic_yellow_cards = home_team_statistic_yellow_cards;
	}
	public String getHome_team_statistic_red_cards() {
		return home_team_statistic_red_cards;
	}
	public void setHome_team_statistic_red_cards(String home_team_statistic_red_cards) {
		this.home_team_statistic_red_cards = home_team_statistic_red_cards;
	}
	public String getHome_team_statistic_fouls_committed() {
		return home_team_statistic_fouls_committed;
	}
	public void setHome_team_statistic_fouls_committed(String home_team_statistic_fouls_committed) {
		this.home_team_statistic_fouls_committed = home_team_statistic_fouls_committed;
	}
	public String getHome_team_statistic_country() {
		return home_team_statistic_country;
	}
	public void setHome_team_statistic_country(String home_team_statistic_country) {
		this.home_team_statistic_country = home_team_statistic_country;
	}
	
}
