package com.chandrakanth.generics;

import com.chandrakanth.java.MultiParameters;

public class MultiParameterImpl<K, V> implements MultiParameters<K, V> {

	private K key;
	private V value;

	public MultiParameterImpl(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	
	@Override
	public K getKey() {
		return this.key;
	}

	@Override
	public V getValue() {
	return this.value;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public void setValue(V value) {
		this.value = value;
	}


}
