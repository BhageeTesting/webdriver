package practise2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks_1 {

	public static void main(String[] args) throws Throwable {
		// print all hyperlink in webpage
		WebDriver skull= new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.navigate().to("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		java.util.List<WebElement> collect=skull.findElements(By.tagName("a"));
		System.out.println("number of links available are:"+collect.size());
		for (WebElement each : collect) {
			Thread.sleep(2000);
			String links=each.getText();
			System.out.println(links);
			
		}
		
		
		
	}

}
