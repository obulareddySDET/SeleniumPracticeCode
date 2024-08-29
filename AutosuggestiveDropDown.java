package Practice.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropDown {
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chromedriver", "C:\\Users\\vennapo\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id=autosuggest]")).sendKeys("in");
		
		Thread.sleep(3000);
		
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("india")) {
				
				option.click();
				break;
			}
		}
		//driver.close();
	}

}
