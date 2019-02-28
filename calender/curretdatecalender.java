package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class curretdatecalender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='AMD']")).click();
		Thread.sleep(2000);

		// Trick 1: Dynamic path Syntax using Index : (//xpath)[] for second instance
		// because selenium goes to top to left
		// driver.findElement(By.xpath("(//a[@value='DXB'])[2]")).click();

		// Trick 2: Dynamic path Syntax using parent Child Relationship: xpath space
		// xpath

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BOM']"))
				.click();

		                                   // Calender

		// Extra
		// driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		//Note // Ther is no space between class also add Dot(.)
		// Ex. .ui-state-default.ui-state-highlight.ui-state-active
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

	}

}
