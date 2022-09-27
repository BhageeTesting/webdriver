package sep3;

import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copyingtxtfrmpage {

	public static void main(String[] args) throws Throwable {
		// copying text from webpage
		File f=new File("F:/page.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		 
		WebDriver skull= new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.get("https://www.onlinesbi.sbi/");
		Thread.sleep(5000);
		 String para1=skull.findElement(By.xpath("//em[contains(text(),'Have you tried our new simplified and intuitive bu')]")).getText();
		 String para2=skull.findElement(By.xpath("//em[contains(text(),'Have you tried our new simplified and intuitive bu')]")).getText();
		 
		 bw.write(para1);
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
