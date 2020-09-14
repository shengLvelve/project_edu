package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Application_record_status {
	private int application_record_status_id;
	private String application_record_status_value;
	public Application_record_status() {
		super();
	}
	public Application_record_status(int application_record_status_id, String application_record_status_value) {
		super();
		this.application_record_status_id = application_record_status_id;
		this.application_record_status_value = application_record_status_value;
	}
	public int getApplication_record_status_id() {
		return application_record_status_id;
	}
	public void setApplication_record_status_id(int application_record_status_id) {
		this.application_record_status_id = application_record_status_id;
	}
	public String getApplication_record_status_value() {
		return application_record_status_value;
	}
	public void setApplication_record_status_value(String application_record_status_value) {
		this.application_record_status_value = application_record_status_value;
	}
	@Override
	public String toString() {
		return "Application_record_status [application_record_status_id=" + application_record_status_id
				+ ", application_record_status_value=" + application_record_status_value + "]";
	}
	
}
