package pack4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\git\\AssTeamRepo\\SampleGitPro\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/DELL/Desktop/HTML%20&%20CSS/loc.html");
		
		//driver.findElement(By.tagName("input")).sendKeys("Hello");
		//driver.findElement(By.cssSelector("#xyz")).sendKeys("Hi");
		//driver.findElement(By.linkText("My facebook")).click();
		driver.findElement(By.partialLinkText("My")).click();
	}

}
