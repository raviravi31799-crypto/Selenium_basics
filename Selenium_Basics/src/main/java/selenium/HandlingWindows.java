package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/browser-windows");
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String>allWindowHandles=driver.getWindowHandles();
		System.out.println("Count of windows :"+allWindowHandles.size());
		driver.findElement(By.id("windowButton")).click();
		Set<String>newallWindowHandles=driver.getWindowHandles();
		System.out.println("Count of windows :"+newallWindowHandles.size());
		String ParentHandle=driver.getWindowHandle();
		System.out.println("Parent window:"+ParentHandle);
		//get details of child and parent window
		Iterator<String>iterator=newallWindowHandles.iterator();
		String mainWindow=iterator.next();
		String childWindow=iterator.next();
		System.out.println("Parent window:"+mainWindow);
		System.out.println("Child window:"+childWindow);
		driver.switchTo().window(childWindow);
		WebElement text=driver.findElement(By.id("sampleHeading"));
		System.out.println("Child Title:"+text.getText());
		driver.close();
		driver.switchTo().window(ParentHandle);
		System.out.println("Parent Title:"+driver.getTitle());
		driver.quit();
		
	
		
		
		
		

	}

}
