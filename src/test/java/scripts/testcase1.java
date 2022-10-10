package scripts;

import org.testng.annotations.Test;

import GenericLibrary.baseclass;
import pompages.Addtocartpage;
import pompages.skillraryloginpage;
import pompages.skillraydemologinpage;

public class testcase1 extends baseclass {
	
	@Test
	public void tc1() {
		 skillraryloginpage sk=new skillraryloginpage(driver);
		 sk.gearsskill();
		 sk.demoskill();
		 
		 skillraydemologinpage d=new skillraydemologinpage(driver);
		 driverutilies.Switchtab(driver);
		 driverutilies.Mousover(driver,d.getCourse());
		 d.seleniumtraining();
		 
		 Addtocartpage ac=new Addtocartpage(driver);
		 driverutilies.Dubleclick(driver, ac.getPlus());
		 ac.addtocart1();
		
		 
		

}
}