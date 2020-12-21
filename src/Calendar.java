import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		// FOR MONTH
		// while(!driver.findElement(By.cssSelector("ui-datepicker-title")).getText().contains("August"))

		List<WebElement> months = driver.findElements(By.cssSelector(".ui-datepicker-title"));
		for (int i = 0; i < driver.findElements(By.cssSelector(".ui-datepicker-title")).size(); i++)
		{
			while (!driver.findElements(By.cssSelector(".ui-datepicker-title")).get(i).getText().contains("February"))
				
			{
				driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
			}

		}
		// FOR DATE
		/*
		 * List<WebElement>
		 * dates=driver.findElements(By.cssSelector(".ui-state-default")); int
		 * n=driver.findElements(By.cssSelector(".ui-state-default")).size();
		 * 
		 * for(int i=1;i<n;i++) {
		 * 
		 * String text =
		 * driver.findElements(By.cssSelector(".ui-state-default")).get(i).getText();
		 * if(text.equalsIgnoreCase("8")) {
		 * driver.findElements(By.cssSelector(".ui-state-default")).get(i).click();
		 * break; } }
		 */

	}

}
