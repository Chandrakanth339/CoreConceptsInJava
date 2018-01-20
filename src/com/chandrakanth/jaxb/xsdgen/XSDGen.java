package com.chandrakanth.jaxb.xsdgen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.dom.DOMResult;

import org.w3c.dom.Document;

public class XSDGen {

	public static void main(String[] argz) {
		try {
			testSchema();
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
	}

	public static void testSchema() throws JAXBException, IOException {
		// grab the context

		JAXBContext context = JAXBContext.newInstance(Prison.class);

		final List results = new ArrayList();

		// generate the schema

		context.generateSchema(
				// need to define a SchemaOutputResolver to store to

				new SchemaOutputResolver() {
					@Override
					public Result createOutput(String ns, String file) throws IOException {
						// save the schema to the list

						DOMResult result = new DOMResult();
						result.setSystemId(file);
						results.add(result);
						return result;
					}
				});
		SchemaOutputResolver sch = new SchemaOutputResolver() {

			@Override
			public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
				return null;
			}

		};
		// output schema via System.out

		DOMResult domResult = (DOMResult) results.get(0);
		Document doc = (Document) domResult.getNode();

		/*
		 * OutputFormat format = new OutputFormat(doc);
		 * format.setIndenting(true);
		 */

		System.out.println(domResult.getNode());
	}

}
