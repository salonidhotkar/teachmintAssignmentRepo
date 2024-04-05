package org.generic_utilities.automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Java_util  {
	
	public String data(String value) throws IOException  {
		FileInputStream f1=new FileInputStream("./src/test/resources/common.properties");
		Properties property=new Properties();
		property.load(f1);
		return property.getProperty(value);
		
		
	}
	

}
