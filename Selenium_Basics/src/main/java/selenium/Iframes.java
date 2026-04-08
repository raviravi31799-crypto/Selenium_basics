package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		WebElement iframe= driver.findElement(By.id("goog_plcm_frame"));
		driver.switchTo().frame(iframe);
		System.out.println("Switched frame:"+iframe);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.close();

	}

}
