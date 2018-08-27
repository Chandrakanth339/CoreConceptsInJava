package com.chandrakanth.miscellaneous;

public class MethodHidingClass extends MethodHidingSuper {

	public static void main(String[] argz) {
		superMethod();
		System.out.println(j);
	}

	static void superMethod() {
		j--;
	}

}
