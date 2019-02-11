package windowshandlingexample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ParentChildWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp"); // URL in the browser
		
		//Interview Question: How do yo handle multiple windows
		
		System.out.println("Before Switching :Parent title :" + driver.getTitle());
		
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		
		//First get all windows
		Set<String> ids = driver.getWindowHandles(); 
		
		//Then itetate throught it
		Iterator<String> it = ids.iterator();
		
		//Get specific Id
		String parentid = it.next();
		String childid = it.next();
		
		//Change Window
		driver.switchTo().window(childid);
		
		//Get child windows title
		
		System.out.println("Child window title : " +driver.getTitle());
		
		driver.switchTo().window(parentid);
		
		System.out.println("After Switching :Parent title :" + driver.getTitle());
		
		
		
	}

}
