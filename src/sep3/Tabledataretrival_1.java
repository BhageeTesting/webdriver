package sep3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabledataretrival_1 {

	public static void main(String[] args) throws Throwable {
		// Return data from table
		WebDriver skull=new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.get("https://money.rediff.com/index.html");
		Thread.sleep(5000);
		//store table into webelement
		WebElement table=skull.findElement(By.id("allpage_links"));
		//collection of rows
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("No of Rows are: "+rows.size());
		
		//collection of coloumns
		for (WebElement eachrow : rows) {
			List<WebElement> coloumns=table.findElements(By.tagName("td"));
			//iterate all coloumns
			for (WebElement eachcell : coloumns) {
				String celldata=eachcell.getText();
				Thread.sleep(5000);
				System.out.println(celldata+"\n");
				
			}
			System.out.println();
		
			
			
		}
		

	}

}
