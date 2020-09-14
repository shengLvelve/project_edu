package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Warehouse_item_type {
	private int warehouse_item_type_id;
	private String warehouse_item_type_value;
	public Warehouse_item_type() {
		super();
	}
	public Warehouse_item_type(int warehouse_item_type_id, String warehouse_item_type_value) {
		super();
		this.warehouse_item_type_id = warehouse_item_type_id;
		this.warehouse_item_type_value = warehouse_item_type_value;
	}
	public int getWarehouse_item_type_id() {
		return warehouse_item_type_id;
	}
	public void setWarehouse_item_type_id(int warehouse_item_type_id) {
		this.warehouse_item_type_id = warehouse_item_type_id;
	}
	public String getWarehouse_item_type_value() {
		return warehouse_item_type_value;
	}
	public void setWarehouse_item_type_value(String warehouse_item_type_value) {
		this.warehouse_item_type_value = warehouse_item_type_value;
	}
	@Override
	public String toString() {
		return "Warehouse_item_type [warehouse_item_type_id=" + warehouse_item_type_id + ", warehouse_item_type_value="
				+ warehouse_item_type_value + "]";
	}
	
}
