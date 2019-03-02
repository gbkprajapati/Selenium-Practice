package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/"); // URL in the browser
		Actions  a = new Actions(driver);
		
		WebElement move = driver.findElement(By.cssSelector("#nav-link-accountList"));
		
		//Move to specific element // mouseover
		a.moveToElement(move).build().perform();
		
		//Right click 
		a.moveToElement(move).contextClick().build().perform();
		
		//Move to specific element // input box // double click
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
	}

}
