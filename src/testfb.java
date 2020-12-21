import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testfb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver=new ChromeDriver();    

	    driver.get("https://www.facebook.com/");

	    driver.manage().window().maximize();

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    System.out.println(driver.getTitle());

	   

	    driver.findElement(By.id("email")).sendKeys("abcde");

	    driver.findElement(By.id("pass")).sendKeys("1234");

	    driver.findElement(By.xpath("//button[@name='login']")).click();

	    Thread.sleep(3000);

	    driver.findElement(By.linkText("Forgotten password?")).click();
		
		
		
	}

}
