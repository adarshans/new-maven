package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testingpage {
    
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement Selcouse;
	
	public WebElement getSelcouse() {
		return Selcouse;
	}

	public WebElement getMycart() {
		return mycart;
	}

	public WebElement getFbok() {
		return Fbok;
	}

	@FindBy(xpath="//legend[normalize-space()='My cart']")
	private WebElement mycart;
	
	@FindBy(xpath="(//ul[@class='list-socialicons']/./li/a/i)[2]")
	private WebElement Fbok;
	
  public Testingpage(WebDriver driver) {
	  PageFactory.initElements( driver,this);
  }
  
  public void Facebook() {
	  Fbok.click();
  }
}
