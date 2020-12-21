//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathcsspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://login.salesforce.com");
		//driver.findElement(By.xpath("//*[@type='email']")).sendKeys("qwerty");
		//driver.findElement(By.xpath("//*[@type='password']")).sendKeys("1234");
		//driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("123345");
		//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		//driver.findElement(By.cssSelector("#Login")).click();
		//driver.findElement(By.linkText("Forgot Your Password?")).click();
		
		driver.findElement(By.cssSelector("#username")).sendKeys("qwer");
		driver.findElement(By.cssSelector("#password")).sendKeys("qwd");
		driver.findElement(By.cssSelector("#Login")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		
		
	}

}
