package Sele_package;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class DemoQA {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		WebElement fname=driver.findElement(By.id("firstName"));
		fname.sendKeys("Yugandhar");
		WebElement lname=driver.findElement(By.id("lastName"));
		lname.sendKeys("Muppana");
		
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//*//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		js.executeScript("window.scrollBy(0,700)");
		
		// mobile number
		WebElement mono= driver.findElement(By.id("userNumber"));
		mono.sendKeys("9876543210");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement year = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select sel=new Select(year);
		// sel.selectByIndex(125);// 2025
		// sel.selectByValue("2025");
		sel.selectByVisibleText("2025");
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		Select sel1=new Select(month);
		//sell.selectByValue("0");// January
		// sell.selectByIndex("9");
		sel1.selectByVisibleText("October");
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[5]")).click();
		
		// subject
		String[] subjects= {"Maths","Physics","Economics","English"};
		WebElement sub=driver.findElement(By.id("subjectsInput"));
		for (String subject:subjects)
		{
			sub.sendKeys(subject);
			sub.sendKeys (Keys.ENTER);
		}
		js.executeScript("window.scrollBy(0,900)");
		
		// upload picture
		WebElement img=driver.findElement(By.id("uploadPicture"));
		img.sendKeys("\"D:\\SHOOT PICS\\1675682974101.jpg\"");
		
		WebElement state=driver.findElement(By.id("react-select-3-input"));
		state.sendKeys("NCR");
		state.sendKeys (Keys. ENTER);
		
		WebElement city=driver.findElement(By.id("react-select-4-input"));
		city.sendKeys("Delhi");
		city.sendKeys (Keys.ENTER);
		
		//Submit button
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("screenshot.png");
		Files.copy(src.toPath(), dest.toPath(),StandardCopyOption.COPY_ATTRIBUTES);
	}

}