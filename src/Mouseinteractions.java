import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseinteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1525, TimeUnit.SECONDS);
		driver.get("https://www.amazon.co.uk/");
		WebElement mouse1 = driver.findElement(By.id("nav-link-accountList"));
		Actions a=new Actions(driver);
		a.moveToElement(mouse1).build().perform();
		WebElement mouse2 = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(mouse2).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
		
		

	}

}
