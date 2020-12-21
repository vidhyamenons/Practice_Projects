import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IAutosuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000L);
		List<WebElement> options =driver.findElements((By.cssSelector("#ui-id-1 li a")));
		
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
			   option.click();
			    break;
			}
		}
	}

}
