package Tests;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Vehicle_Preference {
	
	public WebDriver driver;
	public static Logger Log = Logger.getLogger("loginpage");
  
	  @Test(priority=1,enabled =true,groups={"sanity"} )
	  public void Modify_Vehicle_Nickname() {
		  boolean vehiclepref=driver.findElement(By.linkText("Vehicle Preferences")).isEnabled();
		  System.out.println("Vehicle_Preferences_link_status: "+vehiclepref);
		  Log.info("Vehicle Preferences link status ");
		  
		  if(vehiclepref=true){
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.findElement(By.xpath(".//*[@id='root']/div/div[2]/div/div/div[2]/ul/a[7]/div/div")).click();
		  }
		  	  
		    WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement nickedit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[2]/div/ul/li[1]/div[2]/button")));
			nickedit.click();
		 
		  Log.info("nick edit button clicked ");
		  
		    
		  WebElement enter=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//input[@value='camaro']")));
		  enter.click();
		  enter.sendKeys(Keys.CONTROL + "a");
		  enter.sendKeys(Keys.DELETE);
		  enter.sendKeys("camaro1");
			
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("html/body/div[2]/div[2]/div[3]/div[2]/button")).click();
			Log.info("clicked save button");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  WebElement web= driver.findElement(By.xpath(".//*[@id='message-id']"));
			  String success=web.getText();
			  if(success=="Action Successful"){
				 System.out.println("Successful popup captured" );
			  }
			  Log.info("Successful popup received");
			  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.findElement(By.xpath(".//*[@id='root']/div/div[2]/div/div/div[2]/ul/a[7]/div/div")).click();
			  WebElement nickedit1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[2]/div/ul/li[1]/div[2]/button")));
				nickedit1.click();
			 
			  Log.info("nick edit button clicked ");
			  
			  WebElement enter1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//input[@value='camaro1']")));
			  enter1.click();
			  enter1.sendKeys(Keys.CONTROL + "a");
			  enter1.sendKeys(Keys.DELETE);
			  enter1.sendKeys("camaro");
								
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath("html/body/div[2]/div[2]/div[3]/div[2]/button")).click();
				Log.info("clicked save button");
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  WebElement web1= driver.findElement(By.xpath(".//*[@id='message-id']"));
				  String success1=web1.getText();
				  if(success1=="Action Successful"){
					 System.out.println("Successful popup captured" );
				  }
				  Log.info("Successful popup received");
		  }
	  
	  @Test(priority=2,enabled =true,groups={"sanity"} )
	  public void Modify_Vehicle_Color() {
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath(".//*[@id='root']/div/div[2]/div/div/div[2]/ul/a[7]/div/div")).click();
		 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  Boolean el=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[2]/div/ul/li[2]/div[2]/button")).isDisplayed();
		  String stg=el.toString();
		  System.out.println("color edit button isenabled? " +stg);
		  if(el==true){
			  
			  WebElement curcolor=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[2]/div/ul/li[2]/div[1]/div/p/span"));
			  if(curcolor.getText()=="green"){
				  WebDriverWait wait = new WebDriverWait(driver, 10);
				  WebElement nickedit1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[2]/div/ul/li[2]/div[2]/button")));
					nickedit1.click();
					Log.info("Click color edit button ");
					
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElement(By.xpath("html/body/div[2]/div[2]/div[2]/ul/div[2]")).click();
					Log.info("Select color Blue");
					
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					  WebElement web1= driver.findElement(By.xpath(".//*[@id='message-id']"));
					  String success1=web1.getText();
					  if(success1=="Action Successful"){
						 System.out.println("Successful popup captured" );
					  }
					  Log.info("Successful popup received");
					
			  }else{
				  WebDriverWait wait1 = new WebDriverWait(driver, 10);
				  WebElement nickedit2 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[2]/div/ul/li[2]/div[2]/button")));
					nickedit2.click();
					Log.info("Click color edit button ");
					
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  driver.findElement(By.xpath("html/body/div[2]/div[2]/div[2]/ul/div[4]")).click();
				  Log.info("Select color Green");
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  WebElement web1= driver.findElement(By.xpath(".//*[@id='message-id']"));
				  String success1=web1.getText();
				  if(success1=="Action Successful"){
					 System.out.println("Successful popup captured" );
				  }
				  Log.info("Successful popup received");
			  }
					  
			
	  }else{
	    	 System.out.println("Vehicle color change button not enabled");
	     }
	     }
	  
	  @Test(priority=3,enabled =true,groups={"sanity"} )
	  public void Modify_License_Plate() {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath(".//*[@id='root']/div/div[2]/div/div/div[2]/ul/a[7]/div/div")).click();
		  
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		  WebElement Licpedit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//button[@class='jss99 jss93'])[3]")));
		  boolean Licpeditisenabled=Licpedit.isDisplayed();
		  System.out.println("Licpeditisenabled");
		  Log.info("Modify_License_Plate isenabled");
		  if(Licpeditisenabled==true){
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("(.//button[@class='jss99 jss93'])[3]")).click();
		  Log.info("click_Modify_License_Plate_edit_button");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[contains(@value, 'lic')]")).click();
		  Log.info("Select license no");
		  //driver.findElement(By.xpath(".//input[@class='jss339 jss340']")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[contains(@value, 'lic')]")).clear();
		  Log.info("Clear license no");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[contains(@value, 'lic')]")).sendKeys("2lic");
		  Log.info("enter new license no");
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("html/body/div[2]/div[2]/div[3]/div[2]/button")).click();;
		  Log.info("Clicked save button");
		  
		    
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement web1= driver.findElement(By.xpath(".//*[@id='message-id']"));
		  String success1=web1.getText();
		  if(success1=="Action Successful"){
			 System.out.println("Successful popup captured" );
		  }
		  Log.info("Successful popup received");
		  
		  }else{
			  System.out.println("Modify_License_Plate_Edit button not enabled");
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
