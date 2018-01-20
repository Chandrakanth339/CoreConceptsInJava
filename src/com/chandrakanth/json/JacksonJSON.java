package com.chandrakanth.json;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class JacksonJSON {

	public JacksonJSON() {
		super();
	}

	private static final Logger logger = Logger.getLogger(JacksonJSON.class);
	private static Map<String, String> myMap = new TreeMap<>();

	private static String jsonStr = null;
	private static String newString = null;
	private static ObjectMapper objMapper = new ObjectMapper();
	private static POJOClass pojoClass;

	public static void main(String[] args) throws InvalidFormatException {

		logger.info("Logging information");

		myMap.put("Key1", "Value1");
		myMap.put("Key0", "Value2");

		pojoClass = new POJOClass("StringField", Boolean.TRUE, Integer.MIN_VALUE);
		pojoClass.setStringField("StringField");

		try {
			// Used to convert the map properties to json key-value pairs

			String JSONStr = "{\"stringField\":\"STRING\",\"booleanField\":\"true\",\"intField\":\"45\"}";
			pojoClass = objMapper.readValue(JSONStr, POJOClass.class);
			logger.info(
					pojoClass.getIntField() + "\t" + pojoClass.getStringField() + "\t" + pojoClass.isBooleanField());
			newString = objMapper.writeValueAsString(myMap);
			jsonStr = objMapper.writeValueAsString(pojoClass.getStringField());
			logger.info(newString);
			logger.info(jsonStr);
			newString = objMapper.writeValueAsString(pojoClass);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return;
	}

	/**
	 * @return the myMap
	 */

	public static Map<String, String> getMyMap() {

		return myMap;
	}

	/**
	 * @param myMap
	 *            the myMap to set
	 */
	/* @JsonAnySetter */
	public static void setMyMap(Entry<String, String> myMap) {

	}

}
