package com.chandrakanth.miscellaneous;

public class MethodHidingSuper {

	static int j = 3;

	static void superMethod() {
		j++;
	}

	void nonStatic() {
		j++;
	}
}
