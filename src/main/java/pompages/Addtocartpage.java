package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocartpage {

	
	@FindBy(xpath="//button[@id='add']")
	private WebElement plus;
	
	public WebElement getPlus() {
		return plus;
	}
	@FindBy(xpath="//button[normalize-space()='Add to Cart']")
	private WebElement addtocart;
	
	public Addtocartpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void addtocart1() {
		addtocart.click();
	}
}
