package Practice.Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;


public class Assignment6 {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.qaclickacademy.com/practice.php/");
		driver.manage().window().maximize();
		
		
		
		WebElement checkBox=driver.findElement(By.cssSelector("label[for='benz']"));
		WebElement checkBox1=driver.findElement(By.cssSelector("input[id='checkBoxOption2']"));
		
		checkBox1.click();
		String text=checkBox.getText();
		//System.out.println(text);
		
		
		WebElement dropDwn=driver.findElement(By.id("dropdown-class-example"));
		Select sc=new Select(dropDwn);
		//Thread.sleep(2000);
		sc.selectByVisibleText(text);
		
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(text);
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		
		String AlertTxt=driver.switchTo().alert().getText().split(" ")[1].trim().split(",")[0];
		
		Assert.assertEquals(text, AlertTxt);
	    
		System.out.println(AlertTxt);
		
		driver.switchTo().alert().accept();
		
		
	
		
		
		
	}

}
