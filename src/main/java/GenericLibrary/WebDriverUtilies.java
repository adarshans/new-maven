package GenericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilies {
     
	
	public void Dropdown(WebElement ele, String text) {
		Select s=new Select(ele);
		
		s.selectByVisibleText(text);
	
	}
	public void Mousover(WebDriver driver, WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
	}
	public void Rightclick(WebDriver driver, WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	public void Dubleclick(WebDriver driver, WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	public void DragAndDrop(WebDriver driver, WebElement src, WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}
	public void SwichtoFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	public void SwitchBackFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void Switchtab(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for (String s:child) {
		
			driver.switchTo().window(s);
		}
	}
	public void PopupAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void ScrollBar(WebDriver driver, int x, int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
}
