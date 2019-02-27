package alertexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertOk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		System.out.println(driver.switchTo().alert().getText());

		// driver.switchTo().alert().sendKeys("fesfe");

		driver.switchTo().alert().accept(); // Accept = ok done yes

		// driver.switchTo().alert().dismiss();
	}

}
