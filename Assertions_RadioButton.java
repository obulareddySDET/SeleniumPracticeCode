package Practice.Selenium;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertions_RadioButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//driver.close();
	    driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
	    Thread.sleep(3000);
	    //driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
	    for(int i=1;i<5;i++) {
	    	driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
	    	
	    	
	    }
	    System.out.println(driver.findElement(By.cssSelector("div[id='divpaxinfo']")).getText());
	
	    Assert.assertEquals(driver.findElement(By.cssSelector("div[id='divpaxinfo']")).getText(), "5 Adult");
	
	}

}
