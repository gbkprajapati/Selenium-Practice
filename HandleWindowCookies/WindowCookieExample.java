package HandleWindowCookies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowCookieExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Open Window in maxmize
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/"); 
		
		driver.manage().deleteAllCookies();
		
	    // Interview Question		
		//	driver.manage().deleteCookieNamed("sessionKey");
		
		//click on any link
		//login page- verify login url
		
		
		

	}

}
