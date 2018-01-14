//Author: Nicole C.

package homework_week10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class expedia_vacationpkg {

WebDriver driver = null;
	
	public void searchVacationPKG() throws Throwable {
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.expedia.com/");
		
		driver.findElement(By.id("package-origin-hp-package")).sendKeys("Seattle, WA");
		
		driver.findElement(By.id("package-destination-hp-package")).sendKeys("Cancun, MX");
		
		driver.findElement(By.id("search-button-hp-package")).click();	

	}
}
