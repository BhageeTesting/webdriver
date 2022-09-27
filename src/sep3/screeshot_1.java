package sep3;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screeshot_1 {

	public static void main(String[] args) throws Throwable {
		// capture screenshot
		WebDriver skull= new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.get("https:/netflix.com");
		Thread.sleep(5000);
		//java time stamp
		Date date= new Date();
		DateFormat df= new SimpleDateFormat("dd_mm_yyyy_hh_ss");
		String datef=df.format(date);
		// take screenshot and store
		File screen= ((TakesScreenshot)skull).getScreenshotAs(OutputType.FILE);
		//copy screen into local system
		FileUtils.copyFile(screen, new File("D:/screenshot/"+datef+"   "+"homepage.png"));
		skull.close();
		
		
		

	}

}
