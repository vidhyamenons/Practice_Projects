import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("OneWay")).click();
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
		Select s=new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("4");
		driver.findElement(By.id("Childrens")).click();
		Select ss=new Select(driver.findElement(By.id("Childrens")));
		ss.selectByValue("2");
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
				
		/*driver.findElement(By.id("FromTag")).sendKeys("ban");
		 Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("#ui-id-1 li a"));

		for (WebElement option : options) {
		if (option.getText().equalsIgnoreCase("Bangalore")) {
			option.click();
			break;
		}
		}*/
		
		
		
	}

}
