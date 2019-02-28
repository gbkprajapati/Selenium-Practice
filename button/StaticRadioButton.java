package button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\work\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        
        driver.get("http://echoecho.com/htmlforms10.htm");
        driver.findElement(By.xpath("//input[@value='Cheese']")).click();
        int a = driver.findElements(By.xpath("//input[@name='group1']")).size();
        
        System.out.println("Size is " +a);
	}
	

}
