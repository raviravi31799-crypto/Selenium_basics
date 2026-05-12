package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoITsendkeys_upload {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/upload-download");

		WebElement file=driver.findElement(By.id("uploadFile"));
		Thread.sleep(5000);
		file.sendKeys("C:\\Users\\ELCOT\\Downloads\\Team-14 .pdf");
		Thread.sleep(5000);
			
		System.out.println("File uploaded");
		driver.close();
	}

}
