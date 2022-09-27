package sep02;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tableretrival_1 {

	public static void main(String[] args) throws Throwable {
		// data return from table
		WebDriver stamp=new ChromeDriver();
		stamp.manage().window().maximize();
		stamp.manage().deleteAllCookies();
		stamp.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		String row1=stamp.findElement(By.xpath("//table[@id='customers']/tbody/tr[6]/td[1]")).getText();
		String row2=stamp.findElement(By.xpath("//table[@id='customers']/tbody/tr[6]/td[2]")).getText();
		String row3=stamp.findElement(By.xpath("//table[@id='customers']/tbody/tr[6]/td[3]")).getText();
		System.out.println(row1+"  "+row2+"  "+row3);
		Thread.sleep(5000);
		stamp.close();
		
		
		
		
		

	}

}
