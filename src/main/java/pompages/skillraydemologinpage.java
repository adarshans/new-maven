package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraydemologinpage {
	
	@FindBy(xpath="//select[@name='addresstype']")
	private WebElement CourseCat;
	
 public WebElement getCourseCat() {
		return CourseCat;
	}

@FindBy(xpath="//a[@id='course']")
 private WebElement course;
 
 public WebElement getCourse() {
	return course;
}

@FindBy(xpath="//span[@class='wrappers']//a[@href='product.php?product=selenium-training'][normalize-space()='Selenium Training']")
 private WebElement seltrain;
 
 public skillraydemologinpage(WebDriver driver) {
	 PageFactory.initElements(driver, this); 
 }

public void seleniumtraining() {
	seltrain.click();
}


}
