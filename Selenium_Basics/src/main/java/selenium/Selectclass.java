package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/select.xhtml");
		WebElement UI=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select dropdown=new Select(UI);
		List<WebElement>list=dropdown.getOptions();
		System.out.println("Options size:"+list.size());
		for(WebElement li:list) {
			System.out.println("The options are:"+li.getText());
		}
		Boolean multiple=dropdown.isMultiple();
		System.out.println("Multiple Options:"+multiple);
		dropdown.selectByIndex(1);
		dropdown.selectByVisibleText("Puppeteer");
		
		
		
	}

}
