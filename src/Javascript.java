import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.ksrtc.in");
		//driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.findElement(By.id("fromCity")).sendKeys("ban");
		//Thread.sleep(2000);

		//driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromCity")).sendKeys(Keys.ARROW_DOWN);
		

		//System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
		System.out.println(driver.findElement(By.id("fromCity")).getText());
//Javascript DOM can extract hidden elements
//because selenium cannot identify hidden elements - (Ajax implementation)
//investigate the properties of object if it have any hidden text

//JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementById(\"fromCity\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		int i = 0;
//BENGALURU INTERNATION AIPORT
		while (!text.equalsIgnoreCase("BENGALURU")) {
			i++;
			driver.findElement(By.id("fromCity")).sendKeys(Keys.DOWN);

			text = (String) js.executeScript(script);
			System.out.println(text);
			if (i > 10) {
				break;
			}

		}

		if (i > 10) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element  found");
		}
	}

}
