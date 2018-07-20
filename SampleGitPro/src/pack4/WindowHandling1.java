package pack4;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandling1 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\git\\AssTeamRepo\\SampleGitPro\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.canarabank.in/");
		
		String parentHash=driver.getWindowHandle();
		System.out.println(parentHash);
		
		WebElement logbtnelement=driver.findElement(By.xpath("//button[@class='btn btn-default btn-white']"));
		logbtnelement.click();
		
		Set<String> allHash=driver.getWindowHandles();
		System.out.println();
		
		for(String w:allHash){
	    System.out.println(w);
		if(!parentHash.equals(w)) {
			
			driver.switchTo().window(w);
			driver.manage().window().maximize();
			
			driver.findElement(By.id("fldLoginUserId")).sendKeys("shaheedcrazy@gmail.com");
			driver.findElement(By.id("fldPassword")).sendKeys("shahid123");
			WebElement lanLoc=driver.findElement(By.xpath("//select[@id='fldlanguage']"));
			
			Select selectlan=new Select(lanLoc);
			selectlan.selectByVisibleText("English");
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
				}
			}
		
	}

}
