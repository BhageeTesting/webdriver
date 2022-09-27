package practise3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Random {

	public static void main(String[] args) throws Throwable {
		// Random testing using multiple concepts
		WebDriver skull= new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.navigate().to("https://www.reliancedigital.in/");
		Thread.sleep(5000);
		Actions ac= new Actions(skull);
		
		
		

	}

}
