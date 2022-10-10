package GenericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
 public WebDriver driver;
 public propertyfile pdata=new propertyfile();
 public WebDriverUtilies driverutilies=new WebDriverUtilies();
 
 @BeforeMethod
 public void openapp() throws IOException {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get(pdata.getpropertyfile("url"));
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
 }
 @AfterMethod
 public void clossapp(ITestResult res) throws IOException {
	 int status = res.getStatus();
	 
                 String neme = res.getName();
                if(status==2) {
                	 screenshot scs=new screenshot();
                	 scs.getphoto(driver, neme);
                 	 
                }
                driver.quit();     	
 }
}
