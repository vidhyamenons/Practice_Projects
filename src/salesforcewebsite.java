import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforcewebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("gmail");
		driver.findElement(By.name("pw")).sendKeys("123456");
	//	driver.findElement(By.linkText("Forgot Your Password")).click();
		driver.findElement(By.xpath("//*[@id=\'forgot_password_link\']")).click();

	}

}
