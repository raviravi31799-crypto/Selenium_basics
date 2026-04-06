package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");
		WebElement signin=driver.findElement(By.cssSelector("a.nav__button-secondary btn-secondary-emphasis ml-3 btn-md"));
		signin.click();
		WebElement email=driver.findElement(By.cssSelector("input#username"));
		email.sendKeys("raviravi31799@gmail.com");
		WebElement pwd=driver.findElement(By.cssSelector("input#password"));
		pwd.sendKeys("Joravi@5");
		WebElement login=driver.findElement(By.cssSelector("button.btn__primary--large from__button--floating"));
		login.click();
		
		
	}

}
