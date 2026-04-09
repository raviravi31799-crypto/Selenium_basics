package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_alldata {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
	   List	<WebElement> tablerow=driver.findElements(By.xpath("//table[@id='table1']//tr"));
	   int rowsize=tablerow.size();
	   System.out.println("No.of rows:"+rowsize);
	   List	<WebElement> tablecolumn=driver.findElements(By.xpath("//table[@id='table1']//th"));
	   int columnsize=tablecolumn.size();
	   System.out.println("No.of rows:"+columnsize);
	   //Iterate through each row and column to print the data instead of using xpath
	   for(int i=1;i<=rowsize;i++) {
		   for(int j=1;j<=columnsize;j++) {
			   WebElement data;
			   if(i==1) {
				   //for header row use<th>elements
				   data=driver.findElement(By.xpath("//table[@id='table1']//tr["+i+"]//th["+j+"]"));
				   
			   }
			   else {
				  // use<td>elements
				   data=driver.findElement(By.xpath("//table[@id='table1']//tr["+i+"]//td["+j+"]"));
				   
		   }
			   System.out.println(data.getText());
			   
			   
	   }

	}

}
}
