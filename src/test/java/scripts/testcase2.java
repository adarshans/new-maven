package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

import GenericLibrary.baseclass;
import pompages.Testingpage;
import pompages.skillraryloginpage;
import pompages.skillraydemologinpage;

public class testcase2 extends baseclass {
	  
	@Test
	public void tc2() throws IOException {
		skillraryloginpage sl=new skillraryloginpage(driver);
		sl.gearsskill();
		sl.demoskill();
		
		skillraydemologinpage  d=new skillraydemologinpage(driver);
		driverutilies.Switchtab(driver);
		driverutilies.Dropdown(d.getCourseCat(),pdata.getpropertyfile("coursedd"));
		
		Testingpage ts=new Testingpage(driver);
		
		driverutilies.DragAndDrop(driver, ts.getSelcouse(), ts.getMycart());
		Point loc = ts.getFbok().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverutilies.ScrollBar(driver, x, y);
		ts.Facebook();
	}
	

}
