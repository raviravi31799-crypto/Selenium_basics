package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		Actions act=new Actions(driver);
		WebElement drag=driver.findElement(By.id("form:drag_content"));
		WebElement drop=driver.findElement(By.id("form:drop_content"));
		act.dragAndDrop(drag, drop).perform();
		

	}

}
