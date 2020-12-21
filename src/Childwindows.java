import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.cssSelector("#initialView > footer > ul > li:nth-child(2) > a")).click();

		Set<String> id = driver.getWindowHandles();
		Iterator<String> it = id.iterator();
		String parent = it.next();
		String child = it.next();
		System.out.println(driver.switchTo().window(child).getTitle());

	}

}
