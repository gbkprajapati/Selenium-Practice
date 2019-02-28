package seleniumGrid;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridExample {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		// Automated- chrome,firefox,ie,safari
		// Commands in Hub Machine
		// Step 1.Setting Up Hub:
		// java -jar selenium-server-standalone-2.44.0.jar -role hub
		
		// Step 2. Validating Hub started
		// http://localhost:4444/grid/console
		// Commands in Node Machine
		
		// Step 3. Accessing Hub from Node Machine
		// http://iporhostnameofHub:4444/grid/console
		
		// Step4 .Registering Node with Hub
		/*Java -DWebdriver.chrome.driver=”\path\chromedriver.exe” 
		 * –jar selenium-server-standalone-2.44.0.jar –role webdriver –hub 
		 * http://iporhostnameofHub:4444/grid/register -port 5566
		*/
		// https://www.codementor.io/olawalealadeusi896/setting-up-selenium-grid-to-run-your-tests-in-parallel-on-multiple-browsers-kl6vqi83a
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		// dc.se

		// Webdriver driver=new ChromeDriver();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		driver.get("http://rediff.com");

		

	}

}
