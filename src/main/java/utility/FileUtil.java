package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtil {
	
	public String readProperty(String Key) throws IOException {

		String value = null;

		try {
			FileInputStream fin = new FileInputStream(
					"D:\\JavaLearning\\GuviAutomation\\src\\main\\resources\\config.properties");
			
			//D:\JAva Learning\Guvi Automation\src\main\resources\config.properties

			Properties prop = new Properties();
			prop.load(fin);

			value = prop.getProperty(Key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

}


