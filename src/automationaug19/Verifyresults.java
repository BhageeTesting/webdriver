package automationaug19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifyresults {

	public static void main(String[] args) throws Throwable {
		WebDriver stranger= new ChromeDriver();
		stranger.manage().window().maximize();
		stranger.manage().deleteAllCookies();
		stranger.get("https://google.com");
		Thread.sleep(3000);
		String expected= "google";
		String actual=stranger.getTitle();
		if (actual.equalsIgnoreCase(expected)) {
			System.out.println("Titles are matching::"+expected+"    "+actual);
			
		} else {
System.out.println("Titles are not equal::"+expected+"     "+actual);
		}
		stranger.close();
		

	}

}
