package com.cc.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Lecture_evaluation {
	private int lecture_evaluation_id;
//	private int lecture_evaluation_type;
	private Type lecture_evaluation_type;
	private int lecture_evaluation_usr_id;
	private String lecture_evaluation_content;
	private int lecture_evaluation_star;
	private Date lecture_evaluation_datetime;
//	private int lecture_evaluation_lecture_id;
	private Lecture lecture_evaluation_lecture_id;
	public Lecture_evaluation() {
		super();
	}
	public Lecture_evaluation(int lecture_evaluation_id, int lecture_evaluation_type, int lecture_evaluation_usr_id,
			String lecture_evaluation_content, int lecture_evaluation_star, Date lecture_evaluation_datetime,
			int lecture_evaluation_lecture_id) {
		super();
		this.lecture_evaluation_id = lecture_evaluation_id;
		this.lecture_evaluation_type.setType_id(lecture_evaluation_type);
		this.lecture_evaluation_usr_id = lecture_evaluation_usr_id;
		this.lecture_evaluation_content = lecture_evaluation_content;
		this.lecture_evaluation_star = lecture_evaluation_star;
		this.lecture_evaluation_datetime = lecture_evaluation_datetime;
		this.lecture_evaluation_lecture_id.setLecture_id(lecture_evaluation_lecture_id);
	}
	public int getLecture_evaluation_id() {
		return lecture_evaluation_id;
	}
	public void setLecture_evaluation_id(int lecture_evaluation_id) {
		this.lecture_evaluation_id = lecture_evaluation_id;
	}
	public int getLecture_evaluation_type() {
		return lecture_evaluation_type.getType_id();
	}
	public void setLecture_evaluation_type(int lecture_evaluation_type) {
		this.lecture_evaluation_type.setType_id(lecture_evaluation_type);
	}
	public int getLecture_evaluation_usr_id() {
		return lecture_evaluation_usr_id;
	}
	public void setLecture_evaluation_usr_id(int lecture_evaluation_usr_id) {
		this.lecture_evaluation_usr_id = lecture_evaluation_usr_id;
	}
	public String getLecture_evaluation_content() {
		return lecture_evaluation_content;
	}
	public void setLecture_evaluation_content(String lecture_evaluation_content) {
		this.lecture_evaluation_content = lecture_evaluation_content;
	}
	public int getLecture_evaluation_star() {
		return lecture_evaluation_star;
	}
	public void setLecture_evaluation_star(int lecture_evaluation_star) {
		this.lecture_evaluation_star = lecture_evaluation_star;
	}
	public Date getLecture_evaluation_datetime() {
		return lecture_evaluation_datetime;
	}
	public void setLecture_evaluation_datetime(Date lecture_evaluation_datetime) {
		this.lecture_evaluation_datetime = lecture_evaluation_datetime;
	}
	public int getLecture_evaluation_lecture_id() {
		return lecture_evaluation_lecture_id.getLecture_id();
	}
	public void setLecture_evaluation_lecture_id(int lecture_evaluation_lecture_id) {
		this.lecture_evaluation_lecture_id.setLecture_id(lecture_evaluation_lecture_id);
	}
	@Override
	public String toString() {
		return "Lecture_evaluation [lecture_evaluation_id=" + lecture_evaluation_id + ", lecture_evaluation_type="
				+ lecture_evaluation_type + ", lecture_evaluation_usr_id=" + lecture_evaluation_usr_id
				+ ", lecture_evaluation_content=" + lecture_evaluation_content + ", lecture_evaluation_star="
				+ lecture_evaluation_star + ", lecture_evaluation_datetime=" + lecture_evaluation_datetime
				+ ", lecture_evaluation_lecture_id=" + lecture_evaluation_lecture_id + "]";
	}
	
	
}
