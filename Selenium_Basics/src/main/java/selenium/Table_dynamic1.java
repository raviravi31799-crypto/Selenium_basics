package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_dynamic1 {

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
		List<WebElement> table=driver.findElements(By.xpath("//table[@id='myTable']/tr/td[2]"));
	   String expectedname="Arjun K";
	   int tablesize=table.size();
	   System.out.println("Table size:"+tablesize);
		for(WebElement data:table) {
		System.out.println(data.getText());
		}
		int i=1;
		for(WebElement name:table) {
			if(name.getText().equals(expectedname)) {
				List<WebElement> Rowdata=driver.findElements(By.xpath("//table[@id='myTable']/tr["+i+"]"));
				for(WebElement row:Rowdata) {
					System.out.println(row.getText());
				}
			}
			i++;
		}

	}
	

}

