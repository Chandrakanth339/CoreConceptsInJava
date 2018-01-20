package com.chandrakanth.enums;

public enum Enum {

	BLITZ(30, "ABC"), KARMA(40, "DEF"), ASITA(50, "GHI");

	Enum() {

	}

	Enum(int code, String str) {
		this.code = code;
		this.setStr(str);
	}

	private String str;
	private int code;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Enum valueToEnum(int code) {

		return Enum.valueOf("ksadkfj");
	}

}
