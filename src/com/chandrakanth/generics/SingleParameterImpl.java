package com.chandrakanth.generics;

import com.chandrakanth.java.SingleParameter;

public class SingleParameterImpl<T> implements SingleParameter<T> {

	private T t;

	@Override
	public T getObject() {
		return t;
	}

	@Override
	public void setObject(T t) {
		this.t = t;

	}

}
