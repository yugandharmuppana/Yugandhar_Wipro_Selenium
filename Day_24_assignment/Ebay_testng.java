package Testng_package;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
 
public class Ebay_testng {
	WebDriver driver;
	@BeforeTest//1(primary condition)
	  public void beforeTest() throws InterruptedException {
		  driver=new ChromeDriver();
			driver.get("https://www.ebay.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
	  }
	
  @Test(priority=2)
  public void search() {
	  WebElement search=driver.findElement(By.id("gh-ac"));
	  search.clear();
	  search.sendKeys("Watch");
	  search.sendKeys(Keys.ENTER);
	  driver.navigate().refresh();
  }
	
  @Test(priority=1)
  public void search1() {
	  WebElement search=driver.findElement(By.id("gh-ac"));
	  search.clear();
	  search.sendKeys("Phone");
	  search.sendKeys(Keys.ENTER);
	  driver.navigate().refresh();
  }
  
  @Test(priority=3)
  public void search11() {
	  WebElement search=driver.findElement(By.id("gh-ac"));
	  search.clear();
	  search.sendKeys("Bag");
	  search.sendKeys(Keys.ENTER);
	  driver.navigate().refresh();
  }
  
  @AfterTest//3
  public void afterTest() {
	  Assert.assertTrue(true,"Search button is not working");
	  driver.close();
	  
  }
}