package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Grade {
	private int grade_id;
	private String grade_value;
	public Grade() {
		super();
	}
	public Grade(int grade_id, String grade_value) {
		super();
		this.grade_id = grade_id;
		this.grade_value = grade_value;
	}
	public int getGrade_id() {
		return grade_id;
	}
	public void setGrade_id(int grade_id) {
		this.grade_id = grade_id;
	}
	public String getGrade_value() {
		return grade_value;
	}
	public void setGrade_value(String grade_value) {
		this.grade_value = grade_value;
	}
	@Override
	public String toString() {
		return "Grade [grade_id=" + grade_id + ", grade_value=" + grade_value + "]";
	}
	
}
