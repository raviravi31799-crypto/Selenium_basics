package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Actions act=new Actions(driver);
		WebElement link=driver.findElement(By.linkText("compendiumdev"));
		act.keyDown(Keys.CONTROL).moveToElement(link).click().keyUp(Keys.CONTROL).build().perform();
		String parenthandle=driver.getWindowHandle();
	    Set <String> windowhandle=driver.getWindowHandles();
	    for(String handles:windowhandle) {
	    	driver.switchTo().window(handles);
	    }
	    Thread.sleep(3000);
	    System.out.println("Child Window:"+windowhandle);
	    driver.switchTo().window(parenthandle);
	    

	}

}
