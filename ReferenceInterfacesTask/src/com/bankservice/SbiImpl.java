package com.bankservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SbiImpl implements SbiBank {
	public void msg() {
		System.out.println("Welcome to SBI Bank");
	}

}
