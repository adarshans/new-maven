package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryloginpage {

	@FindBy(xpath="//a[contains(text(),'GEARS')]")
	private WebElement gears;
	
	@FindBy(xpath="//ul[@class='dropdown-menu gear_menu']//a[@class='ignorelink'][normalize-space()='SkillRary Demo APP']")
	private WebElement demo;
	
	@FindBy(xpath="//input[@placeholder='Search for Courses']")
	private WebElement serch;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement serchclick;
	
	public skillraryloginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void gearsskill() {
		gears.click();
	}
	public void demoskill() {
		demo.click();
	}
	public void serch1(String name) {
		serch.sendKeys(name);
	}
	public void serchclk() {
		serchclick.click();
	}
}
