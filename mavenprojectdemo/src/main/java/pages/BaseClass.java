package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class BaseClass {
	Properties prop;
	FileInputStream fis;
	BaseClass() throws IOException{
		prop  = new Properties();
		String filename = System.getProperty("user.dir")+"\\config.properties";
		fis = new FileInputStream(filename);
		prop.load(fis);
		
	}

}
