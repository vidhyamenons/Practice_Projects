import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class searchspicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://spicejet.com");
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("#dropdownGroup1 > div > ul:nth-child(1) > li:nth-child(7) > a")).click();
		Thread.sleep(2000);
         driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTNR #dropdownGroup1 > div > ul:nth-child(3) > li:nth-child(3) > a")).click();
         Thread.sleep(2000);
         driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
         driver.findElement(By.id("divpaxinfo")).click();
         Thread.sleep(1000);
         Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
         s.selectByValue("4");
         Thread.sleep(1000);
         Select a=new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
         a.selectByVisibleText("GBP");
         Thread.sleep(1000);
         driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
         Thread.sleep(1000);
         driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();  
                 
         
	}

}
