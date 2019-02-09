package e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cleartripe2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/"); // URL in the browser
		
		// Calender ui
		
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
		
		
		// Adult
	
	   Select s = new Select(driver.findElement(By.id("Adults")));
	   s.selectByValue("4");
	   
		// child
		
	   Select c = new Select(driver.findElement(By.id("Childrens")));
	   c.selectByIndex(3);
	   
	   //Infants
	   
	   Select i = new Select(driver.findElement(By.id("Infants")));
	   i.selectByVisibleText("2");
	   
	   
	   // Click on More option
	   driver.findElement(By.xpath("//strong[contains(text(),'More options:')]")).click();
	   
	   // Select class
	   WebElement travelc = driver.findElement(By.id("Class"));
	   Select travelclass = new Select(travelc);
	   travelclass.selectByValue("First");
	   
	   // Airline preferred
	   
	   	driver.findElement(By.cssSelector("#AirlineAutocomplete")).sendKeys("Spicejet");
	   
	   	// Search Button

	   	driver.findElement(By.id("SearchBtn")).click();
		
	    // Print Error msg
	   	
	   	System.out.println("Error : " +driver.findElement(By.cssSelector("#homeErrorMessage")).getText());
	   	
	   	

	}

}
