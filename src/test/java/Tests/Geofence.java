package Tests;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Geofence {
	
	public WebDriver driver;
	public static Logger Log = Logger.getLogger("Geofencecreate");
	
	
  @Test(priority = 1,enabled=true,groups={"sanity"})
  public void Create_Geofence() throws FindFailed {
	  
	 	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Geofences")).click();
	  Log.info("select geofence");
	 	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Add Geofence")).click();
	  Log.info("Add geofence");
	  
	  	 
	  Screen screen1 = new Screen();
	  Pattern image1 = new Pattern("Image/new1 geofence name.png");
	  //screen1.wait(image);
	  screen1.click(image1);
	  screen1.type(image1, "iffco");
	  Log.info("enter geofence name");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath(".//*[@id='geofenceListPaddingCreate']/div/div[2]/button")).click();
	  Log.info("create geofence");
	  	    
	  	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement web= driver.findElement(By.xpath(".//*[@id='message-id']"));
	  String success=web.getText();
	  if(success=="Action Successful"){
		 System.out.println("Geofence successfully created" );
	 }
	 
	  Log.info("successful message");
	  
  }
  
  @Test(priority = 2,enabled=true,groups={"sanity"})
  public void Delete_Geofence() throws FindFailed, Exception{
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath(".//*[@id='geofenceListPaddingCreate']/a/ul/li")).click();
	  Log.info("Click back to geofence button");
	  
	  
	  Screen screen2 = new Screen();
	  Pattern image2 = new Pattern("Image/iffco.png");
	  screen2.click(image2);
	  Log.info("Select iffco geofence");
	  
	  Thread.sleep(20000);
	  driver.findElement(By.xpath(".//*[@id='geofenceDetailsPadding']/div/div[2]/div[1]/div[1]/div/ul/ul[3]/li/button")).click();
	  Log.info("Click delete geofence button");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement web= driver.findElement(By.xpath(".//*[@id='message-id']"));
		 String suc=web.getText();
		 if(suc=="Action Successful"){
			 System.out.println("Geofence successfully deleted" );
		 }else{
			 System.out.println("Geofence not successfully deleted" );
		 }
		 
		  Log.info("delete successful message");	  
	  }
  @Test(priority = 3,enabled=false,groups={"sanity"})
  public void Create_Geofence_by_search_location() throws FindFailed {
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Geofences")).click();
	  Log.info("select geofence");
	 	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Add Geofence")).click();
	  Log.info("Add geofence");
	  
	  
	  
  }
  
    @BeforeClass
	public void before() throws Exception{
	  	
	  PropertyConfigurator.configure("Log4j.properties");
	  System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("start-maximized"); // open Browser in maximized mode
		options.addArguments("disable-infobars"); // disabling infobars
		options.addArguments("--disable-extensions"); // disabling extensions
		options.addArguments("--disable-gpu"); // applicable to windows os only
		options.addArguments("--no-sandbox"); // Bypass OS security model
		options.setExperimentalOption("useAutomationExtension", false);
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		//options.addArguments("--headless");
		driver=new ChromeDriver(options);
		Log.info("Open browser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://portal.spark-telematics.us/login");
		Log.info("Going to Home Page");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath(".//*[@id='root']/div/div[1]/div[1]/div/button")).click();
	    Log.info("Going to Login Page");
		  
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.id("username")).sendKeys("test60684");
	    Log.info("enter username");
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.id("password")).sendKeys("Test@123");
	    Log.info("enter password");
		  
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  		  
	    driver.findElement(By.xpath(".//*[@id='loginForm']/div[6]/div[2]/button")).click();
	    Log.info("login button");
		
	    Thread.sleep(10000);
	    Assert.assertEquals("https://portal.spark-telematics.us/dashboard",driver.getCurrentUrl() );
	}
  
  @AfterClass
  public void afterClass() {
	 driver.close();
	 Log.info("Quit from portal");
}
  }
