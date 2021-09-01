package seleniumWebDriverDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSPMAssignment1 {


	WebDriver driver;
	
	//Launching the chrome browser
	public void LaunchBrowser()
	{
	    System.setProperty("webdriver.chrome.driver", "G:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://localhost:44310/Admin");
	}
	
	//Make the path
	public void MakePath()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[12]/td[6]/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"ItemID\"]")).sendKeys("001D");
		driver.findElement(By.xpath("//*[@id=\"ItemName\"]")).sendKeys("Pasta");
		driver.findElement(By.xpath("//*[@id=\"Description\"]")).sendKeys("dede");
		driver.findElement(By.xpath("//*[@id=\"UnitPrice\"]")).sendKeys("130.00");
		driver.findElement(By.xpath("//*[@id=\"Date\"]")).sendKeys("2021.08.19");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/div[2]/div[6]/div/div[1]/input")).click();
		
	}
	
	public static void main(String[] args)
	{
		
		TestSPMAssignment1 obj1 = new TestSPMAssignment1();
		obj1.LaunchBrowser();
		obj1.MakePath();
	}

}
