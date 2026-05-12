package selenium;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Autoit_robotclass {

	public static void main(String[] args) throws Exception{
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://pdf2doc.com/");

		WebElement file=driver.findElement(By.id("uploadBtn"));
		file.click();
		Robot rb=new Robot(); // Robot Class
		StringSelection str=new StringSelection("\\\"C:\\\\Users\\\\ELCOT\\\\Documents\\\\Autiitdemo\\\\uploadfile.exe\\\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		 // CTRL + V
	        rb.keyPress(KeyEvent.VK_CONTROL);
	        rb.keyPress(KeyEvent.VK_V);

	        rb.keyRelease(KeyEvent.VK_V);
	        rb.keyRelease(KeyEvent.VK_CONTROL);

	        // Wait
	        Thread.sleep(2000);

	        // Press ENTER
	        rb.keyPress(KeyEvent.VK_ENTER);
	        rb.keyRelease(KeyEvent.VK_ENTER);

	        System.out.println("File Uploaded Successfully");
	    }
	
		
	}


