import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivecleartrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.id("FromTag"));
				dropdown.sendKeys("ban");
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
				dropdown.sendKeys(Keys.ARROW_DOWN);
				dropdown.sendKeys(Keys.ARROW_DOWN);
				dropdown.sendKeys(Keys.ENTER);

		
		
	}

}
