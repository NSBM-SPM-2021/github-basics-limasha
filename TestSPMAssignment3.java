package seleniumWebDriverDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSPMAssignment3 {


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
		driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[2]/td[6]/a[3]")).click();
	}
	
	public static void main(String[] args) 
	{
		TestSPMAssignment3 obj3 = new TestSPMAssignment3();
		obj3.LaunchBrowser();
		obj3.MakePath();

	}

}
