import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class website {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://yahoo.com");
		//driver.findElement(By.xpath("//*[@id=\'header-signin-link\']/span")).click();
		driver.findElement(By.cssSelector("input[class*=phone]")).sendKeys("hai");//regular expression
		driver.findElement(By.cssSelector("#mbr-forgot-link")).click();
		driver.findElement(By.xpath("//*[@value='Next']")).click();
		
	}

}
