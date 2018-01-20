package com.chandrakanth.generics;

import java.util.List;

import com.chandrakanth.java.CollectionInJava;

public class CollectionsImpl<E> implements CollectionInJava<E> {

	private List<E> list;

	public CollectionsImpl() {
		super();
	}

	@Override
	public List<E> getElement() {

		return list;
	}

	@Override
	public void setElement(List<E> e) {

		list = e;

	}

}
