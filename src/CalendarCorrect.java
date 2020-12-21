import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarCorrect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();

		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();

		// FOR MONTH
		while (!driver.findElement(By.cssSelector("div[class='ui-datepicker-title'] [class='ui-datepicker-month']"))
				.getText().contains("August"))

		{

			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
		}

		// FOR DATE

		List<WebElement> dates = driver.findElements(By.cssSelector(".ui-state-default"));
		int n = dates.size();

		for (int i = 1; i < n; i++) 
		{

			String text = dates.get(i).getText();
			if (text.equalsIgnoreCase("8"))
			{
				dates.get(i).click();
				break;
			}
		}
	}

}
