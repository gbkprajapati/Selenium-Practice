package HandleTableExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandleTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22238/indw-vs-engw-1st-odi-icc-championship-match-england-women-tour-of-india-2019"); 
		// Task 1. First Select table
		
		WebElement table = driver.findElement(By.id("innings_1"));
		
		WebElement tableClass = table.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));

		// Task 2. Total row Select row // Batsman row count
		
		int rowCount =tableClass.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		
		System.out.println("Total Row is : " +rowCount);
		
		// Get Indivisual batsman runs column                           // travse data  parent and child
		int count = tableClass.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		int sum=0;
		for(int i=0;i<count-2; i++) {
			String stringValue = tableClass.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			// convert string to value 
			int intValue = Integer.parseInt(stringValue);
			
			//Total sum run
			
			sum = sum+intValue;
			
			//System.out.println("Batsman List :" + i + " Runs :" + intValue);
			
		}
		
		System.out.println("Total run with out extras "  + sum);
		
		
		// Task 3. Get the Extra and Total Data 
      
		//Get the Extra                                     // Get the data and sibling concept
		String stringExtras = tableClass.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int intExtras = Integer.parseInt(stringExtras);
		
		System.out.println("Extras :" +stringExtras);
		
		// Total runs
		
		int totalRuns = sum+ intExtras;
		
		System.out.println("Totalruns : "+ totalRuns);
		
		//Get the total
		String stringTotal = tableClass.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int intTotal = Integer.parseInt(stringTotal);
		
		System.out.println("Total :" +stringTotal);
		
		Assert.assertEquals(totalRuns,intTotal);
		
		
		
		driver.close();
	}

	

}
