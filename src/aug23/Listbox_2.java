package aug23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_2 {

	public static void main(String[] args) throws Throwable {
		WebDriver strange=new ChromeDriver();
		strange.manage().window().maximize();
		strange.manage().deleteAllCookies();
		strange.navigate().to("https://facebook.com");
		Thread.sleep(2000);
		strange.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		Select bday= new Select(strange.findElement(By.name("birthday_day")));
		Select bmonth=new Select(strange.findElement(By.name("birthday_month")));
		Select byear=new Select(strange.findElement(By.name("birthday_year")));
		bday.selectByVisibleText("12");
		Thread.sleep(2000);
		bmonth.selectByVisibleText("Feb");
		Thread.sleep(2000);
		byear.selectByIndex(5);
		Thread.sleep(2000);
		strange.close();
		

	}

}
