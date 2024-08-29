package Practice.Selenium;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class AssignmentOnWebTable {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,500)");
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		
		System.out.println(rows.size());
		
		List<WebElement>columns=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th"));
		
		System.out.println(columns.size());
		
		List<WebElement>columnsNames=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td"));
		for(int i=0;i<columnsNames.size();i++) {
			
			System.out.println(columnsNames.get(i).getText());
			
		}
	}

}
