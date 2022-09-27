package aug26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertcapturing_1 {

	public static void main(String[] args) throws Throwable {
		//capture alert message by handling alert
		WebDriver skull= new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		skull.findElement(By.cssSelector("input[title='Sign in']")).click();
		String alertmsg=skull.switchTo().alert().getText();
		skull.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println(alertmsg);
		skull.close();

	}

}
