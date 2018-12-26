package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Family_share {
	
	public WebDriver driver;
	public static Logger Log = Logger.getLogger("loginpage");
	
  @Test(priority = 1,enabled =true,groups={"sanity"})
  public void Click_family_Sharing_link() {
	  boolean family=driver.findElement(By.linkText("Family Share")).isEnabled();
	  System.out.println("Family_Share_link_status: "+family);
	  Log.info("Family Share link status ");
	  
	  if(family=true){
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		  WebElement family1=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Family Share")));
		  family1.click();
		   Log.info("Click family share link in dashboard");
		  }
  }
	  @Test(priority = 2,enabled =true,groups={"sanity"})
	  public void is_Vehicle_location_header_visible() {  
	   boolean family2=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/p")).isDisplayed();
	   System.out.println("Is vehicle details shared with any user : "+family2);
	   Log.info("Is vehicle details shared with any user ");
	   	   
	   }   
      @Test(priority = 3,enabled =true,groups={"sanity"})
      public void is_Vehicle_details_Shared_with_any_user() {
    	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	   boolean family2=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/p")).isDisplayed();
    	   if (family2=true){
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   boolean loctext1=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul[1]/li[1]/div[1]/div/h3")).isDisplayed();
		   System.out.println("My Location header visiblity: "+loctext1);
		   Log.info("My Location header visiblity ");
	       }else{
	    	   System.out.println("vehicle details not shared with any user");
      		}
      }
	   @Test(priority = 4,enabled =true,groups={"sanity"})
	   public void is_location_sharing_button_visible() { 
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   boolean family2=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/p")).isDisplayed();
    	   if (family2=true){
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   boolean locbut=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul[1]/li[1]/div[2]/span")).isDisplayed();
		   System.out.println("Enable/Disable button visibility: "+locbut);
		   Log.info(" Location sharing button visibility ");
		  }else{
	    	   System.out.println("vehicle details not shared with any user");
     		}
	   }
	   @Test(priority = 5,enabled =true,groups={"sanity"})
	   public void Enable_Disable_location_sharing_button() { 
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   boolean family2=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/p")).isDisplayed();
    	   if (family2=true){
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   boolean locbut1=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul[1]/li[1]/div[2]/span/span[1]/span[1]/input")).isEnabled();
		   
		   if(locbut1=true){
			   driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul[1]/li[1]/div[2]/span/span[1]/span[1]/input")).click();
			   System.out.println("Location button disabled");
		   }else{
			   driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul[1]/li[1]/div[2]/span/span[1]/span[1]/input")).click();
			   System.out.println("Location button enabled");
		   }
		    Log.info(" enable/disable Location sharing button");
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  WebElement web= driver.findElement(By.xpath(".//*[@id='message-id']"));
			  String success=web.getText();
			  if(success=="Action Successful"){
				 System.out.println("Successful popup captured" );
			  }
			  Log.info("Successful popup received");
		  }else{
	    	   System.out.println("vehicle details not shared with any user");
     		}
	   
	   }
	   
	   @Test(priority = 6,enabled =true,groups={"sanity"})
	   public void is_mytrips_header_visible() {  
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   boolean family2=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/p")).isDisplayed();
    	   if (family2=true){
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   boolean locbut=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul[1]/li[2]/div[1]/div/h3")).isDisplayed();
		   System.out.println("Enable/Disable button visibility: "+locbut);
		   Log.info(" My trips header visibility ");
		  }else{
	    	   System.out.println("vehicle details not shared with any user");
     		}
	   }
	   
	   @Test(priority = 7,enabled =true,groups={"sanity"})
	   public void is_mytrips_sharing_button_visible() {  
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   boolean family2=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/p")).isDisplayed();
    	   if (family2=true){
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   boolean locbut=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul[1]/li[2]/div[2]/span/span[1]/span[1]/input")).isDisplayed();
		   System.out.println("Trip Enable/Disable button visibility: "+locbut);
		   Log.info(" My trips shared button visibility ");
		  }else{
	    	   System.out.println("vehicle details not shared with any user");
     		}
	   }
	   @Test(priority = 8,enabled =true,groups={"sanity"})
	   public void Enable_Disable_trip_sharing_button() {  
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   boolean family2=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/p")).isDisplayed();
    	   if (family2=true){
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   boolean shar_btn=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul[1]/li[2]/div[2]/span/span[1]/span[1]/input")).isEnabled();
		   if(shar_btn=true){
		   driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul[1]/li[2]/div[2]/span/span[1]/span[1]/input")).click();
		   System.out.println("Sharing disabled");
		   }else{
			   driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul[1]/li[2]/div[2]/span/span[1]/span[1]/input")).click();
			   System.out.println("Sharing enabled");
		   }
		   Log.info(" Enable/disable trip sharing");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  WebElement web= driver.findElement(By.xpath(".//*[@id='message-id']"));
			  String success=web.getText();
			  if(success=="Action Successful"){
				 System.out.println("Successful popup captured" );
			  }
			  Log.info("Successful popup received");
		  }else{
	    	   System.out.println("vehicle details not shared with any user");
     		}
	   }
	   @Test(priority=9,enabled =true,groups={"sanity"})
	   public void is_Geofence_header_visible() {
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   boolean family2=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/p")).isDisplayed();
    	   if (family2=true){
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  boolean Geofence_header= driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul[2]/li[2]/div[1]/div/h3")).isDisplayed();
		   System.out.println("Geofence header visibility: "+Geofence_header);
		   Log.info(" Geofence header visibility ");
		   
	   }else{
    	   System.out.println("vehicle details not shared with any user");
  		}
	   }
	   
	   @Test(priority=10,enabled =true,groups={"sanity"})
	   public void Enable_Disable_Geofence_sharing() {
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   boolean family2=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/p")).isDisplayed();
    	   if (family2=true){
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  boolean Geofence_btn= driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul[2]/li[2]/div[2]/span/span[1]/span[1]/input")).isEnabled();
		  
		  if(Geofence_btn=true){
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul[2]/li[2]/div[2]/span/span[1]/span[1]/input")).click();
			  System.out.println("Geofence sharing disabled");
		  }else{
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul[2]/li[2]/div[2]/span/span[1]/span[1]/input")).click();
			  System.out.println("Geofence sharing disabled");
		  }
		   
		   Log.info(" Enable_Disable_Geofence sharing");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  WebElement web= driver.findElement(By.xpath(".//*[@id='message-id']"));
			  String success=web.getText();
			  if(success=="Action Successful"){
				 System.out.println("Successful popup captured" );
			  }
			  Log.info("Successful popup received");
		   
	       
	       }else{
	    	   System.out.println("vehicle details not shared with any user");
	       		}
	   }
	   
	   @Test(priority=11,enabled =true,groups={"sanity"})
	   public void is_Diagnostic_header_visible() {
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   boolean family2=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/p")).isDisplayed();
    	   if (family2=true){
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  boolean Diagnostic_hdr= driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul[3]/li[2]/div[1]/div/h3")).isDisplayed();
		  System.out.println("Diagnostic header visibility: "+Diagnostic_hdr);
		   Log.info(" Geofence header visibility ");
    	   } else{
        	   System.out.println("vehicle details not shared with any user");
     		}
		  }
	   
	   @Test(priority=12,enabled =true,groups={"sanity"})
	   public void Enable_disable_Diagnostic_sharing() {
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   boolean family2=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/p")).isDisplayed();
    	   if (family2=true){
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  boolean Diagnostic_hdr= driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul[3]/li[2]/div[2]/span/span[1]/span/input")).isEnabled();
		   
		  Assert.assertEquals(Diagnostic_hdr, false);
			  
		  }else{
       	   System.out.println("vehicle details not shared with any user");
    		}
	   }
      @BeforeClass
      public void beforeClass() throws Exception {
	  
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
	  //driver.close();
		 Log.info("Quit from portal");
	  }
  }


