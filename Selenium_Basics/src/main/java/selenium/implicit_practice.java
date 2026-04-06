package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
	    WebElement box= driver.findElement(By.cssSelector("input#adder"));
	    box.click();
	    System.out.println(box.getAttribute("class"));
	    WebElement redbox= driver.findElement(By.cssSelector("div#box0"));
	    redbox.click();
	    System.out.println(redbox.getAttribute("class"));
		
	    
	}

}
