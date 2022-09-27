package Practise1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Starbucksrndm {

	public static void main(String[] args) throws Throwable {
		// do some random testing in starbucks
		WebDriver skull= new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.navigate().to("https://www.starbucks.in/");
		Thread.sleep(5000);
		Actions ac= new Actions(skull);
		ac.moveToElement(skull.findElement(By.xpath("//strong[normalize-space()='Coffee']"))).perform();
		Thread.sleep(4000);
ac.moveToElement(skull.findElement(By.linkText("Coffee"))).click().perform();
//verify url
String expected="coffee-sourcing";
String actual=skull.getCurrentUrl();
if (actual.contains(expected)) {
	System.out.println("found successfully: "+expected+"   "+actual);
	
}
else {
	System.out.println("not found in url: "+expected+"   "+actual);
}


File f=new File("F:/starbucks.txt");
FileWriter fw= new FileWriter(f);
BufferedWriter bw= new BufferedWriter(fw);

JavascriptExecutor js=(JavascriptExecutor)skull;
js.executeScript("window.scrollBy(0,600)");
Thread.sleep(5000);
 String para1=skull.findElement(By.xpath("//p[contains(text(),'Fair Trade Certified™ coffee empowers small-scale ')]")).getText();
 String para2=skull.findElement(By.xpath("//p[contains(text(),'Starbucks began purchasing Fair Trade Certified™ c')]")).getText();
 bw.write(para1);
bw.newLine();
bw.newLine();
bw.newLine();
bw.newLine();
bw.newLine();
bw.write(para2);
bw.flush();
bw.close();
skull.close();






	}

}
