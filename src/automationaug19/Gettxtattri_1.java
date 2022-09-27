package automationaug19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettxtattri_1 {

	public static void main(String[] args) throws Throwable {
		// write gmailtext and gmail url
		WebDriver scan=new ChromeDriver();
		scan.manage().window().maximize();
		scan.manage().deleteAllCookies();
		scan.get("https://www.netflix.com/in/");
		Thread.sleep(4000);
		String visibletext=scan.findElement(By.partialLinkText("Gmail")).getText();
		System.out.println(visibletext);
		String gmailurl= scan.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(gmailurl);
		scan.close();
		
		
		
		

	}

}
