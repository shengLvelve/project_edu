package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Teacher_status_card {
	private int teacher_status_card_id;
	private String teacher_status_card_value;
	public Teacher_status_card() {
		super();
	}
	public Teacher_status_card(int teacher_status_card_id, String teacher_status_card_value) {
		super();
		this.teacher_status_card_id = teacher_status_card_id;
		this.teacher_status_card_value = teacher_status_card_value;
	}
	public int getTeacher_status_card_id() {
		return teacher_status_card_id;
	}
	public void setTeacher_status_card_id(int teacher_status_card_id) {
		this.teacher_status_card_id = teacher_status_card_id;
	}
	public String getTeacher_status_card_value() {
		return teacher_status_card_value;
	}
	public void setTeacher_status_card_value(String teacher_status_card_value) {
		this.teacher_status_card_value = teacher_status_card_value;
	}
	@Override
	public String toString() {
		return "Teacher_status_card [teacher_status_card_id=" + teacher_status_card_id + ", teacher_status_card_value="
				+ teacher_status_card_value + "]";
	}
	
}
