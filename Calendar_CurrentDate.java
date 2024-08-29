package Practice.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_CurrentDate {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("div[id*='destinationStation1_CTNR'] a[value='MAA']")).click();
		
		driver.findElement(By.cssSelector("a[class*='ui-state-highlight'] ")).click();
		
	}

}
