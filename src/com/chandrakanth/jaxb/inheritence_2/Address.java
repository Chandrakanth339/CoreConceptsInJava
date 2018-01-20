package com.chandrakanth.jaxb.inheritence_2;

import javax.xml.bind.annotation.XmlRootElement;

import com.chandrakanth.jaxb.inheritence_1.ContactInfo;

@XmlRootElement
public class Address extends ContactInfo {
 
    private String street;
 
    public String getStreet() {
        return street;
    }
 
    public void setStreet(String street) {
        this.street = street;
    }
 
}