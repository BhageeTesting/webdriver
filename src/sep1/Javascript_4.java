package sep1;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_4 {
 //not executed as we cannot proceed completly with java script or if script doesnt work..
	                  //use normal webdriver methods

	
	public static void main(String[] args) throws Throwable {
		// Netflix login
		WebDriver skull= new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		 JavascriptExecutor end=(JavascriptExecutor)skull;
		 end.executeScript("window.location='https://www.netflix.com/in/login'");
		 Thread.sleep(5000);
		 end.executeScript("document.querySelector(\"#id_userLoginId\").value='anjalisgrl.12@gmail.com'");
		 Thread.sleep(5000);
end.executeScript("document.querySelector(\"#id_password\").value='Ajjupajju@01'");
Thread.sleep(5000);
//WebElement button= skull.findElement(By.xpath("//button[normalize-space()='Sign In']"));
//button.click();
end.executeScript("document.querySelector(\"button[type='submit']\").click()");

Thread.sleep(5000);
skull.close();


}

}
