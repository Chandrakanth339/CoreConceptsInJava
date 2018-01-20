package com.chandrakanth.json;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonNodeClass {

	public static final Logger logger = Logger.getLogger(JsonNodeClass.class);

	public static void main(String argz[]) {
		String carJson = "{ \"brand\" : \"Mercedes\", \"doors\" : 5," + "  \"owners\" : [\"John\", \"Jack\", \"Jill\"],"
				+ "  \"nestedObject\" : { \"field\" : \"value\" } }";

		ObjectMapper objectMapper = new ObjectMapper();

		try {

			JsonParser jParser = new JsonFactory().createParser(carJson);
			while (!jParser.isClosed()) {
				JsonToken jToken = jParser.nextToken();
				if (jToken.FIELD_NAME.equals(jToken)) {
					String field = jParser.getValueAsString();
					logger.info(field);
				}
				if (jToken.VALUE_STRING.equals(jToken)) {
					String field = jParser.getValueAsString();
					logger.info(field);
				}

			}
			System.out.println();
			// To read a value from Source to an object.. The source could be a file, inputstream, String etc.,
			JsonNode node = objectMapper.readValue(carJson, JsonNode.class);
			
			// To write  json to a destination:
			// objectMapper.writeValue(<Destination>,carPojo); // Here Destination could be FileOutputStream, String etc.,
			
			JsonNode brandNode = node.get("brand");
			String brand = brandNode.asText();
			logger.info("brand = " + brand);

			JsonNode doorsNode = node.get("doors");
			int doors = doorsNode.asInt();
			logger.info("doors = " + doors);

			JsonNode array = node.get("owners");
			JsonNode jsonNode = array.get(0);
			String john = jsonNode.asText();
			logger.info("john  = " + john);

			JsonNode child = node.get("nestedObject");
			JsonNode childField = child.get("field");
			String field = childField.asText();
			logger.info("field = " + field);

		} catch (IOException e) {

		}
	}
}