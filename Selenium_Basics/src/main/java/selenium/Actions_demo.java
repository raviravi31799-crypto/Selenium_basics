package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		WebElement blogsmenuElement=driver.findElement(By.id("blogsmenu"));
		Actions act=new Actions(driver);
		act.moveToElement(blogsmenuElement).perform();//single action
		WebElement option=driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
		act.moveToElement(option).click().build().perform();//more than one action
	}

}
