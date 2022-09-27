package aug22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcollection_3 {

	public static void main(String[] args) throws Throwable {
		// coolection of hyperlinks in a webpage and print their names accordingly
		WebDriver con= new ChromeDriver();
		con.manage().window().maximize();
		con.manage().deleteAllCookies();
		con.navigate().to("https://www.bankofbaroda.in/");
		Thread.sleep(5000);
		List<WebElement> links= con.findElements(By.tagName("a"));
		//print no of links in total
		System.out.println("Total number of links are:"+links.size());
		//print all links one by one
		for (WebElement names : links) {
			String  print  =names.getText();
			Thread.sleep(4000);
			System.out.println(print);
			
		}
		con.close();
				

	}

}
