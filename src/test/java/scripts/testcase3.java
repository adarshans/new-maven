package scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import GenericLibrary.WebDriverUtilies;
import GenericLibrary.baseclass;
import pompages.corejavapage;
import pompages.lerncorejavapage;
import pompages.skillraryloginpage;
import pompages.skillraydemologinpage;

public class testcase3 extends baseclass {
     
	@Test
	public void tc3() throws IOException, InterruptedException {
		skillraryloginpage sk1=new skillraryloginpage(driver);
		sk1.serch1(pdata.getpropertyfile("serch"));
		sk1.serchclk();
		
		corejavapage cj=new corejavapage(driver);
		cj.corejva();
		
		lerncorejavapage lc=new lerncorejavapage(driver);
		lc.close1();
		driverutilies.SwichtoFrame(driver);
		lc.play();
		Thread.sleep(3000);
		lc.pause1();
		driverutilies.SwitchBackFrame(driver);
		Thread.sleep(3000);
		lc.wish();
		
	}
}
