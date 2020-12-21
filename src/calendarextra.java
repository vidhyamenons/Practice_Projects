/*
public class calendarextra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./WebDrivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");

		System.out.println(driver.getTitle());

		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@id='travel_date']")).click();

		WebElement month = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));

		while(!month.getText().contains("November 2020"))

		{

		     driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();

		     System.out.println(month.getText());

		}

		int count= driver.findElements(By.cssSelector("td[class*='day']")).size();

		for(int i=0;i<count;i++)

		{

		     String text=driver.findElements(By.xpath("//td[@class='day']")).get(i).getText();

		     if(text.equalsIgnoreCase("26"))

		     {

		   // driver.findElements(By.cssSelector("td[class*='day']")).get(i).click();

		driver.findElements(By.xpath("//td[@class='day']")).get(i).click();

		    System.out.println(text);

		    break;

		     }

		}
	}

}
*/