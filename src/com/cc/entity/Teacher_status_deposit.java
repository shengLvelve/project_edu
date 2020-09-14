package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Teacher_status_deposit {
	private int teacher_status_deposit_id;
	private String teacher_status_deposit_value;
	public Teacher_status_deposit() {
		super();
	}
	public Teacher_status_deposit(int teacher_status_deposit_id, String teacher_status_deposit_value) {
		super();
		this.teacher_status_deposit_id = teacher_status_deposit_id;
		this.teacher_status_deposit_value = teacher_status_deposit_value;
	}
	public int getTeacher_status_deposit_id() {
		return teacher_status_deposit_id;
	}
	public void setTeacher_status_deposit_id(int teacher_status_deposit_id) {
		this.teacher_status_deposit_id = teacher_status_deposit_id;
	}
	public String getTeacher_status_deposit_value() {
		return teacher_status_deposit_value;
	}
	public void setTeacher_status_deposit_value(String teacher_status_deposit_value) {
		this.teacher_status_deposit_value = teacher_status_deposit_value;
	}
	@Override
	public String toString() {
		return "Teacher_status_deposit [teacher_status_deposit_id=" + teacher_status_deposit_id
				+ ", teacher_status_deposit_value=" + teacher_status_deposit_value + "]";
	}
	
}
