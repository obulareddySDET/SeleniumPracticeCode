package Practice.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class ContactCenter extends LoginToMAO{

	public static void main(String[] args) throws InterruptedException {
		ContactCenter.CallCenterPage();

	}

	@SuppressWarnings("deprecation")
	public static void CallCenterPage() throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\vennapo\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://hasbs.omni.manh.com/omnifacade/#/home");
		driver.findElement(By.id("login-username")).sendKeys("ovennapusa");
		Thread.sleep(1000);
		driver.findElement(By.id("discover-user-submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login-password")).sendKeys("Kiran@54720");
		Thread.sleep(1000);

		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Customer Service']")).click();
		Thread.sleep(5000);
		//driver.switchTo().newWindow(WindowType.TAB);
		//Thread.sleep(2000);

		//To carry driver handle to the next Tab

		//driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));

		driver.findElement(By.xpath("(//button[@aria-haspopup='menu'])[1]")).click();

		//driver.findElement(By.xpath("//button[text()=' Hasbro United States ']")).click();

		driver.findElement(By.xpath("//button[text()=' Hasbro United Kingdom ']")).click();
		driver.findElement(By.xpath("(//manh-icon[text()='items'])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Keyword search']")).sendKeys("F69065S01");

		driver.findElement(By.xpath("//span[text()='SEARCH']")).click();

		driver.findElement(By.xpath("//span[text()='ADD & CHECKOUT ']")).click();

		driver.findElement(By.xpath("//manh-icon[text()='add']")).click();

		driver.findElement(By.xpath("//input[@data-placeholder='Customer First Name']")).sendKeys("Kiran Reddy SSP");

		driver.findElement(By.xpath("//input[@data-placeholder='Customer Last Name']")).sendKeys("Vennapusa");

		driver.findElement(By.xpath("//input[@data-placeholder='Customer Phone']")).sendKeys("9160894890");

		driver.findElement(By.xpath("//span[text()='DONE']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@data-placeholder='ADDRESS LINE 1']")).sendKeys("30 Merthyr Road");

		driver.findElement(By.xpath("//input[@data-placeholder='CITY']")).sendKeys("Burnfoot");

		driver.findElement(By.xpath("//input[@data-placeholder='ZIP CODE']")).sendKeys("TD9 8JP");
		driver.findElement(By.xpath("//span[@class='mat-checkbox-inner-container']")).click();
		driver.findElement(By.xpath("//span[text()='USE THIS']")).click();

		driver.findElement(By.xpath("//span[text()='SAVE']")).click();

		String OrderNumber=driver.findElement(By.xpath("//h5[@class='orderIdLabel']")).getText();
		System.out.println(OrderNumber);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='PROCEED TO PAYMENT']")).click();

		driver.findElement(By.xpath("//input[@data-placeholder='EMAIL TO']")).sendKeys("obula.vennapusa@c.hasbro.com");

		driver.findElement(By.xpath("//span[text()='SEND EMAIL ']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' LEAVE ORDER ']")).click();


	}
}
