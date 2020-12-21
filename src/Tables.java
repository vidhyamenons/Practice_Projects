import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/31613/mi-vs-dc-qualifier-1-indian-premier-league-2020");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int row = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int sum = 0;
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();

		for (int i = 0; i < count - 2; i++)
		{
			String a = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			int actualinteger = Integer.parseInt(a);
			sum = sum + actualinteger;

		}
		String extr = table.findElement(By.xpath("//div[@class='cb-col cb-col-60']/following-sibling::div")).getText();
		int extras = Integer.parseInt(extr);
		int total = sum + extras;
		System.out.println(total);
		String actual = table.findElement(By.xpath("//*[text()='Total']/following-sibling::div")).getText();
				int actualtotal=Integer.parseInt(actual);
				System.out.println(actualtotal);
		
				if(actualtotal==total)
			
					System.out.println("Matched");
					else System.out.println("Not Matching");
				
					
		
	}

}
