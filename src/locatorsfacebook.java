import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsfacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_h")).click();
		//driver.findElement(By.id("email")).sendKeys("test.gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("123456");
	   
		//driver.findElement(By.xpath("//*[@name='email']")).sendKeys("email");
	//	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("1233444");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		//driver.findElement(By.cssSelector("#u_0_h")).click();
		//driver.findElement(By.linkText("Forgotten password?")).click(); 
		
		//driver.switchTo().alert().accept();
		driver.manage().deleteAllCookies();
		driver.findElement(By.linkText("Forgotten password?")).click();
	
	}

}
