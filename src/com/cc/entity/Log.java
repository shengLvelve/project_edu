package com.cc.entity;

import org.springframework.stereotype.Component;

import net.sf.jsqlparser.expression.DateTimeLiteralExpression.DateTime;

@Component
public class Log {

	private Long log_id;
	private Long log_type;
	private Long log_usr_id;
	private DateTime log_datetime;
	private String log_ip;
	public Long getLog_id() {
		return log_id;
	}
	public void setLog_id(Long log_id) {
		this.log_id = log_id;
	}
	public Long getLog_type() {
		return log_type;
	}
	public void setLog_type(Long log_type) {
		this.log_type = log_type;
	}
	public Long getLog_usr_id() {
		return log_usr_id;
	}
	public void setLog_usr_id(Long log_usr_id) {
		this.log_usr_id = log_usr_id;
	}
	public DateTime getLog_datetime() {
		return log_datetime;
	}
	public void setLog_datetime(DateTime log_datetime) {
		this.log_datetime = log_datetime;
	}
	public String getLog_ip() {
		return log_ip;
	}
	public void setLog_ip(String log_ip) {
		this.log_ip = log_ip;
	}
	@Override
	public String toString() {
		return "Log [log_id=" + log_id + ", log_type=" + log_type + ", log_usr_id=" + log_usr_id + ", log_datetime="
				+ log_datetime + ", log_ip=" + log_ip + "]";
	}
	public Log(Long log_id, Long log_type, Long log_usr_id, DateTime log_datetime, String log_ip) {
		super();
		this.log_id = log_id;
		this.log_type = log_type;
		this.log_usr_id = log_usr_id;
		this.log_datetime = log_datetime;
		this.log_ip = log_ip;
	}
	public Log() {
		super();
	}
	
	
}
