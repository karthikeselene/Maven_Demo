package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

	public static String getLocatorValue(String fileName, String key) {
		InputStream in;
		Properties prop;
		String value = null;
		try {
			in = new FileInputStream("./ObjectRepostories/"+fileName+".properties");
			prop = new Properties();
			prop.load(in);
			value = prop.getProperty(key);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;		
	}

}