package automationaug19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrenturl_1 {

	public static void main(String[] args) throws Throwable {
		WebDriver link= new ChromeDriver();
		link.manage().window().fullscreen();
		link.manage().deleteAllCookies();
		link.get("https://www.netflix.com/");
		Thread.sleep(3000);
		String strurl=link.getCurrentUrl();
		System.out.println(strurl);
		System.out.println(strurl.length());
		link.close();

	}

}
