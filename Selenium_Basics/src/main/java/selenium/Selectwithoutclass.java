package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectwithoutclass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml");
		WebElement search=driver.findElement(By.id("j_idt87:auto-complete_input"));
		search.sendKeys("Selenium WebDriver");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		List<WebElement>options=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul/li")));
		for(WebElement ob:options) {
			for(WebElement ob1:ob.findElements(By.tagName("li"))) {
				if(ob1.getText().equals("AWS")||ob1.getText().equals("Selenium WebDriver")) {
					ob1.click();
				}
			}
		}
		
		
		
		
		
		

	}

}
