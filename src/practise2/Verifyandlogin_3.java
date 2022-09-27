package practise2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verifyandlogin_3 {

	public static void main(String[] args) throws Throwable {
		// login and verify url;
		WebDriver skull= new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.get("https://amazon.in");
		Thread.sleep(5000);
		skull.findElement(By.cssSelector("span[class='nav-line-2 ']")).click();
		WebElement user=skull.findElement(By.cssSelector("#ap_email"));
		user.clear();
		user.sendKeys("bhageeradhthota@gmail.com");
		String username="value";
		skull.findElement(By.className("a-button-input")).submit();
		Thread.sleep(3000);
		WebElement pass=skull.findElement(By.cssSelector("#ap_password"));
		pass.clear();
		pass.sendKeys("Meharindia123");
		skull.findElement(By.cssSelector("#signInSubmit")).submit();
		String password="value";
		System.out.println(username+"     "+password);
		//verify whether it is logged in or not 
		String expected="boom";
		String actual=skull.getCurrentUrl();
		if (actual.contains(expected)) {
			System.out.println("user successfully logged in"+expected);
			
		} else {
			
		String errormessage=skull.findElement(By.cssSelector(".a-list-item")).getText();
		System.out.println("user not logged in"+errormessage);

		}
		//pick item from list box
	Select item=new Select(skull.findElement(By.cssSelector("#searchDropdownBox")));
	item.selectByVisibleText("Electronics");
	Thread.sleep(2000);
	WebElement dot=skull.findElement(By.cssSelector("#twotabsearchtextbox"));
	dot.click();
	dot.clear();
	dot.sendKeys("Mobile");
	Thread.sleep(1000);
	skull.findElement(By.cssSelector("#nav-search-submit-button")).submit();
	Thread.sleep(4000);
	skull.close();
	
	
	
	
	
	
		
		

	}

}
