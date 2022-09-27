package sep3;

import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class copyingtxtintofile_1 {

	public static void main(String[] args) throws Throwable {
		// copy text from irctc into file
		File f= new File("F://selenium.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		WebDriver con= new ChromeDriver();
		con.manage().window().maximize();
		con.manage().deleteAllCookies();
		con.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		con.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(3000);
		String para1=con.findElement(By.xpath("//p[contains(text(),'India, the country where Buddhism originated has r')]")).getText();
		String para2=con.findElement(By.xpath("//p[contains(text(),'IRCTC offers Exclusive Rail tour packages with con')]")).getText();
		 bw.write(para1);
		 bw.newLine();
		 bw.newLine();
		 bw.newLine();
		 bw.newLine();
		 bw.newLine();
		 bw.write(para2);
		 bw.flush();
		 bw.close();
		 con.close();
		 
		
		
		
		

	}

}
