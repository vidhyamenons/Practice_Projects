import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qaclickacademy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//driver.findElement(By.xpath("//body/div/div/header/div/div[3]/a[2]")).click(); //abs xpath
		//child to parent traverse
		//System.out.println(driver.findElement(By.xpath("//*[@id='root']/div/header/div/div[3]/a[2]/parent::div")).getAttribute("role"));
		
		
		driver.findElement(By.xpath("//*[@id='root']/div/header/div/div[3]/a[2]/parent::div")).click();
		//sibling travrse
		//driver.findElement(By.xpath("//*[@id='root']/div/header/div/div[3]/a[2]/following-sibling::a[3]")).click();
		
		
		//using text 
		//driver.findElement(By.xpath("//*[text()='Limited offer - FREE Core Java & QA Resume course']")).click();
		

	}

}
