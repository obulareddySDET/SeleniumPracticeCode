package Practice.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
 
public class DateRandomSelection {
	public static void main(String[] args) {
		String year="2029";
		String month="5";
		String day="7";
		String [] expectedList= {month,day,year};
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("div[class='react-date-picker__inputGroup']")).click();
		driver.findElement(By.cssSelector("button[class='react-calendar__navigation__label']")).click();
		driver.findElement(By.cssSelector("button[class='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
	    driver.findElement(By.xpath("//abbr[text()='"+day+"']")).click();
	    
List<WebElement> actualList=	    driver.findElements(By.cssSelector("div[class='react-date-picker__inputGroup'] input[class]"));
	    
	    for(int i=0;i<actualList.size();i++) {
	    	
	    	System.out.println(actualList.get(i).getAttribute("value"));
	    	
	    	Assert.assertEquals(actualList.get(i).getAttribute("value"),expectedList[i]);
	    	
	    }
	   
	    driver.close();
	
	
	
	}

}
