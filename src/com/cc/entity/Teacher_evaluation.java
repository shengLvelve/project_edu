package com.cc.entity;

import org.springframework.stereotype.Component;

import net.sf.jsqlparser.expression.DateTimeLiteralExpression.DateTime;

@Component
public class Teacher_evaluation {

	private Long teacher_evaluation_id;
	private Long teacher_evaluation_stu_id;
	private Long teacher_evaluation_teacher_id;
	private String teacher_evaluation_content;
	private Long teacher_evaluation_star;
	private DateTime teacher_evaluation_datetime;
	public Long getTeacher_evaluation_id() {
		return teacher_evaluation_id;
	}
	public void setTeacher_evaluation_id(Long teacher_evaluation_id) {
		this.teacher_evaluation_id = teacher_evaluation_id;
	}
	public Long getTeacher_evaluation_stu_id() {
		return teacher_evaluation_stu_id;
	}
	public void setTeacher_evaluation_stu_id(Long teacher_evaluation_stu_id) {
		this.teacher_evaluation_stu_id = teacher_evaluation_stu_id;
	}
	public Long getTeacher_evaluation_teacher_id() {
		return teacher_evaluation_teacher_id;
	}
	public void setTeacher_evaluation_teacher_id(Long teacher_evaluation_teacher_id) {
		this.teacher_evaluation_teacher_id = teacher_evaluation_teacher_id;
	}
	public String getTeacher_evaluation_content() {
		return teacher_evaluation_content;
	}
	public void setTeacher_evaluation_content(String teacher_evaluation_content) {
		this.teacher_evaluation_content = teacher_evaluation_content;
	}
	public Long getTeacher_evaluation_star() {
		return teacher_evaluation_star;
	}
	public void setTeacher_evaluation_star(Long teacher_evaluation_star) {
		this.teacher_evaluation_star = teacher_evaluation_star;
	}
	public DateTime getTeacher_evaluation_datetime() {
		return teacher_evaluation_datetime;
	}
	public void setTeacher_evaluation_datetime(DateTime teacher_evaluation_datetime) {
		this.teacher_evaluation_datetime = teacher_evaluation_datetime;
	}
	@Override
	public String toString() {
		return "Teacher_evaluation [teacher_evaluation_id=" + teacher_evaluation_id + ", teacher_evaluation_stu_id="
				+ teacher_evaluation_stu_id + ", teacher_evaluation_teacher_id=" + teacher_evaluation_teacher_id
				+ ", teacher_evaluation_content=" + teacher_evaluation_content + ", teacher_evaluation_star="
				+ teacher_evaluation_star + ", teacher_evaluation_datetime=" + teacher_evaluation_datetime + "]";
	}
	public Teacher_evaluation(Long teacher_evaluation_id, Long teacher_evaluation_stu_id,
			Long teacher_evaluation_teacher_id, String teacher_evaluation_content, Long teacher_evaluation_star,
			DateTime teacher_evaluation_datetime) {
		super();
		this.teacher_evaluation_id = teacher_evaluation_id;
		this.teacher_evaluation_stu_id = teacher_evaluation_stu_id;
		this.teacher_evaluation_teacher_id = teacher_evaluation_teacher_id;
		this.teacher_evaluation_content = teacher_evaluation_content;
		this.teacher_evaluation_star = teacher_evaluation_star;
		this.teacher_evaluation_datetime = teacher_evaluation_datetime;
	}
	public Teacher_evaluation() {
		super();
	}
	
	
}
