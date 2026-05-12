package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoIT_demo {
	public static void main(String[]args)throws Exception {
	ChromeOptions options=new ChromeOptions();
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://pdf2doc.com/");

	WebElement file=driver.findElement(By.id("uploadBtn"));
	file.click();
	Runtime.getRuntime().exec("\"C:\\Users\\ELCOT\\Documents\\Autiitdemo\\uploadfile.exe\"");
	//driver.close();
	
    
     
     
}
}
