package com.chandrakanth.jaxb;

import java.io.File;
import java.util.Arrays;

import javax.xml.bind.*;

public class Demo {

	public static void main(String[] args) throws Exception {
		JAXBContext jc = JAXBContext.newInstance(Customer.class);
/*		Unmarshaller unmarshaller = jc.createUnmarshaller();
		File xml = new File("src/jaxb.xml");
		Customer customer = (Customer) unmarshaller.unmarshal(xml);*/

		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(new Customer("79", Arrays.asList("a","b")), System.out);
		marshaller.marshal(new Customer("79", Arrays.asList("a","b")), new File("src/jaxb.xml"));

		
	}
}