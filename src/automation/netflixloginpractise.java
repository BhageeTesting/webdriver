package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class netflixloginpractise {

	public static void main(String[] args) throws Throwable {
		// Netflix login page
		WebDriver movie=new ChromeDriver();
		movie.manage().window().maximize();
		movie.manage().deleteAllCookies();
		movie.get("https://www.netflix.com/in/login");
		Thread.sleep(5000);
		movie.findElement(By.id("id_userLoginId")).sendKeys("anjalisgrl.12@gmail.com");
		movie.findElement(By.id("id_password")).sendKeys("Ajjupajju@01");
		movie.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		Thread.sleep(5000);
		movie.close();
				

	}

}
