package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Orders_attitute {
	private int orders_attitute_id;
	private String orders_attitute_value;
	public Orders_attitute() {
		super();
	}
	public Orders_attitute(int orders_attitute_id, String orders_attitute_value) {
		super();
		this.orders_attitute_id = orders_attitute_id;
		this.orders_attitute_value = orders_attitute_value;
	}
	public int getOrders_attitute_id() {
		return orders_attitute_id;
	}
	public void setOrders_attitute_id(int orders_attitute_id) {
		this.orders_attitute_id = orders_attitute_id;
	}
	public String getOrders_attitute_value() {
		return orders_attitute_value;
	}
	public void setOrders_attitute_value(String orders_attitute_value) {
		this.orders_attitute_value = orders_attitute_value;
	}
	@Override
	public String toString() {
		return "Orders_attitute [orders_attitute_id=" + orders_attitute_id + ", orders_attitute_value="
				+ orders_attitute_value + "]";
	}
	
}
