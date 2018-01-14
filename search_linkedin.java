//Author: Nicole C.

package homework_week10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class search_linkedin {

	WebDriver driver = null;
	
	public void fillDemoqaForm() throws Throwable {
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("linkedin");
		
		driver.findElement(By.id("nqsbq")).sendKeys("Nicole Chen");
		
		driver.findElement(By.partialLinkText("https://www.linkedin.com/pub/dir/Nicole/Chen")).click();
		
		boolean expectedText;
		Assert.assertTrue("Nicole Chen", expectedText);
		
		
	}
	
}
	

