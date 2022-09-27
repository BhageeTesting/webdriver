package sep02;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jvascript_5 {

	public static void main(String[] args) throws Throwable {
		// login and verify url using javascript
		WebDriver skull= new ChromeDriver();
		skull.manage().deleteAllCookies();
		JavascriptExecutor dc=(JavascriptExecutor)skull;
		dc.executeScript("window.location='http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login'");
		Thread.sleep(5000);
		dc.executeScript("document.querySelector(\"#txtUsername\").value='Admin1'");
		Thread.sleep(5000);
		dc.executeScript("document.querySelector(\"#txtPassword\").value='Qedge123!@#'");
		Thread.sleep(5000);
		dc.executeScript("document.querySelector(\"#btnLogin\").click()");
		Thread.sleep(5000);
		String expected="dashboard";
		String actual=dc.executeScript("return document.URL").toString();
		if (actual.contains(expected)) {
			System.out.println("login success:"+expected+"   "+actual);
			
		}else {
			String errormessage=dc.executeScript("return document.querySelector(\"#spanMessage\").innerHTML").toString();
			System.out.println("login failed:"+errormessage);
		}
		Thread.sleep(2000);
		skull.close();
		
		

	}

}
