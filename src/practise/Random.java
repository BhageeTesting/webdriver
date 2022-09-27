package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Random {

	public static void main(String[] args) throws Throwable{
		WebDriver con=new ChromeDriver();
		con.manage().window().maximize();
		con.manage().deleteAllCookies();
		JavascriptExecutor js=(JavascriptExecutor)con;
		js.executeScript("window.location='https://amazon.in'");
		con.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String pagetitle =js.executeScript("return document.title").toString();
		System.out.println(pagetitle+"   "+pagetitle.length());
		String url= js.executeScript("return document.URL").toString();
		System.out.println(url+"   "+url.length());
	   String domain=js.executeScript("return document.domain").toString();
	   System.out.println(domain+"   "+domain.length());
	   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	   Thread.sleep(4000);
	   js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	   
		js.executeScript("document.querySelector(\".nav-a[href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']\").click()c");
	   
	   
	   
		
		

	}

}
