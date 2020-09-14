package com.cc.entity;

public class Lecture_keyword {
	private int lecture_keyword_id;
	private String lecture_keyword_value;
	public Lecture_keyword() {
		super();
	}
	public Lecture_keyword(int lecture_keyword_id, String lecture_keyword_value) {
		super();
		this.lecture_keyword_id = lecture_keyword_id;
		this.lecture_keyword_value = lecture_keyword_value;
	}
	public int getLecture_keyword_id() {
		return lecture_keyword_id;
	}
	public void setLecture_keyword_id(int lecture_keyword_id) {
		this.lecture_keyword_id = lecture_keyword_id;
	}
	public String getLecture_keyword_value() {
		return lecture_keyword_value;
	}
	public void setLecture_keyword_value(String lecture_keyword_value) {
		this.lecture_keyword_value = lecture_keyword_value;
	}
	@Override
	public String toString() {
		return "Lecture_keyword [lecture_keyword_id=" + lecture_keyword_id + ", lecture_keyword_value="
				+ lecture_keyword_value + "]";
	}
	
}
