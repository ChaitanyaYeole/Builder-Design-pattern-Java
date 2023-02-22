package com.BuilderDesignPattern.main;

import com.BuilderDesignPattern.Phone.PhoneSpecs;

public class PhoneMain {

	public static void main(String[] args) {
		
		PhoneSpecs ps=new PhoneSpecs().setBrand("Realme").setOs("Android").setRam(6).setStorage(500);
		System.out.println(ps);

	}

}
