import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();
		//Thread.sleep(2L);
		//driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("3");

	}

}
