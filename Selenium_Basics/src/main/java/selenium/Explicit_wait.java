package selenium;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Explicit_wait {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/"); 
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement button=wait.until(ExpectedConditions.elementToBeClickable(By.id("alert2")));
		button.click();
        
	
	}
}
