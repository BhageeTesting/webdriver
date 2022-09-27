package aug30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
                 //drag and drop
public class Clickandhold_2 {

	public static void main(String[] args) throws Throwable {
		// click and hold /drag and drop source file to target 
		WebDriver skew=new ChromeDriver();
		skew.manage().window().maximize();
		skew.manage().deleteAllCookies();
		skew.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		//switch inside iframe
		skew.switchTo().frame(0);
		//store source and target as webelement objects
		WebElement source= skew.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		WebElement target=skew.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
		Thread.sleep(3000);
		
		Actions ac= new Actions(skew);
		
	ac.clickAndHold(source).moveToElement(target).release().perform();
	
	//switch to webpage 
	
skew.switchTo().defaultContent();
ac.moveToElement(skew.findElement(By.linkText("Button"))).click().perform();
Thread.sleep(5000);
skew.close();

	
	
		
		

	}

}
