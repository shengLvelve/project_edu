package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Recharge_detail {
	private int recharge_detail_id;
	private Type recharge_detail_type;
	private int recharge_detail_usr_id;
	private double  recharge_detail_value;
	private Coin_rate recharge_detail_rate = new Coin_rate();
//	private int recharge_detail_rate;
public Recharge_detail() {
	super();
}
public Recharge_detail(int recharge_detail_id, int recharge_detail_type, int recharge_detail_usr_id,
		double recharge_detail_value, int recharge_detail_rate) {
	super();
	this.recharge_detail_id = recharge_detail_id;
	this.recharge_detail_type.setType_id(recharge_detail_type);
	this.recharge_detail_usr_id = recharge_detail_usr_id;
	this.recharge_detail_value = recharge_detail_value;
	this.recharge_detail_rate.setCoin_rate_id(recharge_detail_rate);
}
public int getRecharge_detail_id() {
	return recharge_detail_id;
}
public void setRecharge_detail_id(int recharge_detail_id) {
	this.recharge_detail_id = recharge_detail_id;
}
public int getRecharge_detail_type() {
	return recharge_detail_type.getType_id();
}
public void setRecharge_detail_type(int recharge_detail_type) {
	this.recharge_detail_type.setType_id(recharge_detail_type);
}
public int getRecharge_detail_usr_id() {
	return recharge_detail_usr_id;
}
public void setRecharge_detail_usr_id(int recharge_detail_usr_id) {
	this.recharge_detail_usr_id = recharge_detail_usr_id;
}
public double getRecharge_detail_value() {
	return recharge_detail_value;
}
public void setRecharge_detail_value(double recharge_detail_value) {
	this.recharge_detail_value = recharge_detail_value;
}
public int getRecharge_detail_rate() {
	return recharge_detail_rate.getCoin_rate_id();
}
public void setRecharge_detail_rate(int recharge_detail_rate) {
	this.recharge_detail_rate.setCoin_rate_id(recharge_detail_rate);
}
@Override
public String toString() {
	return "Recharge_detail [recharge_detail_id=" + recharge_detail_id + ", recharge_detail_type="
			+ recharge_detail_type + ", recharge_detail_usr_id=" + recharge_detail_usr_id + ", recharge_detail_value="
			+ recharge_detail_value + ", recharge_detail_rate=" + recharge_detail_rate + "]";
}
	
}
