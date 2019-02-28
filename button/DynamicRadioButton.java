package button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();

		// if I want select only "Butter" with out using xpath
		// So, get() defines the index of the element.		
		// For Ex- get(0) - for first element, get(1) - for second element etc.....		
		
		// getAttribute gives the value of that element.		
		// For Ex- get(0).getAttribute("value") - returns the value for first element
		// get(1).getAttribute("value") - returns the value for second element.
		
		
		//findElements() means our locator returns list of elements.
		
		
		for (int i = 0; i < count; i++) {
			// Thread.sleep(1000);
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if(text.equals("Butter")) {
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}

	}

}
