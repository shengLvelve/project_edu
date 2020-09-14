package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Teacher_class_time {
	private int teacher_class_time_id;
	private String teacher_class_time_value;
	public Teacher_class_time() {
		super();
	}
	public Teacher_class_time(int teacher_class_time_id, String teacher_class_time_value) {
		super();
		this.teacher_class_time_id = teacher_class_time_id;
		this.teacher_class_time_value = teacher_class_time_value;
	}
	public int getTeacher_class_time_id() {
		return teacher_class_time_id;
	}
	public void setTeacher_class_time_id(int teacher_class_time_id) {
		this.teacher_class_time_id = teacher_class_time_id;
	}
	public String getTeacher_class_time_value() {
		return teacher_class_time_value;
	}
	public void setTeacher_class_time_value(String teacher_class_time_value) {
		this.teacher_class_time_value = teacher_class_time_value;
	}
	@Override
	public String toString() {
		return "Teacher_class_time [teacher_class_time_id=" + teacher_class_time_id + ", teacher_class_time_value="
				+ teacher_class_time_value + "]";
	}
	
}
