package Practice.Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnWindowHandles {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		driver.findElement(By.xpath("//div[@class='example']/a")).click();

		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> it = windowhandles.iterator();
		String parentId=it.next();
		String childId=it.next();
		
		driver.switchTo().window(childId);
		
		String childText=driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		
		System.out.println(childText);
		
		driver.switchTo().window(parentId);
		
		String ParentText=driver.findElement(By.xpath("//h3")).getText();
		System.out.println(ParentText);
		

	}

}
