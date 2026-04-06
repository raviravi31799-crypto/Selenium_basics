package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgebrowser_flipkart {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		String url = "https://www.flipkart.com/";
		driver.get(url);
		String title = driver.getTitle();
		int length = driver.getTitle().length();
		System.out.println("Title:" + title);
		System.out.println("Title length:" + length);
		String currentUrl = driver.getCurrentUrl();
		if (url.equals(currentUrl)) {
			System.out.println("Page found");
		} else {
			System.out.println("Page not found");
		}
		String pagesource = driver.getPageSource();
		int sourcelength = driver.getPageSource().length();
		System.out.println("length:" + sourcelength);

	}

}
