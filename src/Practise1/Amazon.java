package Practise1;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws Throwable {
		// launch url
		WebDriver con= new ChromeDriver();
		Properties p = new Properties();
		p.load(new FileInputStream("F:\\firstclass\\WebDriver\\PropertyFile\\Amazonprop.properties"));
        con.manage().window().maximize();
        con.manage().deleteAllCookies();
        con.navigate().to(p.getProperty("url"));
        con.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //store listbox into List
        List<WebElement> allitems=con.findElements(By.xpath(p.getProperty("item")));
        for (WebElement each : allitems) {
        	System.out.println(each.getText());
			
		} 
        con.findElement(By.xpath(p.getProperty("electronics"))).click();
        con.findElement(By.xpath(p.getProperty("smartwatches"))).click();
        con.findElement(By.xpath(p.getProperty("cares"))).click();
      String sometext= con.findElement(By.xpath(p.getProperty("text"))).getText();
      System.out.println(sometext);
      con.navigate().back();
     String expected="";
     String actual=con.getCurrentUrl();
     if (actual.toLowerCase().contains(expected.toLowerCase())) {
    	 System.out.println("Url matched"+expected+"    "+actual);
    	 
		
	}
     else {
		System.out.println("Url not matched"+expected+"    "+actual);
	}
     con.close();
      
	}

}
