package com.bankservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hdfc")
public class HdfcImpl implements HdfcBank {
	   @Autowired
	   private SbiBank sbibank;

	public SbiBank getSbibank() {
		return sbibank;
	}
	public void setSbibank(SbiBank sbibank) {
		this.sbibank = sbibank;
	}
	public void show() {
		System.out.println("Welcome to HDFC Bank");
	}
	public void showBank() {
		sbibank.msg();
	}
}
