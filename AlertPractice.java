package Practice.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("name")).sendKeys("Kiran Reddy");
		driver.findElement(By.id("alertbtn")).click();
		
		//clicking on OK/Accepting the alert
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		
		//clicking on cancel/rejecting the alert
		driver.findElement(By.id("confirmbtn")).click();
		String alertText1=driver.switchTo().alert().getText();
		System.out.println(alertText1);
		driver.switchTo().alert().dismiss();
		
	
	}

}
