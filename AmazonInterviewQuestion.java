package Practice.Selenium;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonInterviewQuestion {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		int j=0;
		String [] veggies= {"Brocolli","Cucumber","Beetroot","Beans","Carrot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
	 List<WebElement> vegatablesNames= driver.findElements(By.xpath("//h4[@class='product-name']"));
	
	
		for(int i=0;i<vegatablesNames.size();i++) {
			
			String[] veggieNames=vegatablesNames.get(i).getText().split("-");
		
			String formattedVeggie=veggieNames[0].trim();
			 System.out.println(formattedVeggie);
			
			List finalNeeded=Arrays.asList(veggies);
			
			if(finalNeeded.contains(formattedVeggie)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j>veggies.length)
					break;
			}
		}
		
		
		
	}
}
