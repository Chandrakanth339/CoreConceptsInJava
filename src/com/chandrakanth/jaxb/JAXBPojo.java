package com.chandrakanth.jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "name", "l" , /*"country" *//* , "SubClass" */ })
@XmlRootElement(name = "PrimaryClass")
@XmlAccessorType(XmlAccessType.FIELD)
public class JAXBPojo {

	public JAXBPojo() {
		super();
	}

	@XmlElement
	private String name;
	@XmlTransient
	private String country;

	private List<SubClass> l = new ArrayList<SubClass>();

	public ArrayList<SubClass> returnList() {
		return (ArrayList<SubClass>) this.l;
	}

	/*@XmlTransient*/
	public void setList(ArrayList<SubClass> l) {
		this.l = l;
	}

	public JAXBPojo(String name, String country, ArrayList<SubClass> l) {
		this.name = name;
		this.country = country;
		this.l = l;
	}

	public JAXBPojo(String name, String country) {
		this.name = name;
		this.country = country;

	}

	public String getCountry() {
		return this.country;
	}

	// @XmlElement(name = "person_country")

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return this.name;
	}

	// @XmlElement(name="person_name")

	public void setName(String name) {
		this.name = name;
	}

	@XmlType(propOrder = { "class2name", "class1name" })
    /*@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)*/
	@XmlAccessorType(XmlAccessType.FIELD)
	public static class SubClass {

		public SubClass(){
			
		}
		
		@XmlElement(name = "Class_NameA")
		private String class1name;
		@XmlElement(name = "Class_NameB")
		private String class2name;

		public String getClass1name() {
			return class1name;

		}

		
		public void setClass1name(String class1name) {
			this.class1name = class1name;
		}

		
		public String getClass2name() {
			return class2name;
		}

		public void setClass2name(String class2name) {
			this.class2name = class2name;
		}

		public SubClass(String name1, String name2) {
			this.class1name = name1;
			this.class2name = name2;
		}

	}

}
