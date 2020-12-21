import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:spicejet.com");
		//System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		
	//count the number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());
	
	}
	

}
