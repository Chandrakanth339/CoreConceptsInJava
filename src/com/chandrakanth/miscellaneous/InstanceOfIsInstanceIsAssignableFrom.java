package com.chandrakanth.miscellaneous;

public class InstanceOfIsInstanceIsAssignableFrom {

	public static class A{}
	public static class B extends A{}
	
	public interface I{}
	
	public static void main(String[] argz) {
		A a = new A();
		B b = new B();
		/**
		 * if object names are directly used,
		 * the compiler would not be able to identify the one 
		 * present to the left of instanceof operator
		 * 
		 * can be used only if left hand operand is a reference
		 * and right hand operand is object name itself
		 * 
		 * can be used in the following combinations:
		 * 
		 * <variablenameofSubclass> instanceof <superClassOBjectName>
		 * <variablenameofclass> instanceof <anyInterfacename>
		 * 
		 * 
		 * */
		System.out.println(b instanceof A);
	}

}
