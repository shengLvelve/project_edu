package com.cc.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Deposit {
private int deposit_id;
private Date deposit_datetime;
//private int deposit_teacher_id;
private Teacher deposit_teacher_id;
private int deposit_price;
public Deposit() {
	super();
}
public Deposit(int deposit_id, Date deposit_datetime, int deposit_teacher_id, int deposit_price) {
	super();
	this.deposit_id = deposit_id;
	this.deposit_datetime = deposit_datetime;
	this.deposit_teacher_id.setTeacher_id(deposit_teacher_id);
	this.deposit_price = deposit_price;
}
public int getDeposit_id() {
	return deposit_id;
}
public void setDeposit_id(int deposit_id) {
	this.deposit_id = deposit_id;
}
public Date getDeposit_datetime() {
	return deposit_datetime;
}
public void setDeposit_datetime(Date deposit_datetime) {
	this.deposit_datetime = deposit_datetime;
}
public int getDeposit_teacher_id() {
	return deposit_teacher_id.getTeacher_id();
}
public void setDeposit_teacher_id(Teacher deposit_teacher_id) {
	this.deposit_teacher_id = deposit_teacher_id;
}
public int getDeposit_price() {
	return deposit_price;
}
public void setDeposit_price(int deposit_price) {
	this.deposit_price = deposit_price;
}
@Override
public String toString() {
	return "Deposit [deposit_id=" + deposit_id + ", deposit_datetime=" + deposit_datetime + ", deposit_teacher_id="
			+ deposit_teacher_id + ", deposit_price=" + deposit_price + "]";
}

}
