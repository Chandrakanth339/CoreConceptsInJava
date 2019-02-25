/**
 * 
 */
package com.chandrakanth.anonymousinner;

/**
 * @author Chandrakanth C
 */
public class NormalClass {

	private static String oldString = "Enclosing Class String##$$##";

	private NormalClass() {
		super();
	}

	/* Enclosing Class's method - same name as that of Anonymous Class */
	public String getNewString() {
		return "enclosing Class's Method with same name as Anonymous implementation";
	}

	public static void main(String[] args) {

		System.out.println(new NormalClass().hashCode());

		// Anonymous Inner Type declaration for Abstract Class
		AbstractClass_Anonymous abstractA = new AbstractClass_Anonymous() {

			@Override
			public String getNewString() {
				NormalClass nrml = new NormalClass();
				return nrml.getNewString() + "\nBasic Anonymous - Specifically used to instantiate Abstract Classes\n";
			}

		};
		System.out.println(abstractA.getNewString());

		// Anonymous Inner Type declaration for Interfaces
		final Interface intr = new Interface() {

			@Override
			public String getNewString() {
				return new NormalClass().getOldString() + "\tAnonymous Inner Type Implementation  - Using Interfaces";
			}
		};

		System.out.println(intr.getNewString());

	}

	public String getOldString() {
		return oldString;
	}

	@SuppressWarnings("static-access")
	public void setOldString(String oldString) {
		this.oldString = oldString;
	} 

}
