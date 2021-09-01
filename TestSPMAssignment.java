package seleniumWebDriverDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSPMAssignment {


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
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/b/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"ItemID\"]")).sendKeys("001D");
		driver.findElement(By.xpath("//*[@id=\"ItemName\"]")).sendKeys("Pasta");
		driver.findElement(By.xpath("//*[@id=\"Description\"]")).sendKeys("dddd");
		driver.findElement(By.xpath("//*[@id=\"UnitPrice\"]")).sendKeys("120.00");
		driver.findElement(By.xpath("//*[@id=\"Date\"]")).sendKeys("2021.08.19");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/div[2]/div[6]/div/div[2]/input")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"ItemID\"]")).sendKeys("001D");
		driver.findElement(By.xpath("//*[@id=\"ItemName\"]")).sendKeys("Pasta");
		driver.findElement(By.xpath("//*[@id=\"Description\"]")).sendKeys("dddd");
		driver.findElement(By.xpath("//*[@id=\"UnitPrice\"]")).sendKeys("120.00");
		driver.findElement(By.xpath("//*[@id=\"Date\"]")).sendKeys("2021.08.19");
		driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/div[2]/div[6]/div/div[1]/input")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/div[2]/div[7]/b/a")).click();
	}
	
	public static void main(String[] args) 
	{
		
		TestSPMAssignment obj = new TestSPMAssignment();
		obj.LaunchBrowser();
		obj.MakePath();
	}

}
