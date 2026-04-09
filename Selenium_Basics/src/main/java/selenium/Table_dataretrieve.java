package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_dataretrieve {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
	   List	<WebElement> tablerow=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
	   for(WebElement data:tablerow) {
		   System.out.println(data.getText());
	   }

	}

}
