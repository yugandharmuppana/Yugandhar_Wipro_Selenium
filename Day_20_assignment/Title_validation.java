package Sele_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_validation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		System.out.println("Page load successfully");
		
		String expectedtitle="Selenium dev";
		String actualtitle=driver.getTitle();
		
		System.out.println("Expected TitleL:"+expectedtitle);
		System.out.println("Actual Title:"+actualtitle);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Title Validation successful");
		}
		else
		{
			System.out.println("Title Validation failed");
		}
		driver.close();
	}
}