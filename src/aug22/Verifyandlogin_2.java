package aug22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifyandlogin_2 {

	public static void main(String[] args) throws Throwable {
		WebDriver screw=new ChromeDriver();
		screw.manage().window().maximize();
		screw.manage().deleteAllCookies();
		screw.get("https://www.netflix.com/in/login");
		Thread.sleep(5000);
WebElement head=screw.findElement(By.cssSelector("#id_userLoginId"));
head.clear();
head.sendKeys("anjalisgrl.12@gmail.com");
String username= head.getAttribute("value");
WebElement pass= screw.findElement(By.cssSelector("#id_password"));
pass.clear();
pass.sendKeys("Ajjupajju@01");
String password= pass.getAttribute("value");
screw.findElement(By.cssSelector("button[type='submit']")).submit();
System.out.println(username+"   "+password);
Thread.sleep(9000);
String expected="browse";
String actual=screw.getCurrentUrl();
if (actual.contains(expected)) {
	System.out.println("login succesful::"+actual+"   "+expected);
	
} else {
	String error=screw.findElement(By.cssSelector(".ui-message-contents")).getText();
	System.out.println(error+"   "+expected+"   "+actual);

}
screw.close();
	}

}
