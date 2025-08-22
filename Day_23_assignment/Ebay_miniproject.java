package Testng_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ebay_miniproject {
	WebDriver driver;
	MiniProjectClass_Ebay mp;
	@BeforeTest 
	public void beforeTest() throws InterruptedException 
	{
		driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Thread.sleep(2000);
	}
	
	 @DataProvider(name = "EbayExcelData")
	    public Object[][] EbayexcelDataProvider() throws IOException {
		 driver.findElement(By.cssSelector(".gh-identity-signed-out-unrecognized > a:nth-child(1)")).click();
	        String excelPath = "/Users/sai/Downloads/EbayLoginData.xlsx";
	        String sheetName = "Sheet1";

	        FileInputStream fis = new FileInputStream(excelPath);
	        Workbook workbook = WorkbookFactory.create(fis);
	        Sheet sheet = workbook.getSheet(sheetName);

	        int rows = sheet.getPhysicalNumberOfRows();
	        Object[][] data = new Object[rows - 1][1];

	        for (int i = 1; i < rows; i++) {
	            Row row = sheet.getRow(i);
	            Cell cell = row.getCell(0); // Only one column
	            data[i - 1][0] = (cell == null) ? "" : cell.toString();
	        }
	        workbook.close();
	        return data;
	    }

	    @Test(dataProvider = "EbayExcelData")
	    public void testemail(String email) throws InterruptedException {
//			Thread.sleep(10000);
	        System.out.println("email " + email );
	        
	        WebElement clean = driver.findElement(By.id("userid"));
            clean.clear();
	        driver.findElement(By.id("userid")).click();
	        driver.findElement(By.id("userid")).sendKeys(email);
	        driver.findElement(By.name("signin-continue-btn")).click();
	        Thread.sleep(2000);
	            }
	    
	    @DataProvider(name = "EbayExcelData1")
	    public Object[][] EbayexcelDataProvider1() throws IOException {
	        String excelPath = "/Users/sai/Downloads/EbayLoginData.xlsx";
	        String sheetName = "Sheet2";

	        FileInputStream fis = new FileInputStream(excelPath);
	        Workbook workbook = WorkbookFactory.create(fis);
	        Sheet sheet = workbook.getSheet(sheetName);
	        int rows = sheet.getPhysicalNumberOfRows();
	        Object[][] data = new Object[rows - 1][1];

	        for (int i = 1; i < rows; i++) {
	            Row row = sheet.getRow(i);
	            Cell cell = row.getCell(0); // Only one column
	            data[i - 1][0] = (cell == null) ? "" : cell.toString();
	        }
	        workbook.close();
	        return data;
	    }

	    @Test(dataProvider = "EbayExcelData1")
	    public void testpassword(String password) throws InterruptedException {
//			Thread.sleep(10000);
	        System.out.println("Password: " + password);
	                driver.findElement(By.id("pass")).click();
	                driver.findElement(By.id("pass")).sendKeys(password);
	                driver.findElement(By.name("sgnBt")).click();
	                Thread.sleep(2000);
//	                WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
//	        		WebElement sfn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passkeys-cancel-btn")));////a[@id='passkeys-cancel-btn']
//	        		sfn.click();
	            }

	
	
	@Test(priority = 2) 
	public void ms() throws InterruptedException 
	{
		MiniProjectClass_Ebay mp=new MiniProjectClass_Ebay (driver);
		mp.multipleSearches();
	}
	
	@Test(priority = 3) 
	public void addingtoCartandDelete() throws InterruptedException 
	{
		MiniProjectClass_Ebay mp=new MiniProjectClass_Ebay (driver);
		mp.addToCartandDelete();
	}
	@Test(priority = 4)
	public void changeAandN() throws InterruptedException 
	{
		MiniProjectClass_Ebay mp=new MiniProjectClass_Ebay (driver);
	    mp.changeAddressAndName();
	}
	@Test(priority = 5)
    public void shoppingByCatTest() throws InterruptedException 
	{
		MiniProjectClass_Ebay mp=new MiniProjectClass_Ebay (driver);
    	mp.shopByCatTest();
        
    }
	@Test(priority = 6)
	public void shoppingByallCatTest() throws InterruptedException 
	{
		MiniProjectClass_Ebay mp=new MiniProjectClass_Ebay (driver);
		mp.shopByallCatTest();
	      
	}
	@Test(priority = 7)

	public void languageChange() throws InterruptedException 
	{
		MiniProjectClass_Ebay mp=new MiniProjectClass_Ebay (driver);
		mp.LanguageChange();

    }	
	@AfterTest 
	public void afterTest() {
		driver.quit();
		System.out.println("Browser closed. Test completed.");
	}
	
}


