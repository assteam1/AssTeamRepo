package pack4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\git\\AssTeamRepo\\SampleGitPro\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		
		driver.switchTo().frame("iframe1");
		
		WebElement firstNameElement=driver.findElement(By.name("firstname"));
		firstNameElement.sendKeys("Hello Automation");
		
		driver.switchTo().defaultContent();
		
		//driver.switchTo().frame("iframe2");
		driver.switchTo().frame(2);
		
		WebElement tab4Element=driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]"));
		tab4Element.click();
		
	}

}
