package com.chandrakanth.java8;

public class Java8SamplesImplementor {

	public static void main(String[] argz) {
		// Functional Interface having argument - Define the argument with type
		FunctionalInterfaceSample sample = (/*String */s) -> {
			System.out.println(s);
		};
		sample.singleAbstractMethod("argument value");
	}
}
