package com.chandrakanth.generics;

import java.util.List;

import com.chandrakanth.java.GenericMethod;

public class GenericMethodImpl implements GenericMethod {

	List<PropertyClass> lP;

	@SuppressWarnings("unchecked")
	@Override

	public <T> void setGenericMethod(List<T> list) {
		lP = (List<PropertyClass>) list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getGenericMethod() {

		return (T) this.lP;
	}

}
