package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestion_actions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/select.xhtml");
		WebElement search=driver.findElement(By.id("j_idt87:auto-complete_input"));
		Actions act=new Actions(driver);
		search.sendKeys("Selenium WebDriver");
		WebElement list=driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']"));
		act.moveToElement(list).click().perform();
		search.sendKeys("Appium");
		WebElement list1=driver.findElement(By.xpath("//li[@data-item-label='Appium']"));
		act.moveToElement(list).click().build().perform();

	}

}
