package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Dynamic {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("Admin5@gmail.com");
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.sendKeys("1234567");
		WebElement login=driver.findElement(By.id("submit"));
		login.click();
	   List	<WebElement> tabledata=driver.findElements(By.xpath("//table[@id='myTable']//td"));
		for(WebElement data:tabledata) {
		System.out.println(data.getText());
		}
		

	}

}
