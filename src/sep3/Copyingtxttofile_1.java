package sep3;

import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copyingtxttofile_1 {

	public static void main(String[] args) throws Throwable {
		// copying text from webpage to file
		File f= new File("F://selenium.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		WebDriver skull= new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.get("https://www.bankofbaroda.in/");
		Thread.sleep(5000);
		String para1= skull.findElement(By.xpath("//p[contains(text(),'Bank of Baroda offers different type of accounts t')]")).getText();
		String para2= skull.findElement(By.xpath("//p[contains(text(),'Our official mobile banking application with new a')]")).getText();
		
		bw.write(para1);
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write(para2);
		bw.flush();
		bw.close();
		skull.close();
		

	}

}
