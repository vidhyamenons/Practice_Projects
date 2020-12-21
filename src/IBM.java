import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IBM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://uk.farnell.com/c/passive-components/resistors-fixed-value/chip-smd-resistors");

		// driver.findElement(By.xpath("//a[@title='MCWR06X4022FTL']")).click();

		List<WebElement> List = driver.findElements(By.xpath("//*[@id='sProdList']/tbody/tr/td[5]"));
		List<Boolean> booleanList = List.stream().map(s -> s.getText().contains("nijk"))
				.collect(Collectors.toList());
		//System.out.println(booleanList);
		int i=0;
		int flag=0;
		while(!booleanList.get(i))
		{
			i++;
			flag=0;
			if (i > List.size())
			break;
		}
		if(flag<List.size())
			System.out.println("Fail");
		else
			System.out.println("Succes");


		driver.close();
	}
}
