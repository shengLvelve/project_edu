package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Teacher_teach_age {
	private int teacher_teach_age_id;
	private String teacher_teach_age_value;
	public Teacher_teach_age() {
		super();
	}
	public Teacher_teach_age(int teacher_teach_age_id, String teacher_teach_age_value) {
		super();
		this.teacher_teach_age_id = teacher_teach_age_id;
		this.teacher_teach_age_value = teacher_teach_age_value;
	}
	public int getTeacher_teach_age_id() {
		return teacher_teach_age_id;
	}
	public void setTeacher_teach_age_id(int teacher_teach_age_id) {
		this.teacher_teach_age_id = teacher_teach_age_id;
	}
	public String getTeacher_teach_age_value() {
		return teacher_teach_age_value;
	}
	public void setTeacher_teach_age_value(String teacher_teach_age_value) {
		this.teacher_teach_age_value = teacher_teach_age_value;
	}
	@Override
	public String toString() {
		return "Teacher_teach_age [teacher_teach_age_id=" + teacher_teach_age_id + ", teacher_teach_age_value="
				+ teacher_teach_age_value + "]";
	}
	
}
