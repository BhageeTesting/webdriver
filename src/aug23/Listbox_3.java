package aug23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_3 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver skull= new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.navigate().to("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		WebElement head= skull.findElement(By.cssSelector("#txtuId"));
		head.clear();
		head.sendKeys("Admin");
		String username= head.getAttribute("value");
		WebElement toe=skull.findElement(By.cssSelector("#txtPword"));
		toe.clear();
		toe.sendKeys("Admin");
		String password= toe.getAttribute("value");
		skull.findElement(By.cssSelector("#login")).click();
		System.out.println(username+"   "+password);
		skull.findElement(By.cssSelector("img[height='24'][src='images/Branches_but.jpg']")).click();
		Select desh=new Select(skull.findElement(By.cssSelector("#lst_countryS")));
		desh.selectByVisibleText("INDIA");
		Thread.sleep(3000);
		Select rashtr=new Select(skull.findElement(By.cssSelector("#lst_stateS")));
		rashtr.selectByValue("GOA");
		Thread.sleep(3000);
		Select siti=new Select(skull.findElement(By.cssSelector("#lst_cityS")));
		siti.selectByIndex(1);
		Thread.sleep(3000);
	skull.close();
	}

}
