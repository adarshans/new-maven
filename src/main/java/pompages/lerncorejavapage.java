package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class lerncorejavapage {
	
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement close;
  
	@FindBy(xpath="//div[@class='play-icon']//*[name()='svg']//*[name()='polygon' and contains(@class,'fill')]")
	private WebElement playbtn;
	
	@FindBy(xpath="//div[@class='pause-icon']//*[name()='svg']")
	private WebElement pause;
	
	@FindBy(xpath="//span[normalize-space()='Add To Wishlist']")
	private WebElement wishlist;
	
	public lerncorejavapage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void close1() {
		close.click();
	}
	public void play() {
		playbtn.click();
	}
	public void pause1() {
		pause.click();
	}
	public void wish() {
		wishlist.click();
	}
}
