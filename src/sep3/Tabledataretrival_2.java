package sep3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabledataretrival_2 {

	public static void main(String[] args) throws Throwable {
		// Table data retrival data
		WebDriver skull=new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//store table into webelement
		WebElement table=skull.findElement(By.className("dataTable"));
		//collecion of rows
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("Number of rows are: "+rows.size());
		
		//iterate all rows
		for (WebElement eachrows : rows) {
		List<WebElement> coloumns=eachrows.findElements(By.tagName("td"));
		for (WebElement yyy : coloumns) {
			String celldata=yyy.getText();
			System.out.println(celldata+"\n");
			
		}
		System.out.println();
		System.out.println("--------------------------------------------------");
			
		}
		skull.close();
		
		
		

	}

}
