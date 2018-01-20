package com.chandrakanth.jaxb.inheritence_2;

import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement

public class Customer {
 
    private ContactInfo contactInfo;
 
    /*@XmlElementRef*/
    public ContactInfo getContactInfo() {
        return contactInfo;
    }
 
    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
    
    
    
    public int getCall() {
		return call;
	}

	public void setCall(int call) {
		this.call = call;
	}



	private int call;
    
 
}