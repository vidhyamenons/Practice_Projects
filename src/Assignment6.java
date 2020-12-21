import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#checkBoxOption3")).click();
		String name = driver.findElement(By.xpath("//div[@class='right-align']/fieldset/label[2]")).getText();
		System.out.println(name);
		driver.findElement(By.id("dropdown-class-example")).sendKeys(name);
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);
		if(alert.contains(name))
		{
			System.out.println("Success");
			
		}
		else System.out.println("Fail");
			
	}

}
