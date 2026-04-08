package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://demoblaze.com/index.html";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement login=driver.findElement(By.cssSelector("a#login2"));
		login.click();
		WebElement username=driver.findElement(By.cssSelector("input#loginusername"));
		username.sendKeys("Admin@5");
		WebElement pwd=driver.findElement(By.cssSelector("input#loginpassword"));
		pwd.sendKeys("12345");
		WebElement btn=driver.findElement(By.cssSelector("button.btn.btn-primary"));
		btn.click();
		
		
		

	}

}
