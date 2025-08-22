package Sele_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.asserts.SoftAssert;
import graphql.Assert;

public class TitleValidation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("Page load successfully");
		//SoftAssert soft=new SoftAssert();
		String expectedtitle="Selenium dev";
		String actualtile=driver.getTitle();
		
		System.out.println("Expected Title: "+expectedtitle);
		System.out.println("Actual Title:"+actualtile);
		Assert.assertTrue(false, "Title validation failed"); // first validation
	}
}