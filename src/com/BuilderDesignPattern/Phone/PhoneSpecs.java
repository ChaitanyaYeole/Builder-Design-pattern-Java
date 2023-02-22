package com.BuilderDesignPattern.Phone;

public class PhoneSpecs {

	private String brand;
	private String os;
	private String processer;
	private int ram;
	private int storage;
	private String displaySize;
	
	public PhoneSpecs setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	public PhoneSpecs setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneSpecs setProcesser(String processer) {
		this.processer = processer;
		return this;
	}
	public PhoneSpecs setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneSpecs setStorage(int storage) {
		this.storage = storage;
		return this;
	}
	public PhoneSpecs setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
		return this;
	}
	@Override
	public String toString() {
		return "PhoneSpecs [brand=" + brand + ", os=" + os + ", processer=" + processer + ", ram=" + ram + ", storage="
				+ storage + ", displaySize=" + displaySize + "]";
	}
	
	
	
}
