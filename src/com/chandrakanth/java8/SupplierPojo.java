package com.chandrakanth.java8;

public class SupplierPojo {

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getIntV() {
		return intV;
	}

	public void setIntV(int intV) {
		this.intV = intV;
	}

	public long getL() {
		return l;
	}

	public void setL(long l) {
		this.l = l;
	}

	private String str;
	private int intV;
	private long l;

	public SupplierPojo() {

	}

	public SupplierPojo(String str, int intV, long l) {
		super();
		this.str = str;
		this.intV = intV;
		this.l = l;
	}

}
