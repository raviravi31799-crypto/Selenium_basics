package Assessment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demoblaze_testing {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("login2")).click();
		WebElement username=driver.findElement(By.id("loginusername"));
		username.sendKeys("Admin@5");
		WebElement pwd=driver.findElement(By.id("loginpassword"));
		pwd.sendKeys("12345");
		WebElement login=driver.findElement(By.xpath("//button[@onclick='logIn()']"));
		login.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));

        wait.until(ExpectedConditions.textToBePresentInElement(msg, "Welcome"));
		String message=msg.getText();
		
		
     	if(message.equals("Welcome Admin@5")) {
			 System.out.println("Login Successful");
		 }
		 else {
			 System.out.println("Login Failed");
		 }
     	
		 
//Question_2
		
		 WebElement laptop = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@id='itemc'])[2]")));
		 Actions act = new Actions(driver);
	     act.moveToElement(laptop).click().perform();
           List<WebElement> products = driver.findElements(By.xpath("//h4[@class='card-title']/a"));
            List<String> productList = new ArrayList<>();
            for (WebElement p : products) {
	            String title = p.getText();
	            productList.add(title);
	        }
          Collections.sort(productList);

	        Set<String> sortedSet = new LinkedHashSet<>(productList);

	       
	        for (String productTitle : sortedSet) {
	            System.out.println("Found Laptop: " + productTitle);
		 
	        }
	        JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement macbook = driver.findElement (By.xpath("//a[text()='MacBook Pro']"));
            js.executeScript("arguments[0].scrollIntoView(true);", macbook);
            String title = macbook.getText();
            if (title.equals("MacBook Pro")) {
	            System.out.println("MacBook Pro title verified successfully");
	        } else {
	            System.out.println("MacBook Pro not found");
	        }
		 
	        
//Question 3
	        
	    
	      macbook.click();
	      WebElement cart=   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='btn btn-success btn-lg'])")));
	       act.moveToElement(cart).click().perform();
	       //Question 5
           Alert alert=wait.until(ExpectedConditions.alertIsPresent());
           String text=alert.getText();
           alert.accept();
           if(text.equals("Product added."))
    		   System.out.println("Alert handled successfully");
               else {
            	   System.out.println("Alert not handled");
               }
          
           driver.navigate().to("https://demoblaze.com/cart.html#");
           WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='table table-bordered table-hover table-striped']//td[2] ")));
            String name=product.getText();
           if(name.equals("MacBook Pro")) {
        	   System.out.println("Product added to cart");
        	   System.out.println("MacBook pro is added to cart successfully");
           }
           
		 
		 
	//Question 4
           driver.findElement(By.xpath("//button[@data-toggle='modal']")).click();
           driver.findElement(By.id("name")).sendKeys("Ram");
           driver.findElement(By.id("country")).sendKeys("India");
           driver.findElement(By.id("city")).sendKeys("Chennai");
           driver.findElement(By.id("card")).sendKeys("345");
           driver.findElement(By.id("month")).sendKeys("05");
           driver.findElement(By.id("year")).sendKeys("2028");
          WebElement purchase= driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']"));
          purchase.click();
          WebElement alertbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("sweet-alert")));
          String box=alertbox.getText();
          if (box.contains("Id")) {
        	  System.out.println("Order is placed successfully");
        	  Scanner sc = new Scanner(box);
              while (sc.hasNextLine()) {
        	      String details = sc.nextLine();
                   if (details.contains("Id")) {
        	          System.out.println(details);
        	      }
        	      if (details.contains("Amount")) {
        	          System.out.println(details);
        	      }
        	      if (details.contains("Date")) {
        	          System.out.println(details);
        	      }
        	  }
        	  
        	 } else {
        	  System.out.println("Order is Unsuccessful");
        	 }
          driver.quit();
               }
          



}

