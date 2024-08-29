package Practice.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2_Form {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Kiran Reddy");
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("test@123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		Select option1 = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		option1.selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("07/05/1997");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div[class*='alert-success']")).getText());
		
	}

}
