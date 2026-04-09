package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables_columnaccess {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
	   List	<WebElement> tablecolumn=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[2]"));
	   for(WebElement data:tablecolumn) {
		   System.out.println(data.getText());

	}
	}
}
