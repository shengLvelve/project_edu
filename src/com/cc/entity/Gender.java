package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Gender {
	private int gender_id;
	private String gender_value;
	
	public Gender() {
		super();
	}
	public Gender(int gender_id, String gender_value) {
		super();
		this.gender_id = gender_id;
		this.gender_value = gender_value;
		
	}
	public int getGender_id() {
		return gender_id;
	}
	public void setGender_id(int gender_id) {
		this.gender_id = gender_id;
	}
	public String getGender_value() {
		return gender_value;
	}
	public void setGender_value(String gender_value) {
		this.gender_value = gender_value;
	}

	
}
