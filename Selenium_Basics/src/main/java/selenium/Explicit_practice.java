package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
	    WebElement input=driver.findElement(By.id("reveal"));
	    input.click();
	    WebElement box=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("revealed")));
	    box.sendKeys("RedBox");
	    System.out.println(box.getAttribute("value"));
	    
		
		

	}

}
