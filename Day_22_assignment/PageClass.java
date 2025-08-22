package Testng_package;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;
import java.util.Arrays;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClass {
		WebDriver driver;
		By email=By.id("userid");
		By pass=By.id("pass");
		By cont=By.id("signin-continue-btn");
		By search=By.id("gh-ac");
		By submit=By.id("sgnBt");
		
		public PageClass (WebDriver driver)
		{
			this.driver=driver;
		}
		
		public void email_in()
		{
			driver.findElement(email).click();
			driver.findElement(email).clear();
			driver.findElement(email).sendKeys("yuagndharmuppana02@gmail.com");
		}
		
		public void con_in() 
		{
			driver.findElement(cont).click();
		}
		
		public void submit_in() 
		{
			driver.findElement(submit).click();
		}
		
		public void search_in() 
		{
			driver.findElement(search).click();
			driver.findElement(search).sendKeys("watch");
			driver.findElement(search).sendKeys(Keys.ENTER);
		}	
	}




