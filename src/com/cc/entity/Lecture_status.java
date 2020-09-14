package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Lecture_status {
	private int lecture_status_id;
	private String lecture_status_value;
	public Lecture_status() {
		super();
	}
	public Lecture_status(int lecture_status_id, String lecture_status_value) {
		super();
		this.lecture_status_id = lecture_status_id;
		this.lecture_status_value = lecture_status_value;
	}
	public int getLecture_status_id() {
		return lecture_status_id;
	}
	public void setLecture_status_id(int lecture_status_id) {
		this.lecture_status_id = lecture_status_id;
	}
	public String getLecture_status_value() {
		return lecture_status_value;
	}
	public void setLecture_status_value(String lecture_status_value) {
		this.lecture_status_value = lecture_status_value;
	}
	@Override
	public String toString() {
		return "Lecture_status [lecture_status_id=" + lecture_status_id + ", lecture_status_value="
				+ lecture_status_value + "]";
	}
	
}
