package com.chandrakanth.threads;

import java.io.Serializable;

public class PropertyObject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int l = 0;
	
	public void doAdd(int l){
		l += 4;
		this.l = l;
	}
	
	
	public int getInt(){
	
		return l;
	}
	

}
