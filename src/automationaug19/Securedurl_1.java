package automationaug19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Securedurl_1 {

	public static void main(String[] args) throws Throwable {
		// verify url is secured or not
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(3000);
		String expected="https://";
		String actual=driver.getCurrentUrl();
		if (actual.startsWith(expected)) {
			System.out.println("url is secured::"+expected+"       "+actual);
			
		} else {
			System.out.println("ürl is not secured::"+expected+"       "+actual);

		}
		driver.close();
	}

}
