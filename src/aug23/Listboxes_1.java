package aug23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxes_1 {

	public static void main(String[] args) throws Throwable {
		// handling listboxes in a webpage by creating a select class and storing particular list box into it
		WebDriver drake=new ChromeDriver();
		drake.manage().window().maximize();
		drake.manage().deleteAllCookies();
		drake.navigate().to("https://amazon.in");
		Thread.sleep(3000);
		Select pick= new Select(drake.findElement(By.name("url")));
		pick.selectByIndex(10);
		
	
		
				
		

	}

}
