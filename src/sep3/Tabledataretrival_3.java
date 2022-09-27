package sep3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabledataretrival_3 {

	public static void main(String[] args) throws Throwable {
		//Table data retrival
		WebDriver skull=new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.get("https://www.qedgetech.com/");
		Thread.sleep(5000);
		//strore table into webelement
		WebElement table= skull.findElement(By.id("tablepress-1"));
		 // rows collection
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("Number of rows: "+rows.size());
		//iterate coloumns
		for (WebElement eachrow : rows) {
			List<WebElement> coloumns=eachrow.findElements(By.tagName("td"));
			for (WebElement eachcols : coloumns) {
				String celldata=eachcols.getText();
				System.out.println(celldata);
				
				
			}
			System.out.println();
			System.out.println("------------------------------------------------");
			Thread.sleep(2000);
			
			
		}
		skull.close();

	}

}
