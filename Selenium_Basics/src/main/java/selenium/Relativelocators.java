package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativelocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		WebElement fname=driver.findElement(By.id("First Name"));
		fname.sendKeys("Jo");
		WebElement lname=driver.findElement(By.id("Last Name"));
		lname.sendKeys("Ravi");
		WebElement password=driver.findElement(with.(By.tagName("input")).below(fname));
		}

}
