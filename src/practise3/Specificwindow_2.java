package practise3;



import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specificwindow_2 {

	public static void main(String[] args) throws Throwable {
		// open multiple window and jump to specific window and test
WebDriver open=new ChromeDriver();
open.manage().window().maximize();
open.manage().deleteAllCookies();
open.get("https://login.yahoo.com/?.src=ym&lang=en-US&done=https%3A%2F%2Fin.mail.yahoo.com%2F%3Fguce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAAHMoII7ugywN1UqsNG2UKGtVFoDA3njX6Jbv8P_u2w_fp2Ku4n94v1_lyXksTreJTL81rCkKt_L4AgpVclCBY7fjQAixTzISohbUTHLeXIozJpb_Qcbe5lXvD7lGezyvvnvcojlrR7UEm3jjQkHqEUax9aM5wJleytkVmofcRQ7f");
Thread.sleep(5000);	
	open.findElement(By.linkText("Terms")).click();
	open.findElement(By.linkText("Privacy")).click();
	
	String parent=open.getWindowHandle();
	System.out.println(parent);
	
	//store all windows into arrayllist
	ArrayList<String> allwins=new ArrayList<String>(open.getWindowHandles());
	System.out.println(allwins);
	
	//switch to specific window and open products
	
	open.switchTo().window(allwins.get(1));
	open.findElement(By.xpath("//a[@class='is-not-active'][normalize-space()='Products']")).click();
	Thread.sleep(4000);
	open.close();
	
	//switch to other  child window and verify title
	
	open.switchTo().window(allwins.get(2));
	String expected="Yahoo Terms of Service | Yahoo";
	String actual=open.getTitle();
	if (actual.equalsIgnoreCase(expected)) {
		System.out.println("Titles are matching:"+expected+"   "+actual);
		
	}
	else {
		System.out.println("Titles are not matching"+expected+"  "+actual);
	}
	open.close();
	
	//switch back to parent and close
	open.switchTo().window(parent);
	Thread.sleep(5000);
	open.close();
	
	
	
	
	

	

	
	
	
	}

}
