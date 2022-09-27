package practise3;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow_2 {

	public static void main(String[] args) throws Throwable {
		// open multiple window and print their titles one by one and close
		WebDriver crazy=new ChromeDriver();
		crazy.manage().window().maximize();
		crazy.manage().deleteAllCookies();
		crazy.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		crazy.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(4000);
		crazy.findElement(By.xpath("//span[@class='allcircle circlefive']")).click();
		crazy.findElement(By.xpath("//span[@class='allcircle circlesix']")).click();
		crazy.findElement(By.xpath("//label[normalize-space()='HILL RAILWAYS']")).click();
		crazy.findElement(By.xpath("//span[@class='allcircle circleight']")).click();
		
		String parent=crazy.getWindowHandle();
		System.out.println(parent);
		
		//get collection of all window id
		
		Set<String> wins=crazy.getWindowHandles();
		System.out.println(wins);
		
		//print each window titles
		
		for (String each : wins) {
			if (!parent.equalsIgnoreCase(each)) {
				String pagetitle=crazy.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(4000);
				crazy.close();
				
				
				
			}
			
			
			
		}
		//give access back to parent window
		crazy.switchTo().window(parent);
		crazy.findElement(By.xpath("//a[normalize-space()='LOGIN']")).click();
		Thread.sleep(5000);
		crazy.close();
		
		
		
		
		
		

	}

}
