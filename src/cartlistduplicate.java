import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.javac.code.Attribute.Array;

public class cartlistduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j = 0;
		String[] items = { "Cucumber", "Tomato", "Beetroot" };
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rahulshettyacademy.com/seleniumPractise");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		List itemsList = Arrays.asList(items);
		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String formattedname = name[0].trim();
			if (itemsList.contains(formattedname))
			{
				j++;
				driver.findElements(By.cssSelector("div.product-action button")).get(i).click();
				if (j == items.length)
					break;
			}
		}
	}

}
