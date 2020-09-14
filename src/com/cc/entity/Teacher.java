package com.cc.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
	private int teacher_id;
	private String teacher_name;
	private String teacher_phone;
	private String teacher_passwd;
	//private int teacher_type;
	private Teacher_type teacher_type;
//	private int teacher_status_card;
	private Teacher_status_card teacher_status_card=new Teacher_status_card();
//	private int teacher_status_deposit;
	private Teacher_status_deposit teacher_status_deposit=new Teacher_status_deposit();
//	private int teacher_area;
	private Area teacher_area = new Area();
//	private int teacher_gender;
	private Gender teacher_gender=new Gender();
	private Date teacher_birth;
	private String teacher_school;
//	private int teacher_grade;
	private Grade teacher_grade= new Grade();
//	private int teacher_class_time;
	private Teacher_class_time teacher_class_time= new Teacher_class_time();
//	private int teacher_class_date;
	private Teacher_class_date teacher_class_date = new Teacher_class_date();
//	private int teacher_teach_age;
	private Teacher_teach_age teacher_teach_age = new Teacher_teach_age();
	private String teacher_introduction;
	private int teacher_coin;
	private String teacher_avatar;
	public Teacher() {
		super();
	}
	public Teacher(int teacher_id, String teacher_name, String teacher_phone, String teacher_passwd, int teacher_type,
			int teacher_status_card, int teacher_status_deposit, int teacher_area, int teacher_gender,
			Date teacher_birth, String teacher_school, int teacher_grade, int teacher_class_time,
			int teacher_class_date, int teacher_teach_age, String teacher_introduction, int teacher_coin,
			String teacher_avatar) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
		this.teacher_phone = teacher_phone;
		this.teacher_passwd = teacher_passwd;
		this.teacher_type.setTeacher_type_id(teacher_type);
		this.teacher_status_card.setTeacher_status_card_id(teacher_status_card);
		this.teacher_status_deposit.setTeacher_status_deposit_id(teacher_status_deposit);
		this.teacher_area.setId(teacher_area);
		this.teacher_gender.setGender_id(teacher_gender);
		this.teacher_birth = teacher_birth;
		this.teacher_school = teacher_school;
		this.teacher_grade.setGrade_id(teacher_grade);
		this.teacher_class_time.setTeacher_class_time_id(teacher_class_time);
		this.teacher_class_date.setTeacher_class_date_id(teacher_class_date);
		this.teacher_teach_age.setTeacher_teach_age_id(teacher_teach_age);
		this.teacher_introduction = teacher_introduction;
		this.teacher_coin = teacher_coin;
		this.teacher_avatar = teacher_avatar;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getTeacher_phone() {
		return teacher_phone;
	}
	public void setTeacher_phone(String teacher_phone) {
		this.teacher_phone = teacher_phone;
	}
	public String getTeacher_passwd() {
		return teacher_passwd;
	}
	public void setTeacher_passwd(String teacher_passwd) {
		this.teacher_passwd = teacher_passwd;
	}
	public int getTeacher_type() {
		return teacher_type.getTeacher_type_id();
	}
	public void setTeacher_type(int teacher_type) {
		this.teacher_type.setTeacher_type_id(teacher_type);
	}
	
	public int getTeacher_status_card() {
		return teacher_status_card.getTeacher_status_card_id();
	}
	public void setTeacher_status_card(int teacher_status_card) {
		this.teacher_status_card.setTeacher_status_card_id(teacher_status_card);
	}
	public int getTeacher_status_deposit() {
		return teacher_status_deposit.getTeacher_status_deposit_id();
	}
	public void setTeacher_status_deposit(int teacher_status_deposit) {
		this.teacher_status_deposit.setTeacher_status_deposit_id(teacher_status_deposit);
	}
	public int getTeacher_area() {
		return teacher_area.getId();
	}
	public void setTeacher_area(int teacher_area) {
		this.teacher_area.setId(teacher_area);
	}
	public int getTeacher_gender() {
		return teacher_gender.getGender_id();
	}
	public void setTeacher_gender(int teacher_gender) {
		this.teacher_gender.setGender_id(teacher_gender);
	}
	public Date getTeacher_birth() {
		return teacher_birth;
	}
	public void setTeacher_birth(Date teacher_birth) {
		this.teacher_birth = teacher_birth;
	}
	public String getTeacher_school() {
		return teacher_school;
	}
	public void setTeacher_school(String teacher_school) {
		this.teacher_school = teacher_school;
	}
	public int getTeacher_grade() {
		return teacher_grade.getGrade_id();
	}
	public void setTeacher_grade(int teacher_grade) {
		this.teacher_grade.setGrade_id(teacher_grade);
	}
	public int getTeacher_class_time() {
		return teacher_class_time.getTeacher_class_time_id();
	}
	public void setTeacher_class_time(int teacher_class_time) {
		this.teacher_class_time.setTeacher_class_time_id(teacher_class_time);
	}
	public int getTeacher_class_date() {
		return teacher_class_date.getTeacher_class_date_id();
	}
	public void setTeacher_class_date(int teacher_class_date) {
		this.teacher_class_date.setTeacher_class_date_id(teacher_class_date);
	}
	public int getTeacher_teach_age() {
		return teacher_teach_age.getTeacher_teach_age_id();
	}
	public void setTeacher_teach_age(int teacher_teach_age) {
		this.teacher_teach_age.setTeacher_teach_age_id(teacher_teach_age);
	}
	public String getTeacher_introduction() {
		return teacher_introduction;
	}
	public void setTeacher_introduction(String teacher_introduction) {
		this.teacher_introduction = teacher_introduction;
	}
	public int getTeacher_coin() {
		return teacher_coin;
	}
	public void setTeacher_coin(int teacher_coin) {
		this.teacher_coin = teacher_coin;
	}
	public String getTeacher_avatar() {
		return teacher_avatar;
	}
	public void setTeacher_avatar(String teacher_avatar) {
		this.teacher_avatar = teacher_avatar;
	}
	@Override
	public String toString() {
		return "Teacher [teacher_id=" + teacher_id + ", teacher_name=" + teacher_name + ", teacher_phone="
				+ teacher_phone + ", teacher_passwd=" + teacher_passwd + ", teacher_type=" + teacher_type
				+ ", teacher_status_card=" + teacher_status_card + ", teacher_status_deposit=" + teacher_status_deposit
				+ ", teacher_area=" + teacher_area + ", teacher_gender=" + teacher_gender + ", teacher_birth="
				+ teacher_birth + ", teacher_school=" + teacher_school + ", teacher_grade=" + teacher_grade
				+ ", teacher_class_time=" + teacher_class_time + ", teacher_class_date=" + teacher_class_date
				+ ", teacher_teach_age=" + teacher_teach_age + ", teacher_introduction=" + teacher_introduction
				+ ", teacher_coin=" + teacher_coin + ", teacher_avatar=" + teacher_avatar + "]";
	}
	
	
}
