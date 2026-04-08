package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle_leafground {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/window.xhtml");
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String> windowhandles=driver.getWindowHandles();
		System.out.println("windows:"+windowhandles.size());
		WebElement open=driver.findElement(By.cssSelector("span.ui-button-text.ui-c"));
		open.click();
		Set<String> allwindowhandles=driver.getWindowHandles();
		System.out.println("windows:"+allwindowhandles.size());
		driver.switchTo().window(parentwindow);
		
		}
		
	}


