import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//*[contains(@href,'nested')]")).click();
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		
		System.out.println(driver.findElement(By.id("content")).getText());

		
	}

}
