package GenericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {
  public void getphoto(WebDriver driver, String Name) throws IOException {
	  Date d=new Date();
	 String currentdate = d.toString().replaceAll(":","-");
	  TakesScreenshot sc=(TakesScreenshot) driver;
	  File src = sc.getScreenshotAs(OutputType.FILE);
	  File dest=new File(Autoconstants.photopath+currentdate+Name+".png");
	  FileUtils.copyFile(src, dest);
  }
}
