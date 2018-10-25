package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class signup {
	
	public WebDriver driver;
	public static Logger Log = Logger.getLogger(Logger.class.getName());
 
	@Test
  public void test1() throws Exception {
	  
	  driver.findElement(By.xpath(".//*[@id='root']/div/div[1]/div[1]/div/button")).click();
		
	  Log.info("Going to Login Page");
	  
	  driver.findElement(By.id("sign-up")).click();
	  Log.info("Going to signup Page");
	  
	  try{
	  File src=new File("signup.xls");
	  
	   // load file
	   FileInputStream fis=new FileInputStream(src);
	 
	   // Load workbook
	   HSSFWorkbook wb=new HSSFWorkbook(fis);
	   
	   // Load sheet- Here we are loading first sheetonly
	      HSSFSheet sh1= wb.getSheetAt(0);
	      
	     	      
	      System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
	      System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
	      System.out.println(sh1.getRow(1).getCell(2).getStringCellValue());
	      System.out.println(sh1.getRow(1).getCell(3).getStringCellValue());
	      System.out.println(sh1.getRow(1).getCell(4).getStringCellValue());
	      System.out.println(sh1.getRow(1).getCell(5).getStringCellValue());
	      System.out.println(sh1.getRow(1).getCell(6).getStringCellValue());
	      System.out.println(sh1.getRow(1).getCell(7).getStringCellValue());
	      
	      
	      /*System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
	      System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
	      System.out.println(sh1.getRow(2).getCell(2).getStringCellValue());
	      System.out.println(sh1.getRow(2).getCell(3).getStringCellValue());
	      System.out.println(sh1.getRow(2).getCell(4).getStringCellValue());
	      System.out.println(sh1.getRow(2).getCell(5).getStringCellValue());
	      System.out.println(sh1.getRow(2).getCell(6).getStringCellValue());
	      System.out.println(sh1.getRow(2).getCell(7).getStringCellValue());
	      
	      System.out.println(sh1.getRow(3).getCell(0).getStringCellValue());
	      System.out.println(sh1.getRow(3).getCell(1).getStringCellValue());
	      System.out.println(sh1.getRow(3).getCell(2).getStringCellValue());
	      System.out.println(sh1.getRow(3).getCell(3).getStringCellValue());
	      System.out.println(sh1.getRow(3).getCell(4).getStringCellValue());
	      System.out.println(sh1.getRow(3).getCell(5).getStringCellValue());
	      System.out.println(sh1.getRow(3).getCell(6).getStringCellValue());
	      System.out.println(sh1.getRow(3).getCell(7).getStringCellValue());
	      
	      System.out.println(sh1.getRow(4).getCell(0).getStringCellValue());
	      System.out.println(sh1.getRow(4).getCell(1).getStringCellValue());
	      System.out.println(sh1.getRow(4).getCell(2).getStringCellValue());
	      System.out.println(sh1.getRow(4).getCell(3).getStringCellValue());
	      System.out.println(sh1.getRow(4).getCell(4).getStringCellValue());
	      System.out.println(sh1.getRow(4).getCell(5).getStringCellValue());
	      System.out.println(sh1.getRow(4).getCell(6).getStringCellValue());
	      System.out.println(sh1.getRow(4).getCell(7).getStringCellValue());
	      
	      System.out.println(sh1.getRow(5).getCell(0).getStringCellValue());
	      System.out.println(sh1.getRow(5).getCell(1).getStringCellValue());
	      System.out.println(sh1.getRow(5).getCell(2).getStringCellValue());
	      System.out.println(sh1.getRow(5).getCell(3).getStringCellValue());
	      System.out.println(sh1.getRow(5).getCell(4).getStringCellValue());
	      System.out.println(sh1.getRow(5).getCell(5).getStringCellValue());
	      System.out.println(sh1.getRow(5).getCell(6).getStringCellValue());
	      System.out.println(sh1.getRow(5).getCell(7).getStringCellValue());
	      
	      System.out.println(sh1.getRow(6).getCell(0).getStringCellValue());
	      System.out.println(sh1.getRow(6).getCell(1).getStringCellValue());
	      System.out.println(sh1.getRow(6).getCell(2).getStringCellValue());
	      System.out.println(sh1.getRow(6).getCell(3).getStringCellValue());
	      System.out.println(sh1.getRow(6).getCell(4).getStringCellValue());
	      System.out.println(sh1.getRow(6).getCell(5).getStringCellValue());
	      System.out.println(sh1.getRow(6).getCell(6).getStringCellValue());
	      System.out.println(sh1.getRow(6).getCell(7).getStringCellValue());
	      
	      System.out.println(sh1.getRow(7).getCell(0).getStringCellValue());
	      System.out.println(sh1.getRow(7).getCell(1).getStringCellValue());
	      System.out.println(sh1.getRow(7).getCell(2).getStringCellValue());
	      System.out.println(sh1.getRow(7).getCell(3).getStringCellValue());
	      System.out.println(sh1.getRow(7).getCell(4).getStringCellValue());
	      System.out.println(sh1.getRow(7).getCell(5).getStringCellValue());
	      System.out.println(sh1.getRow(7).getCell(6).getStringCellValue());
	      System.out.println(sh1.getRow(7).getCell(7).getStringCellValue());
	      */
	       } catch (Exception e) {
	      
	        System.out.println(e.getMessage());
	       }
	 
	  driver.findElement(By.cssSelector(".policy-link")).click();
	  
	  Thread.sleep(5000);
	  
	  ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	  
	  driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
	  
	  
  }
  
  @BeforeMethod
	public void before(){
		
		System.setProperty("webdriver.chrome.driver", "D:/New folder/chromedriver.exe");
		driver=new ChromeDriver();
		Log.info("Open browser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://portal.spark-telematics.us/login");
		Log.info("Going to Home Page");
}
}