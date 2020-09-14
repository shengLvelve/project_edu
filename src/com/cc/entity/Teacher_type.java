package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Teacher_type {
	private int teacher_type_id;
	private String teacher_type_value;

	public Teacher_type() {
		super();
	}
	
	public Teacher_type(int teacher_type_id, String teacher_type_value) {
		super();
		this.teacher_type_id = teacher_type_id;
		this.teacher_type_value = teacher_type_value;

	}

	@Override
	public String toString() {
		return "Type [teacher_type_id=" + teacher_type_id + ", teacher_type_value=" + teacher_type_value + "]";
	}
	public int getTeacher_type_id() {
		return teacher_type_id;
	}
	public void setTeacher_type_id(int teacher_type_id) {
		this.teacher_type_id = teacher_type_id;
	}
	public String getTeacher_type_value() {
		return teacher_type_value;
	}
	public void setTeacher_type_value(String teacher_type_value) {
		this.teacher_type_value = teacher_type_value;
	}
	
}
