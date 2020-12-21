import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class csslocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:spicejet.com");
		Select s=new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
		//s.selectByValue("GBP");
		s.selectByIndex(3);
		

	}

}
