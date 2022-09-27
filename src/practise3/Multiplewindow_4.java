package practise3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow_4 {

	public static void main(String[] args) throws Throwable {
		// open multiple windows and get their title each one by one
		WebDriver skol=new ChromeDriver();
		skol.manage().window().maximize();
		skol.manage().deleteAllCookies();
		skol.get("https://login.yahoo.com/?.src=ym&lang=en-US&done=https%3A%2F%2Fin.mail.yahoo.com%2F%3Fguce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAAHMoII7ugywN1UqsNG2UKGtVFoDA3njX6Jbv8P_u2w_fp2Ku4n94v1_lyXksTreJTL81rCkKt_L4AgpVclCBY7fjQAixTzISohbUTHLeXIozJpb_Qcbe5lXvD7lGezyvvnvcojlrR7UEm3jjQkHqEUax9aM5wJleytkVmofcRQ7f");
		Thread.sleep(5000);
		skol.findElement(By.linkText("Terms")).click();
		skol.findElement(By.linkText("Privacy")).click();
		
		//get window ids
		String parent=skol.getWindowHandle();
		System.out.println(parent);
		
		//get child window ids
		Set<String> allwins=skol.getWindowHandles();
		System.out.println(allwins);
		
		//print each window title one by one
		
		for (String each : allwins) {
			if (!parent.equalsIgnoreCase(each)) {
			  String pagetitle=skol.switchTo().window(each).getTitle();
			  System.out.println(pagetitle);
			  Thread.sleep(4000);
			  skol.close();
				
			}
			
		}
		skol.switchTo().window(parent);
		Thread.sleep(3000);
		skol.close();

	}

}
