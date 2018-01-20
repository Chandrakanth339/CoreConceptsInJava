package com.chandrakanth.jaxb.inheritence_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;



@XmlRootElement
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Customer2 {

	
	private ContactInfo contactInfo;

	
	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

}
