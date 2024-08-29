package Practice.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnAutoSuggestiveDropDowns {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("unit");
	
	List<WebElement> options=driver.findElements(By.cssSelector("div[class='ui-menu-item-wrapper']"));
	
	for(WebElement option : options) {
		
		
		if(option.getText().equalsIgnoreCase("United States (USA)")) {
			
			option.click();
			break;
		   
		}
	}
	//driver.close();
}
}
