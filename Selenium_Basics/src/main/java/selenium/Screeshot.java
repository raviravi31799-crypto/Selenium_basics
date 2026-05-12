package selenium;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screeshot {

	public static void main(String[] args) throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		TakesScreenshot shot=(TakesScreenshot)driver;
		File source=shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,newFile("./SeleniumScreenshots/Screen.png"));
	}

}
