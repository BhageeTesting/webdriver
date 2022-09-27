package automationaug19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_1 {

	public static void main(String[] args) throws Throwable {
		WebDriver dot=new ChromeDriver();
		dot.manage().window().maximize();
		dot.manage().deleteAllCookies();
		dot.get("https://google.com");
		Thread.sleep(3000);
		String title=dot.getTitle();
		System.out.println(title);
		System.out.println(title.length());
		dot.close();
		
		
		

	}

}
