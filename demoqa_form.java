//Author: Nicole C.

package homework_week10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqa_form {

	WebDriver driver = null;
	
	public void fillDemoqaForm() throws Throwable {
		
		driver = new ChromeDriver();
		
		driver.navigate().to("http://demoqa.com/");
		
		driver.findElement(By.partialLinkText("http://demoqa.com/registration")).click();
		
		driver.findElement(By.name("first_name")).sendKeys("bob");
		
		driver.findElement(By.name("last_name")).sendKeys("vance");
		
		driver.findElement(By.name("radio_4[]")).click();
		
		driver.findElement(By.name("checkbox_5[]")).click();
		
		driver.findElement(By.name("dropdown_7")).click();
		
		driver.findElement(By.name("username")).sendKeys("testtest");
		
		driver.findElement(By.name("password")).sendKeys("testtest22");
		
		driver.findElement(By.name("pie_submit")).click();
		
		
	}
	
}
