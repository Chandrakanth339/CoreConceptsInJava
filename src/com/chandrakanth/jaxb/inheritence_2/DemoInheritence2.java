package com.chandrakanth.jaxb.inheritence_2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.chandrakanth.jaxb.inheritence_2.Address;

public class DemoInheritence2 {

	public static void main(String[] args) throws Exception {

		try {
			Customer customer = new Customer();
			Address address = new Address();
			address.setStreet("1 A Street");
			// customer.setContactInfo(address);

		
/*			JAXBContext jc = JAXBContext.newInstance(Customer.class, Address.class, PhoneNumber.class);

			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(customer, System.out);*/
		} /*catch (JAXBException e) {

		}*/ catch (Exception e) {

		}
	}
}