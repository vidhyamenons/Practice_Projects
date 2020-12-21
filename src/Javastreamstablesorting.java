import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Javastreamstablesorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> List=driver.findElements(By.xpath("//tr/td[1]"));
		
		
		//sort
		List<String> originalList=List.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(sortedList));
		
		//price of beans
		List<String> price;
		do
		{
	 
			List<WebElement> rowList=driver.findElements(By.xpath("//tr/td[1]"));
			price = rowList.stream().filter(s->s.getText().contains("Rice")).map(s->getVeggiePrice(s)).collect(Collectors.toList());
			
	price.forEach(a->System.out.println(a));	
		if (price.size()<1)
		{
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div[2]/ul/li[7]/a")).click();
		}
		
		}
		while(price.size()<1);}

	private static String getVeggiePrice(WebElement s) {
		// TODO Auto-generated method stub
		String value = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return value;
	}

	}
