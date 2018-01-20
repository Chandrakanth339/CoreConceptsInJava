package com.chandrakanth.java;

import java.util.List;

public interface GenericMethod {
	public <T> void setGenericMethod(List<T> list);

	public <T> T getGenericMethod();
}
