import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		Thread.sleep(2000L);
		
		driver.findElement(By.cssSelector("#dropdownGroup1 > div > ul:nth-child(1) > li:nth-child(7) > a")).click();
		
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']")).click();
		
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //*[@id='dropdownGroup1']/div/ul[3]/li[3]/a")).click();
		
		
	}

}