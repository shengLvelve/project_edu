package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Lecture {
	private int lecture_id;
//	private int lecture_teacher_id;
	private Teacher lecture_teacher_id;
	private double lecture_price;
//	private int lecture_status;
	private Lecture_status lecture_status;
	private String lecture_photo;
	private String lecture_video;
	private String lecture_introduction;
	private String lecture_name;

	public Lecture() {
		super();
	}

	public Lecture(int lecture_id, int lecture_teacher_id, double lecture_price, int lecture_status,
			String lecture_photo, String lecture_video, String lecture_introduction, String lecture_name) {
		super();
		this.lecture_id = lecture_id;
		this.lecture_teacher_id.setTeacher_id(lecture_teacher_id);
		this.lecture_price = lecture_price;
		this.lecture_status.setLecture_status_id(lecture_status);
		this.lecture_photo = lecture_photo;
		this.lecture_video = lecture_video;
		this.lecture_introduction = lecture_introduction;
		this.lecture_name = lecture_name;
	}

	public int getLecture_id() {
		return lecture_id;
	}

	public void setLecture_id(int lecture_id) {
		this.lecture_id = lecture_id;
	}

	public int getLecture_teacher_id() {
		return lecture_teacher_id.getTeacher_id();
	}

	public void setLecture_teacher_id(int lecture_teacher_id) {
		this.lecture_teacher_id.setTeacher_id(lecture_teacher_id);
	}

	public double getLecture_price() {
		return lecture_price;
	}

	public void setLecture_price(double lecture_price) {
		this.lecture_price = lecture_price;
	}

	public int getLecture_status() {
		return lecture_status.getLecture_status_id();
	}

	public void setLecture_status(int lecture_status) {
		this.lecture_status.setLecture_status_id(lecture_status);
	}

	public String getLecture_photo() {
		return lecture_photo;
	}

	public void setLecture_photo(String lecture_photo) {
		this.lecture_photo = lecture_photo;
	}

	public String getLecture_video() {
		return lecture_video;
	}

	public void setLecture_video(String lecture_video) {
		this.lecture_video = lecture_video;
	}

	public String getLecture_introduction() {
		return lecture_introduction;
	}

	public void setLecture_introduction(String lecture_introduction) {
		this.lecture_introduction = lecture_introduction;
	}

	public String getLecture_name() {
		return lecture_name;
	}

	public void setLecture_name(String lecture_name) {
		this.lecture_name = lecture_name;
	}

	@Override
	public String toString() {
		return "Lecture [lecture_id=" + lecture_id + ", lecture_teacher_id=" + lecture_teacher_id + ", lecture_price="
				+ lecture_price + ", lecture_status=" + lecture_status + ", lecture_photo=" + lecture_photo
				+ ", lecture_video=" + lecture_video + ", lecture_introduction=" + lecture_introduction
				+ ", lecture_name=" + lecture_name + "]";
	}

}
