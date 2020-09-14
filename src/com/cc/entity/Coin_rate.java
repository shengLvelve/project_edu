package com.cc.entity;

import java.util.Date;

public class Coin_rate {
private int coin_rate_id;
private Date coin_rate_datetime;
private double coin_rate_new;
public Coin_rate() {
	super();
}
public Coin_rate(int coin_rate_id, Date coin_rate_datetime, double coin_rate_new) {
	super();
	this.coin_rate_id = coin_rate_id;
	this.coin_rate_datetime = coin_rate_datetime;
	this.coin_rate_new = coin_rate_new;
}
public int getCoin_rate_id() {
	return coin_rate_id;
}
public void setCoin_rate_id(int coin_rate_id) {
	this.coin_rate_id = coin_rate_id;
}
public Date getCoin_rate_datetime() {
	return coin_rate_datetime;
}
public void setCoin_rate_datetime(Date coin_rate_datetime) {
	this.coin_rate_datetime = coin_rate_datetime;
}
public double getCoin_rate_new() {
	return coin_rate_new;
}
public void setCoin_rate_new(double coin_rate_new) {
	this.coin_rate_new = coin_rate_new;
}
@Override
public String toString() {
	return "Coin_rate [coin_rate_id=" + coin_rate_id + ", coin_rate_datetime=" + coin_rate_datetime + ", coin_rate_new="
			+ coin_rate_new + "]";
}

}
