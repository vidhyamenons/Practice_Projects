import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countlinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//count links
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//limiting webdriver scope
		WebElement footer=driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//count of links in a particular 
		//WebElement leftdriver = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		WebElement leftdriver = footer.findElement(By.cssSelector("div[id='gf-BIG'] > table > tbody > tr > td:nth-child(1) > ul"));
		System.out.println(leftdriver.findElements(By.tagName("a")).size());
		
		//click on link in the particular coloumn and open in new tabs
		
		int n=leftdriver.findElements(By.tagName("a")).size();
		for(int i=1; i<n ;i++)
		{
			String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			leftdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);		
		
		}
		Thread.sleep(5000L);
		Set<String> id=driver.getWindowHandles();
		Iterator<String> it = id.iterator();
		
		while(it.hasNext())
		{
		System.out.println(driver.switchTo().window(it.next()).getTitle());
		}
		
	}

}
