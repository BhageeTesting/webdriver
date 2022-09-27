package sep02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableprint_1 {

	public static void main(String[] args) throws Throwable {
		// print table data
		WebDriver skull=new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		//store table into webelement
		WebElement table=skull.findElement(By.id("customers"));
		//get collection of rows in table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("No.of rows are:"+"  "+rows.size());
		//iterate all rows
		for (int i = 1; i <rows.size(); i++) {
			List<WebElement> coloumns=rows.get(i).findElements(By.tagName("td"));
			System.out.println("Row no :"+i+"coloumns size :"+coloumns.size());
			
		}
		

	}

}
