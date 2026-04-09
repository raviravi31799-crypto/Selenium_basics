package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		WebElement simple=driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']"));
		simple.click();
		//handle alert
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		
			
		

	}

}
