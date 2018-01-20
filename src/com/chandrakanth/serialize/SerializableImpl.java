package com.chandrakanth.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.apache.log4j.Logger;

public class SerializableImpl {

	private static SerializableClass serializable = new SerializableClass();
	private static final Logger logger = Logger.getLogger(SerializableImpl.class);

	public static void main(String[] argz) throws IOException, InvalidClassException {

		FileOutputStream fileStream = null;
		ObjectOutputStream objectOut = null;
		try {
			serializable.setNewInt(20);
			serializable.setNewString("New String");
			serializable.setLongValue(23L);
			
			File file = new File("SerializeFile.txt");
			/*fileStream = new FileOutputStream(file);
			objectOut = new ObjectOutputStream(fileStream);
			objectOut.writeObject(serializable);*/

			FileInputStream fIs = new FileInputStream(file);
			ObjectInputStream oI = new ObjectInputStream(fIs);
			SerializableClass s = (SerializableClass) oI.readObject();
			System.out.println(s.getNewInt() + "\t" + s.getNewString() + s.getLongValue());

		} catch (FileNotFoundException e) {
			logger.error("Error finding file");

		} /*catch (IOException e) {
			logger.error("ErroR");
			throw new IOException();
		}*/ catch (ClassNotFoundException e) {
			e.printStackTrace();
		} /*finally {
//			fileStream.close();
//			objectOut.close();
		}*/
	}

}
