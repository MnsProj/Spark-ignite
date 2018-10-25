package Tests;

import java.util.concurrent.TimeUnit;
import org.sikuli.script.*;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Geofencecreate {
	
	public WebDriver driver;
	public static Logger Log = Logger.getLogger("Geofencecreate");
	
	
  @Test
  public void f() {
	  
	  PropertyConfigurator.configure("Log4j.properties");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  driver.findElement(By.xpath(".//*[@id='root']/div/div[1]/div[1]/div/button")).click();
		
	  Log.info("Going to Login Page");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  driver.findElement(By.id("username")).sendKeys("prod");
	  Log.info("enter username");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("password")).sendKeys("ish@123");
	  Log.info("enter password");
	  
	  boolean loginbutton=driver.findElement(By.xpath(".//*[@id='loginForm']/div[6]/div[2]/button")).isEnabled();
	  System.out.println(loginbutton);
	  
	  if(loginbutton= true){
		  driver.findElement(By.xpath(".//*[@id='loginForm']/div[6]/div[2]/button")).click();
		  
	  }
	  Log.info("login button");
	  
	  
	  /*WebElement ele=driver.findElement(By.xpath(".//*[@id='root']/div/div/div[2]/div/div/h1"));
	  if(ele.getText()=="Oops!"){
		  driver.close();
	  }else{*/
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Geofences")).click();
	  Log.info("select geofence");
	 	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Add Geofence")).click();
	  Log.info("Add geofence");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //driver.findElement(By.xpath(".//input[@class='jss471']")).click();
	  driver.findElement(By.xpath(".//input[@class='jss471']")).sendKeys("iffco chowk");
	  Log.info("enter geofence name");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath(".//*[@id='geofenceListPaddingCreate']/div/div[2]/button")).click();
	  Log.info("create geofence");
	  
	  
	  
  }
  
  @BeforeMethod
	public void before(){
	  	
	  PropertyConfigurator.configure("Log4j.properties");
		System.setProperty("webdriver.chrome.driver", "D:/New folder/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("start-maximized"); // open Browser in maximized mode
		options.addArguments("disable-infobars"); // disabling infobars
		options.addArguments("--disable-extensions"); // disabling extensions
		options.addArguments("--disable-gpu"); // applicable to windows os only
		options.addArguments("--no-sandbox"); // Bypass OS security model
		driver=new ChromeDriver(options);
		Log.info("Open browser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://portal.spark-telematics.us/login");
		Log.info("Going to Home Page");
		
		
	}
}
