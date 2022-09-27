package aug23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_4 {

	public static void main(String[] args) throws Throwable {
		// gmail registration page listbox for gmail account registration
		WebDriver crazy=new ChromeDriver();
		crazy.manage().window().maximize();
		crazy.manage().deleteAllCookies();
		crazy.navigate().to("https://accounts.google.com/signup/v2/webpersonaldetails?flowName=GlifWebSignIn&flowEntry=SignUp&TL=AKqFyY-r0kM0KOuE6yg82T4cmbchX3K_lXJtOWIxvNZDbPyPQ-V-txzgPJkyexrx");
Thread.sleep(5000);
WebElement first=crazy.findElement(By.cssSelector("#firstName"));
first.clear();
first.sendKeys("Thota");
WebElement last=crazy.findElement(By.cssSelector("#lastName"));
last.clear();
last.sendKeys("Bhageerath");
WebElement mail=crazy.findElement(By.cssSelector("#username"));
mail.clear();
mail.sendKeys("bhageerathtesting1");
crazy.findElement(By.cssSelector("input[name='Passwd']")).sendKeys("greatindia");
Thread.sleep(1000);
crazy.findElement(By.cssSelector("input[name='ConfirmPasswd']")).sendKeys("greatindia");
crazy.findElement(By.xpath("//span[normalize-space()='Next']")).click();
Thread.sleep(5000);






Select skol= new Select(crazy.findElement(By.cssSelector("#month")));
skol.selectByValue("May");
Thread.sleep(4000);
WebElement drake=crazy.findElement(By.cssSelector("#day"));
drake.clear();
drake.sendKeys("12");
Thread.sleep(2000);
WebElement stake=crazy.findElement(By.cssSelector("#year"));
stake.clear();
stake.sendKeys("2000");
Thread.sleep(2000);
Select shruthi= new Select(crazy.findElement(By.cssSelector("#gender")));
shruthi.selectByVisibleText("Male");
Thread.sleep(2000);
crazy.findElement(By.xpath("//span[normalize-space()='Next']")).click();



	}

}
