package aug23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws Throwable {
		// verify opening a button/link in webpage and back print title and forward print title and refresh the page
		WebDriver skull =new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		skull.findElement(By.partialLinkText("Best Selle")).click();
		System.out.println("page Title[1]"+skull.getTitle());
		Thread.sleep(3000);
		skull.navigate().back();
		System.out.println("page Title[2]"+skull.getTitle());
		Thread.sleep(3000);
		skull.navigate().forward();
		System.out.println("page Title[3]"+skull.getTitle());
		Thread.sleep(3000);
		skull.navigate().refresh();
		Thread.sleep(3000);
		skull.close();		
		
		

	}

}
