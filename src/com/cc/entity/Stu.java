package com.cc.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Stu {
	private int stu_id;
	private String stu_name;
	private String stu_phone;
	private String stu_passwd;
	//private int stu_area;//dic
	private Area stu_area=new Area();
	private Date stu_birth;
	//private int stu_gender;//dic
	private Gender stu_gender=new Gender();
	//private int stu_grade;//dic
	private Grade stu_grade=new Grade();
	private int stu_coin;
	private String stu_avatar;
	public Stu() {
		super();
	}
	public Stu(int stu_id, String stu_name, String stu_phone, String stu_passwd, int stu_area, Date stu_birth,
			int stu_gender, int stu_grade, int stu_coin, String stu_avatar) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_phone = stu_phone;
		this.stu_passwd = stu_passwd;
		this.stu_area.setId(stu_area);
		this.stu_birth = stu_birth;
		this.stu_gender.setGender_id(stu_gender);
		this.stu_grade.setGrade_id(stu_grade);
		this.stu_coin = stu_coin;
		this.stu_avatar = stu_avatar;
	}
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_phone() {
		return stu_phone;
	}
	public void setStu_phone(String stu_phone) {
		this.stu_phone = stu_phone;
	}
	public String getStu_passwd() {
		return stu_passwd;
	}
	public void setStu_passwd(String stu_passwd) {
		this.stu_passwd = stu_passwd;
	}
	public int getStu_area() {
		return stu_area.getId();
	}
	public void setStu_area(int stu_area) {
		this.stu_area.setId(stu_area);
	}
	public Date getStu_birth() {
		return stu_birth;
	}
	public void setStu_birth(Date stu_birth) {
		this.stu_birth = stu_birth;
	}
	public int getStu_gender() {
		return stu_gender.getGender_id();
	}
	public void setStu_gender(int stu_gender) {
		this.stu_gender.setGender_id(stu_gender);
	}
	public int getStu_grade() {
		return stu_grade.getGrade_id();
	}
	public void setStu_grade(int stu_grade) {
		this.stu_grade.setGrade_id(stu_grade);
	}
	public int getStu_coin() {
		return stu_coin;
	}
	public void setStu_coin(int stu_coin) {
		this.stu_coin = stu_coin;
	}
	public String getStu_avatar() {
		return stu_avatar;
	}
	public void setStu_avatar(String stu_avatar) {
		this.stu_avatar = stu_avatar;
	}
	@Override
	public String toString() {
		return "Stu [stu_id=" + stu_id + ", stu_name=" + stu_name + ", stu_phone=" + stu_phone + ", stu_passwd="
				+ stu_passwd + ", stu_area=" + stu_area + ", stu_birth=" + stu_birth + ", stu_gender=" + stu_gender
				+ ", stu_grade=" + stu_grade + ", stu_coin=" + stu_coin + ", stu_avatar=" + stu_avatar + "]";
	}
	
}
