import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IIAutosuggestivejavascript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		WebElement source = driver.findElement(By.id("fromCity"));
		source.sendKeys("ban");
		Thread.sleep(2000);
		source.sendKeys(Keys.ARROW_DOWN);
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script= "return document.getElementById(\"fromCity\").value;";
		String text=(String) js.executeScript(script);
		int i=0;
		while(!text.equalsIgnoreCase("Bengaluru"))
		{
			i++;
			source.sendKeys(Keys.ARROW_DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
			if(i>10)
			{
				break;
				
			}
		}
		
		
		
		
	}

}
