package sep1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) throws Throwable {
		WebDriver skull=new ChromeDriver();
		skull.manage().window().maximize();
		
		//create object for javascriptexecutor
		
JavascriptExecutor end=(JavascriptExecutor)skull;
end.executeScript("window.location='https://www.amazon.in/'");
Thread.sleep(5000);
//get title
String pageTitle=end.executeScript("return document.title").toString();
System.out.println(pageTitle);
System.out.println(pageTitle.length());
//get domain name


String domain=end.executeScript("return document.domain").toString();
System.out.println(domain);
System.out.println(domain.length());

//scroll dow from top to bottom and viceversa

end.executeScript("window.scrollTo(0,document.body.scrollHeight)");
Thread.sleep(5000);
end.executeScript("window.scrollTo(document.body.scrollHeight,0)");
Thread.sleep(5000);

//scroll to certain pixel

end.executeScript("window.scrollBy(0,900)");
Thread.sleep(5000);

//scroll to particular element in a webpage
WebElement careerslink=skull.findElement(By.linkText("Careers"));
end.executeScript("document.scrollIntoView",careerslink);
careerslink.click();






skull.close();


	}

}
