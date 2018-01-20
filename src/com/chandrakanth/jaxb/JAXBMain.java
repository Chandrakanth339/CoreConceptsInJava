package com.chandrakanth.jaxb;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.Binder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

import com.chandrakanth.jaxb.JAXBPojo.SubClass;

public class JAXBMain {

	public static void main(String[] args) {

		File file = new File("src/jaxb.xml");
		System.out.println(file.getAbsolutePath());
		
		ArrayList<SubClass>  arList = new ArrayList<SubClass>();
		arList.add(new SubClass("class1","class2"));
		
		
		
		JAXBPojo pojo = new JAXBPojo("Querro",
				"Brazil", arList );
		try {

			JAXBContext jaxb = JAXBContext.newInstance(JAXBPojo.class);
			Marshaller marshal = jaxb.createMarshaller();

			marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			marshal.marshal(pojo, file);
			marshal.marshal(pojo, System.out);

			Unmarshaller unMarsh = jaxb.createUnmarshaller();

//			JAXBElement jaxbElement = (JAXBElement) unMarsh.unmarshal(new FileInputStream("src/jaxb.xml"));
			JAXBPojo jPojo = (JAXBPojo) unMarsh.unmarshal(file);
			// System.out.println(jaxbElement.getScope());
			System.out.println(jPojo.getCountry());
			System.out.println(jPojo.getName());

			/*
			 * JAXB implementation using Binder<Node> and TransformationFactory,
			 * DocumentBuilderFactory
			 */

			// we need a blank document to store final xml output
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = dbf.newDocumentBuilder();
			Document document = docBuilder.newDocument();

			// create JAXBContext which will be used to create a Binder
			JAXBContext jc = JAXBContext.newInstance(JAXBPojo.class);

			Binder<org.w3c.dom.Node> binder = jc.createBinder();

			// set output as formatted one
			binder.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			// let's marshal the object and store in document
			binder.marshal(pojo, document);

			// finally print the marshalled object on stdout
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer t = tf.newTransformer();
			t.transform(new DOMSource(document), new StreamResult(System.out));

		} catch (JAXBException e) {

		} catch (TransformerConfigurationException e) {

		} catch (TransformerException e) {

		} catch (ParserConfigurationException e) {

		} /*catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}*/
	}

}
