/*package com.chandrakanth.json;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

*//**
 * @author sai
 *
 *//*
public class JSONSimple {

	private static JSONParser jsonParser = new JSONParser();

	protected static JSONValue jsonValue = new JSONValue();
	private static final Logger logger = Logger.getLogger(JSONSimple.class);
	private static File file = new File("Resources/jsonOut.txt");
	private static StringWriter writer = null;
	private static FileWriter fileWriter = null;
	private static FileReader fileReader = null;

	public static void main(String[] argz) {

		try {

			fileReader = new FileReader(file);
			 fileWriter = new FileWriter(file);

			
			while (fileReader.read() != -1) {

				logger.info(fileReader.read());
			
			}
			

			// fileWriter.write(ENUMConstants.ARRAY.getStringValue());
			
			 * if (Boolean.valueOf(String.valueOf(fileReader.read()))) {
			 * fileWriter.append("\n".toString()).append(ENUMConstants.ARRAY.
			 * getStringValue()); fileWriter.flush(); }
			 

			JSONArray jsonArray = (JSONArray) jsonParser.parse(ENUMConstants.ARRAY.getStringValue());

			logger.info(jsonArray);

		} catch (ParseException | IOException e) {
			if (logger.isDebugEnabled()) {
				logger.debug(ENUMConstants.ERROR.getStringValue() + e);
			}

		} 
		finally {
			try {

				fileWriter.close();
			} catch (IOException e) {
				if (logger.isDebugEnabled()) {
					logger.debug(ENUMConstants.ERROR.getStringValue() + e);
				}
			}
		}

	}

	public enum ENUMConstants {

		ARRAY(1, "[0, " + "{" + "\"1\":\"argument1\"" + "}" + "]", "arrayString"), JSONOBJECT(2,
				"{\"jsonKey:\"jsonValue\"}", "jsonString"), ERROR(3, "Error", "Error In Processing");

		private int integerValue;
		private String stringValue;
		private String stringValue2;

		ENUMConstants() {

		}

		ENUMConstants(int val, String val2, String val3) {

			this.integerValue = val;
			this.stringValue = val2;
			this.stringValue2 = val3;
		}

		*//**
		 * @return the integerValue
		 *//*
		public int getIntegerValue() {
			return integerValue;
		}

		*//**
		 * @param integerValue
		 *            the integerValue to set
		 *//*
		void setIntegerValue(int integerValue) {
			this.integerValue = integerValue;
		}

		*//**
		 * @return the stringValue
		 *//*
		String getStringValue() {
			return stringValue;
		}

		*//**
		 * @param stringValue
		 *            the stringValue to set
		 *//*
		void setStringValue(String stringValue) {
			this.stringValue = stringValue;
		}

		*//**
		 * @return the stringValue2
		 *//*
		public String getStringValue2() {
			return stringValue2;
		}

		*//**
		 * @param stringValue2
		 *            the stringValue2 to set
		 *//*
		void setStringValue2(String stringValue2) {
			this.stringValue2 = stringValue2;
		}
	}

}
*/