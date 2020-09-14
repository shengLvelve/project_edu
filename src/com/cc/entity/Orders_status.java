package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Orders_status {
	private int orders_status_id;
	private String orders_status_value;
	public Orders_status() {
		super();
	}
	public Orders_status(int orders_status_id, String orders_status_value) {
		super();
		this.orders_status_id = orders_status_id;
		this.orders_status_value = orders_status_value;
	}
	public int getOrders_status_id() {
		return orders_status_id;
	}
	public void setOrders_status_id(int orders_status_id) {
		this.orders_status_id = orders_status_id;
	}
	public String getOrders_status_value() {
		return orders_status_value;
	}
	public void setOrders_status_value(String orders_status_value) {
		this.orders_status_value = orders_status_value;
	}
	@Override
	public String toString() {
		return "Orders_status [orders_status_id=" + orders_status_id + ", orders_status_value=" + orders_status_value
				+ "]";
	}
	
}
