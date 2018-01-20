package com.chandrakanth.jaxb.inheritence_1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.transform.dom.DOMResult;

public class DemoInheritence {

	public static void main(String[] args) throws Exception {

		/*
		 * 
		 * 
		 * Inheritence - Method1
		 * <xs:schema version="1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema">
		 
		    <xs:element name="customer" type="customer"/>
		 
		    <xs:complexType name="customer">
		        <xs:sequence>
		            <xs:element name="contactInfo" type="contactInfo" minOccurs="0"/>
		        </xs:sequence>
		    </xs:complexType>
		 
		    <xs:complexType name="contactInfo" abstract="true">
		        <xs:sequence/>
		    </xs:complexType>
		 
		    <xs:complexType name="address">
		        <xs:complexContent>
		            <xs:extension base="contactInfo">
		                <xs:sequence>
		                    <xs:element name="street" type="xs:string" minOccurs="0"/>
		                </xs:sequence>
		            </xs:extension>
		        </xs:complexContent>
		    </xs:complexType>
		 
		    <xs:complexType name="phoneNumber">
		        <xs:complexContent>
		            <xs:extension base="contactInfo">
		                <xs:sequence/>
		            </xs:extension>
		        </xs:complexContent>
		    </xs:complexType>
		 
		</xs:schema>
		 * 
		 * */
		
		
		Customer2 customer = new Customer2();
		Address address = new Address();
		address.setStreet("1 A Street");
		customer.setContactInfo(address);

		JAXBContext jc = JAXBContext.newInstance(Customer2.class, Address.class, PhoneNumber.class);

		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(customer, System.out);
		
		
		
		
		
		
	}

}