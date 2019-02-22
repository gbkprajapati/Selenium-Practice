package handelsslcertificate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SslCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Intereview Question : How to handle ssl certificate

		// DesiredCapabilities is use for customize to Chrome broswer.

		DesiredCapabilities ch = DesiredCapabilities.chrome();
		// Trick 1:
		// ch.acceptInsecureCerts();

		// Trick 2:

		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		// To your local Browser
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);

		// To your automation broswer.
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	}

}
