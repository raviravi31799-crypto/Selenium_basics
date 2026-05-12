package selenium;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadPDF {

	public static void main(String[] args)throws InterruptedException {
		String filepath=System.getProperty("user.dir")+File.separator+"downloads";
		ChromeOptions options=new ChromeOptions();
		Map<String,Object>prefs=new HashMap<>();
		prefs.put("plugins.always_open_pdf_externally", true);
		prefs.put("download.default_directory", filepath);
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		
		WebElement download=driver.findElement(By.id("downloadButton"));
		download.click();
		
		//Wait for download to complete
		Thread.sleep(5000);
		
		//Check if the file exists
		File downloadfile=new File(filepath);
		if(downloadfile.exists()) {
			System.out.println("File downloaded");
		}
		else {
			System.out.println("File not downloaded");
		}
		

	}

}
