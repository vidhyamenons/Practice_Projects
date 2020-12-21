import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");

		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		System.out.println(driver.switchTo().window(childid).getTitle());
		driver.switchTo().window(parentid);
		System.out.println(driver.findElement(By.cssSelector("#content div h3")).getText());

		
	}

}
