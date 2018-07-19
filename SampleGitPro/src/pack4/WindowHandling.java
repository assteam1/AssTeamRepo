package pack4;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\git\\AssTeamRepo\\SampleGitPro\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.hdfcbank.com/");
		
		String parentHash=driver.getWindowHandle();
		System.out.println(parentHash);
		
		WebElement loginBtnElement=driver.findElement(By.id("loginsubmit"));
		loginBtnElement.click();
		
		Set<String> allHash=driver.getWindowHandles();
		System.out.println();
		
		for(String w:allHash) {
		System.out.println(w);
		if(!parentHash.equals(w)) {
			
			driver.switchTo().window(w);
			driver.manage().window().maximize();
			
		}
		
		
		}
		
		
		
		
		
		
	}

}
