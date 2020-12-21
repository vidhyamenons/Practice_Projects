import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://rediff.com");
		driver.findElement(By.xpath("//*[contains(@title,'Sign in')]")).click();
		driver.findElement(By.cssSelector("[name='login']")).sendKeys("email");
		driver.findElement(By.cssSelector("input[name*='passwd']")).sendKeys("passwd");
		//driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		//System.out.println(driver.findElement(By.cssSelector("#div_login_error > b")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='floatL leftwidth']/div/b")).getText());

	}

}
