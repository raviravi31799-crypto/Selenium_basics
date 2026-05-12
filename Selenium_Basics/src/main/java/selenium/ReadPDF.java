package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadPDF {

	public static void main(String[] args) {
		String filepath=System.getProperty("user.dir")+File.separator+"downloads";
		ChromeOptions options=new ChromeOptions();
		Map<String,Object>prefs=new HashMap<>();
		prefs.put("plugins.always_open_pdf_externally", true);
		prefs.put("download.default_directory", filepath);
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		/*WebElement more=driver.findElement(By.className("dropdown-toggle"));
		more.click();
		driver.findElement(By.xpath("//a[normalize-space()='File Download']")).click();*/
		driver.findElement(By.className("btn-primary")).click();
		File download=new File(filepath +"/sampleFile.pdf");
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until((ExpectedCondition<Boolean>) wd -> download.exists());
		/*if (download.exists()) 
			
		{
			System.out.println("File downloaded successfully: " + download.getAbsolutePath());
		} else 
		
		{
			System.out.println("File download failed.");
		}
		
		driver.quit();	
				
				*/
				
	  //Read the contents of downloaded file
				PDDocument document=null;
		try {
			document=Loader.loadPDF(download);
			PDFTextStripper stripper=new PDFTextStripper();//Returns document as string or to read required pages (using set start page and set end page)
			String text=stripper.getText(document);
			document.close();
			//print content
			System.out.println("Text in PDF:");
			System.out.println(text);
		}
		catch(IOException e) {
			System.out.println("An error occurred while loading or reading the file"+e.getMessage());
			e.printStackTrace();
		}

	}

}
