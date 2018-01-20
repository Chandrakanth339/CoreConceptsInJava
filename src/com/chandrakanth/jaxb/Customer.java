package com.chandrakanth.jaxb;

import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder = { "password", "phoneNumbers", "name"})
public class Customer extends Person {

	public Customer() {
	}

	private Person person;

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	private String password;

	private List<String> phoneNumbers;

	public Customer(String pass, List<String> phoneNumbers, Person person) {
		this.password = pass;
		this.phoneNumbers = phoneNumbers;
		this.person = person;
	}

	public Customer(String pass, List<String> phoneNumbers) {
		this.password = pass;
		this.phoneNumbers = phoneNumbers;

	}

	public Customer(String pass, List<String> phoneNumbers, String name) {
		this.password = pass;
		this.phoneNumbers = phoneNumbers;
		this.name = name;

	}

	/* @XmlTransient */
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@XmlElementWrapper(name = "Phone")
	/*@XmlElement(name = "phone-numbers")*/
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Person getPerson() {
		return person;
	}

	@XmlTransient
	public void setPerson(Person person) {
		this.person = person;
	}

}