package aug22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Loginfunctionverifyurl {

	public static void main(String[] args) throws Throwable {
// login functionality and verify url..if username & password invalid print error msg capture username and password in runtime
WebDriver enter=new ChromeDriver();
enter.manage().window().maximize();
enter.manage().deleteAllCookies();
enter.get("https://login.gitam.edu/Login.aspx");
Thread.sleep(5000);
WebElement user= enter.findElement(By.cssSelector("#txtusername"));
user.clear();
user.sendKeys("1210414754");
String username=user.getAttribute("value");
WebElement pass=enter.findElement(By.cssSelector("#password"));
pass.clear();
pass.sendKeys("password");
String password=pass.getAttribute("value");
enter.findElement(By.cssSelector("#Submit")).click();
System.out.println(username+"    "+password);
String Expected="Welcome";
String actual=enter.getCurrentUrl();
if (actual.contains(Expected)) {
	System.out.println("login successful::"+Expected+"    "+actual);
	
	
} else {
	//capture error message
	String errormessage=enter.findElement(By.cssSelector("#lblmessage")).getText();
	System.out.println(errormessage+"    "+Expected+"   "+actual);
}
enter.close();



	}

}
