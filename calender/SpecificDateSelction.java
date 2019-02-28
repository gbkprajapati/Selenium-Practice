package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificDateSelction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");

		// April 23 // interview question
		driver.findElement(By.id("travel_date")).click();
        
		// Step 1 : for select month : 
		                                        // Parent -child if there is no specific id
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		
		// Note : For calender find common attribitue put into list & iterate
		// Step 2 :- Select data code
		List<WebElement> dates = driver.findElements(By.className("day"));

		// int count = driver.findElements(By.className("day")).size();

		for (int i = 0; i < dates.size(); i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();

			if (text.contains("13")) {
				driver.findElements(By.className("day")).get(i).click();
				break;

			}
		}

	}

}
