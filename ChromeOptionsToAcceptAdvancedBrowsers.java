package Practice.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class ChromeOptionsToAcceptAdvancedBrowsers {

	public static void main(String[] args) throws IOException {

		EdgeOptions options= new EdgeOptions();
		//ChromeOptions options =new ChromeOptions();
		//FirefoxOptions options = new FirefoxOptions();
		options.setAcceptInsecureCerts(true);

		WebDriver driver=new EdgeDriver(options);

		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File("C:\\Users\\vennapo\\screenshot.png"));
	}

}
