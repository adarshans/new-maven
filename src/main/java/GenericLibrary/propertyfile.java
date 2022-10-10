package GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyfile {

	public String getpropertyfile(String key) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(Autoconstants.PropertyFile);
		p.load(fis);
		return p.getProperty(key);
	}
}

