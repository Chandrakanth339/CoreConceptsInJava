package com.chandrakanth.jaxb;

import javax.xml.bind.annotation.XmlTransient;

public abstract class Base {

	private int id;

	public int getId() {
		return id;
	}

	/*@XmlTransient*/
	public void setId(int id) {
		this.id = id;
	}

}
