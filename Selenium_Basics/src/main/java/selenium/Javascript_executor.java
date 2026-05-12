package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_executor {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("document.getElementsByName('name')[0].value='Jothika'");
	    js.executeScript("document.getElementsByName('name')[1].value='Ravi'");
	    js.executeScript("document.getElementsByTagName('input')[2].value='Jo@gmail.com'");
	    js.executeScript("document.getElementsByTagName('input')[3].value='1234567'");
	    js.executeScript("document.getElementsByTagName('input')[4].value='1234567'");
	    js.executeScript("document.getElementsByClassName('btn')[0].click()");
		String domain=js.executeScript("return document.domain").toString();
		System.out.println(domain);
		String url=js.executeScript("return document.url").toString();
		System.out.println(url);
	    

	}

}
