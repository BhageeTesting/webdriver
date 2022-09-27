package aug22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Veriflogin_2 {
                  //not executed
	public static void main(String[] args) throws Throwable {
		//verify login functionality and print the run time values of username and password
		WebDriver stock=new ChromeDriver();
		stock.manage().window().maximize();
		stock.manage().deleteAllCookies();
		stock.navigate().to("https://login.gitam.edu/Login.aspx");
		Thread.sleep(5000);
		WebElement username=stock.findElement(By.id("txtusername"));
		username.clear();
		username.sendKeys("1210414754");
		String id=username.getAttribute("value");
		WebElement password=stock.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		password.sendKeys("gitam123");
		String pass=password.getAttribute("value");
		stock.findElement(By.xpath("//input[@id='Submit']")).submit();
		System.out.println(id+"   "+pass);
		//very login
		String expected="Welcome";
		String actual=stock.getCurrentUrl();
		if (actual.contains(expected)) {
			System.out.println("Login successful"+expected+"    "+actual);
		}
		else {
			String errormessage=stock.findElement(By.xpath("//span[@id='lblmessage']")).getText();
			System.out.println(errormessage);
		}
		

	}

}
