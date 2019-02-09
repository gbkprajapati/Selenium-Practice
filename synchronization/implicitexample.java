package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.alaskaair.com/"); 
		
		// This code will not work
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // implicit 
		
		driver.findElement(By.id("tab-hotels")).click();
		driver.findElement(By.id("FindHotels")).click();
		WebElement locationHotel = driver.findElement(By.xpath("//input[@placeholder='Where do you need a hotel?']"));
		locationHotel.sendKeys("nyc");
		locationHotel.sendKeys(Keys.ARROW_DOWN);
		locationHotel.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.xpath("//form[@id='gcw-hotel-form-hlp']//button[@type='submit']")).click();
		
		
	}

}
