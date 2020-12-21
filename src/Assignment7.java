import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.id("product"));
		int row=table.findElements(By.xpath("//*[@id='product']/tbody/tr")).size();
		System.out.println("Number of rows are");
		System.out.println(row);
		int coloumns=table.findElements(By.xpath("//*[@id='product']/tbody/tr[2]/td")).size();
		System.out.println("Number of coloumns are");
		System.out.println(coloumns);
		System.out.println("CONTENTS OF SECOND ROW");
		for(int i=0; i<coloumns;i++)
		{
			System.out.println(table.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr[3]/td")).get(i).getText());
		}
		}

}
