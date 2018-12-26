package Tests;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class Validate_login {
	public WebDriver driver;
	public static Logger Log = Logger.getLogger("loginpage");
	
	
  @Test(priority=1,enabled=true,groups={"sanity"})
  public void Login_with_valid_credential () throws Exception {
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.id("username")).sendKeys("test60684");
	    Log.info("enter username");
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.id("password")).sendKeys("Test@123");
	    Log.info("enter password");
		  
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  		  
	    driver.findElement(By.xpath(".//*[@id='loginForm']/div[6]/div[2]/button")).click();
	    Log.info("login button");
	    
	    Thread.sleep(20000);
	    
	    driver.getCurrentUrl();
			 
		Assert.assertEquals("https://portal.spark-telematics.us/dashboard",driver.getCurrentUrl() );	  
			  
		} 
  
  @Test(priority=2,enabled=true,groups={"sanity"})
  public void Login_with_invalid_credential () throws Exception {
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.id("username")).sendKeys("test60684");
	    Log.info("enter username");
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.id("password")).sendKeys("Test@1234");
	    Log.info("enter password");
		  
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  		  
	    driver.findElement(By.xpath(".//*[@id='loginForm']/div[6]/div[2]/button")).click();
	    Log.info("login button");
	    
	    Thread.sleep(3000);
	    
	    driver.getCurrentUrl();
	    
	    boolean err=driver.findElement(By.xpath(".//*[@id='loginForm']/div[7]")).isDisplayed();
	    
	    if(err==true)
	    System.out.println("error message received: "+driver.findElement(By.xpath(".//*[@id='loginForm']/div[7]")).getText());
			 
	    Thread.sleep(10000);
		Assert.assertEquals("Login",driver.getTitle());	  
			  
		} 
		 
	  @BeforeMethod
  public void beforeMethod() {
	  PropertyConfigurator.configure("Log4j.properties");
	  System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("start-maximized"); // open Browser in maximized mode
		options.addArguments("disable-infobars"); // disabling infobars
		options.addArguments("--disable-extensions"); // disabling extensions
		options.addArguments("--disable-gpu"); // applicable to windows os only
		options.addArguments("--no-sandbox"); // Bypass OS security model
		//options.addArguments("--headless");
		options.setExperimentalOption("useAutomationExtension", false);
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver=new ChromeDriver(options);
		Log.info("Open browser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://portal.spark-telematics.us/login");
		Log.info("Going to Home Page");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath(".//*[@id='root']/div/div[1]/div[1]/div/button")).click();
	    Log.info("Going to Login Page");
		  
	    
  }


  @AfterMethod
  public void afterMethod() {
	  	 driver.close();
		 Log.info("Quit from portal");
  }

}
