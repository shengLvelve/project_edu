package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Teacher_class_date {
	private int teacher_class_date_id;
	private String teacher_class_date_value;
	public Teacher_class_date() {
		super();
	}
	public Teacher_class_date(int teacher_class_date_id, String teacher_class_date_value) {
		super();
		this.teacher_class_date_id = teacher_class_date_id;
		this.teacher_class_date_value = teacher_class_date_value;
	}
	public int getTeacher_class_date_id() {
		return teacher_class_date_id;
	}
	public void setTeacher_class_date_id(int teacher_class_date_id) {
		this.teacher_class_date_id = teacher_class_date_id;
	}
	public String getTeacher_class_date_value() {
		return teacher_class_date_value;
	}
	public void setTeacher_class_date_value(String teacher_class_date_value) {
		this.teacher_class_date_value = teacher_class_date_value;
	}
	@Override
	public String toString() {
		return "Teacher_class_date [teacher_class_date_id=" + teacher_class_date_id + ", teacher_class_date_value="
				+ teacher_class_date_value + "]";
	}
	
}
