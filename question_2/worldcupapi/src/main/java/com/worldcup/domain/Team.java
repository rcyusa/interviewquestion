package com.worldcup.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Team {
	 @Id
	private Long id;	
	private String country;	
	private String alternate_name;	
	private String fifa_code;	
	private int group_id;	
	private String group_letter;
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAlternate_name() {
		return alternate_name;
	}
	public void setAlternate_name(String alternate_name) {
		this.alternate_name = alternate_name;
	}
	public String getFifa_code() {
		return fifa_code;
	}
	public void setFifa_code(String fifa_code) {
		this.fifa_code = fifa_code;
	}
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	public String getGroup_letter() {
		return group_letter;
	}
	public void setGroup_letter(String group_letter) {
		this.group_letter = group_letter;
	}

	
}
