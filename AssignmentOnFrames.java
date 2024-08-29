package Practice.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * driver.get("https://the-internet.herokuapp.com/");
		 * 
		 * driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		 * 
		 * driver.findElement(By.linkText("nested_frames"));
		 * driver.switchTo().frame("frame-top");
		 * driver.switchTo().frame("frame-middle"); String textMiddle=
		 * driver.findElement(By.id("content")).getText();
		 * System.out.println("textMiddle");
		 */
		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Nested Frames")).click();

		driver.switchTo().frame("frame-top");

		driver.switchTo().frame("frame-middle");

		System.out.println(driver.findElement(By.id("content")).getText());

	}

}
