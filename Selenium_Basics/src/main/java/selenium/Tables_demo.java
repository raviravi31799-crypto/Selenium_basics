package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables_demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
	   List	<WebElement> table=driver.findElements(By.xpath("//table[@id='table1']//th"));
		System.out.println("Heading size:"+table.size());
		for(WebElement heading:table) {
			System.out.println(heading.getText());
		}
		

	}

}
