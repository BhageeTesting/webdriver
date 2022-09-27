package aug26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow_1 {

	public static void main(String[] args) throws Throwable {
		// script to handle multiple windows in gmail
WebDriver skull= new ChromeDriver();
skull.manage().window().maximize();
skull.manage().deleteAllCookies();
skull.get("https://www.irctc.co.in/nget/train-search");
Thread.sleep(6000); 
//print parent window id
String parent=skull.getWindowHandle();
System.out.println(parent);

//click on 3 links to open in new windows
skull.findElement(By.xpath("//button[normalize-space()='OK']")).click();
Thread.sleep(5000);
skull.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
skull.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
skull.findElement(By.xpath("//label[normalize-space()='RAIL DRISHTI']")).click();
//skull.findElement(By.xpath("//span[@class='allcircle circlefour']")).click();
//skull.findElement(By.xpath("//label[normalize-space()='BUS']")).click();
//skull.findElement(By.xpath("//span[@class='allcircle circlefive']")).click();
//skull.findElement(By.xpath("//span[@class='allcircle circlesix']")).click();
//skull.findElement(By.xpath("//span[@class='allcircle circleseven']")).click();
//skull.findElement(By.xpath("//span[@class='allcircle circleight']")).click();
//skull.findElement(By.xpath("//span[@class='allcircle circlenine']")).click();

//get collection of all window id
Set<String> allwins=skull.getWindowHandles();
System.out.println(allwins);

//iterate all child windows other than parent

for (String each : allwins) {
	if (!parent.equals(each)) {
		//switch to all windows and get title
		String pagetitle=skull.switchTo().window(each).getTitle();
		System.out.println(pagetitle);
		Thread.sleep(4000);
		skull.close();
		
		
	}
	
}
skull.switchTo().window(parent);
Thread.sleep(5000);
skull.findElement(By.xpath("//a[normalize-space()='LOGIN']")).click();
Thread.sleep(4000);
skull.findElement(By.xpath("//input[@id='2773526']")).sendKeys("thotabhagi");
skull.close();








	}

}
