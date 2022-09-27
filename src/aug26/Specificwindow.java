package aug26;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specificwindow {

	public static void main(String[] args) throws Throwable {
		// handle specific window when multiple windows are open
		WebDriver strange=new ChromeDriver();
		strange.manage().window().maximize();
		strange.manage().deleteAllCookies();
		strange.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(6000);
		strange.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(4000);
		strange.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		strange.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
		strange.findElement(By.xpath("//label[normalize-space()='RAIL DRISHTI']")).click();
		
		//strore all windows into arraylist
		
		ArrayList<String> wins=new ArrayList<String>(strange.getWindowHandles());
		System.out.println(wins);
		
		//switch to hotels window and verify titles
		
		strange.switchTo().window(wins.get(2));
		Thread.sleep(4000);
		String expected="IRCTC Hotels";
		String actual=strange.getTitle();
		 if (expected.equalsIgnoreCase(actual)) {
			 System.out.println("Titles are matching:"+expected+"   "+actual);
			 
			
		}
		 else {
			 System.out.println("Titles are not matching"+expected+"   "+actual);
			
		}
		 strange.close();
		 
		 //switch to air ticketing window
		 
		 strange.switchTo().window(wins.get(3));
		 Thread.sleep(4000);
		 strange.findElement(By.xpath("//input[@id='ltc']")).click();
		 Thread.sleep(4000);
		 strange.close();
		 
		 //switch to drishti and click something
		 
		 strange.switchTo().window(wins.get(1));
		 Thread.sleep(5000);
		 strange.findElement(By.xpath("//h3[normalize-space()='PNR ENQUIRY']")).click();
		 Thread.sleep(4000);
		 strange.close();
		 
		 //switch to parent and close
		 
		 strange.switchTo().window(wins.get(0));
		 Thread.sleep(2000);
		 strange.close();
		 
		 

	}

}
