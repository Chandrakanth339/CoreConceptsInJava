package com.chandrakanth.generics;

import java.util.Arrays;
import java.util.List;
import com.chandrakanth.*;
import com.chandrakanth.java.CollectionInJava;
import com.chandrakanth.java.GenericMethod;
import com.chandrakanth.java.MultiParameters;
import com.chandrakanth.java.SingleParameter;

public class GenericsMain {

	public static void main(String argz[]) {

		// Single Type parameter implementation - Class Level
		singleParameterImplementor();

		// Multi Type parameter implementation - Class Level
		multiParameterImplementor();

		// Collections - List - Class Level
		listImpl();

		// Generic Method Implementation
		genericMethodImpl();

	}

	// Generic Method Implementation - Business Method
	private static void genericMethodImpl() {

		/* GenericMethod g = new */

		// Generic Method Instantiation type inference made at the beginning
		// before invoking method using DOT operator
		// g./*<String, String>*/setGenericMethod(new MultiParameterImpl<String,

		GenericMethod gM = new GenericMethodImpl();
		PropertyClass pC = new PropertyClass();
		pC.setKey("abc");
		pC.setValue("667");

		gM.setGenericMethod(Arrays.asList(pC));
		List<PropertyClass> lP = gM.getGenericMethod();

		System.out.println(lP.get(0).getKey() + "\n" + lP.get(0).getValue());

		/*
		 * MultiParameterImpl<String, String> mPI = g. <String, String>
		 * getGenericMethod(); System.out.println(mPI.getKey() +
		 * mPI.getValue());
		 */

	}

	private static void listImpl() {

		CollectionInJava<String> cIJ = new CollectionsImpl<>();
		cIJ.setElement(Arrays.asList("200"));
		System.out.println(" List Implementation\n" + cIJ.getElement());
	}

	private static void multiParameterImplementor() {

		MultiParameters<String, Integer> multi = new MultiParameterImpl<>("abc", 23);

		System.out.println("Multi Type parameter implementation - Class Level\nKey:" + multi.getKey() + "\tValue:"
				+ multi.getValue());
	}

	private static void singleParameterImplementor() {

		SingleParameter<String> single = new SingleParameterImpl<>();
		single.setObject("Single Type parameter implementation - Class Level\nabc");
		System.out.println(single.getObject());
	}

}
