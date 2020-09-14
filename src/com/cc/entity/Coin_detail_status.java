package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Coin_detail_status {
	private int coin_detail_status_id;
	private String coin_detail_status_value;
	public Coin_detail_status() {
		super();
	}
	public Coin_detail_status(int coin_detail_status_id, String coin_detail_status_value) {
		super();
		this.coin_detail_status_id = coin_detail_status_id;
		this.coin_detail_status_value = coin_detail_status_value;
	}
	public int getCoin_detail_status_id() {
		return coin_detail_status_id;
	}
	public void setCoin_detail_status_id(int coin_detail_status_id) {
		this.coin_detail_status_id = coin_detail_status_id;
	}
	public String getCoin_detail_status_value() {
		return coin_detail_status_value;
	}
	public void setCoin_detail_status_value(String coin_detail_status_value) {
		this.coin_detail_status_value = coin_detail_status_value;
	}
	@Override
	public String toString() {
		return "Coin_detail_status [coin_detail_status_id=" + coin_detail_status_id + ", coin_detail_status_value="
				+ coin_detail_status_value + "]";
	}
	
}
