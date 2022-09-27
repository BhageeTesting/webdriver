package aug22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collectionhyperlinks_1 {
	public static void main(String[] args) throws Throwable {
		// collection of hyperinks
		WebDriver collect= new ChromeDriver();
		collect.manage().window().maximize();
		collect.manage().deleteAllCookies();
		collect.get("https://www.netflix.com/in/login");
		Thread.sleep(3000);
		List<WebElement> stack=collect.findElements(By.tagName("span"));
		System.out.println("number of links are::"+stack.size());
		for (WebElement each : stack) {
			String linknames=each.getText();
			Thread.sleep(500);
			System.out.println(linknames);
			
		}
		collect.close();

	}

}
