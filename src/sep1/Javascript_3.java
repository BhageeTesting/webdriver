package sep1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_3 {

	public static void main(String[] args) throws Throwable {
		// fill application using javascript
		
		WebDriver skull= new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		
		JavascriptExecutor strange=(JavascriptExecutor)skull;
		strange.executeScript("window.location='https://demo.opencart.com/index.php?route=account/register&language=en-gb'");
		Thread.sleep(5000);
		strange.executeScript("document.querySelector(\"#input-firstname\").value='sam'");
		
		strange.executeScript("document.querySelector(\"#input-lastname\").value='jason'");
		strange.executeScript("document.querySelector(\"#input-email\").value='samjohn@gmail.com'");
		strange.executeScript("document.querySelector(\"#input-password\").value='jasonsam12345'");
		strange.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
		strange.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
		strange.executeScript("document.querySelector(\"button[type='submit']\").click()");
		 Thread.sleep(5000);
		 skull.close();
		
		
		
		
		

	}

}
