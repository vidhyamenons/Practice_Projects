import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addinglisttocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j = 0;
		String[] itemsToAdd = { "Cucumber", "Brocolli", "Carrot","Pumpkin" };
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rahulshettyacademy.com/seleniumPractise");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(products.size());
		for (int i = 0; i < products.size(); i++)

		{
			String[] name = products.get(i).getText().split("-");
			String formattedname = name[0].trim();
			System.out.println(formattedname);
			// format to get actual vegetable name
			// check whether the product extracted is in the array
			// convert array to arraylist

			List itemsToAddList = Arrays.asList(itemsToAdd);

			if (itemsToAddList.contains(formattedname)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsToAdd.length) {
					break;
				}
			}

		}

	}

}
