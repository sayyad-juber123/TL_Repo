package genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebdriverUtility // here we will create webdriver reusable methods. 
{
	  public void doubleClick(WebDriver driver, WebElement element)
	  {
		  Actions act = new Actions(driver);
		  act.doubleClick(element).perform();
	  }
	  
	  public void scrollby(WebDriver driver, WebElement element)
	  {
		  Actions act = new Actions(driver);
		  act.scrollByAmount(460, 440);
	  }
	  
	  public void mousehower(WebDriver driver, WebElement element)
	  {
		  Actions act = new Actions(driver);
		  act.moveToElement(element); 
	  }

}
