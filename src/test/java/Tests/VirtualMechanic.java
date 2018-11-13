package Tests;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class VirtualMechanic {
	
	public WebDriver driver;
	public static Logger Log = Logger.getLogger("loginpage");
	
	@Test(priority = 1)
	  public void Virtual_Mechanic_link_status() {
		  PropertyConfigurator.configure("Log4j.properties");
		  boolean virtualmechanic=driver.findElement(By.linkText("Virtual Mechanic")).isEnabled();
		  System.out.println("Virtual_Mechanic_link_status: "+virtualmechanic);
		  Log.info("Virtual Mechanic link status ");
		  
		  driver.findElement(By.linkText("Virtual Mechanic")).click();
		  Log.info("Enter virtual Mechanic");
	}
    @Test(priority = 2)
		  public void Current_diagnostics_display() {  
		  boolean currentdaig=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div/header/div/div/div/div/button[1]")).isDisplayed();
		  System.out.println("current diagnostics displayed: "+currentdaig);
		  Log.info("Current diagnostics ");
		  }
    @Test(priority = 3)
		  public void Current_diagnostics_tab_clickable() { 	  
		  boolean currentdaig1=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div/header/div/div/div/div/button[1]")).isEnabled();
		  System.out.println("current diagnostics tab clickable: "+currentdaig1);
		  Log.info("current diagnostics tab clickable");
		  }	 
    @Test(priority = 4)
	  public void faults_and_warnings() {
		  boolean faultsandwarnings=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div/div/div/div/div[1]/ul/p")).isDisplayed();
		  System.out.println("faults and warnings: "+faultsandwarnings);
		  Log.info("faultsandwarnings");
        }	
    @Test(priority = 5)
	  public void healthy_areas() {
		  boolean healthyareas=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div/div/div/div/ul/p")).isDisplayed();
		  System.out.println("healthy areas: "+healthyareas);
		  Log.info("healthy areas");
    }
    
    @Test(priority = 6)
	  public void Battery_health_displaying() {
		  boolean Battery=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div/div/div/div/ul/div[1]/li/div/h3/div")).isDisplayed();
		  System.out.println("Battery health displaying?: "+Battery);
		  Log.info("Battery health displaying?");
    }  
    
    @Test(priority = 7)
	  public void Engine_health_displaying() {
		  boolean Engine=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div/div/div/div/ul/div[2]/li/div/h3/div")).isDisplayed();
		  System.out.println("Engine health displaying?: "+Engine);
		  Log.info("Engine health displaying?");
    }  
    @Test(priority = 8)
	  public void Electrical_System_health_displaying() {
		  boolean Electrical=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div/div/div/div/ul/div[3]/li/div/h3/div")).isDisplayed();
		  System.out.println("Electrical System health displaying?: "+Electrical);
		  Log.info("Electrical System health displaying");
    }	  
    @Test(priority = 9)
		  public void Gearbox_health_displaying() {	  
		  boolean Gearbox=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div/div/div/div/ul/div[4]/li/div/h3/div")).isDisplayed();
		  System.out.println("Gearbox health displaying?: "+Gearbox);
		  Log.info("Gearbox displaying");
    }
    @Test(priority = 10)
		  public void Auxilary_health_displaying() {	  
		  boolean Auxilary=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div/div/div/div/ul/div[4]/li")).isDisplayed();
		  System.out.println("Auxilary health displaying?: "+Auxilary);
		  Log.info("Auxilary health displaying");
    }
    @Test(priority = 11)
		  public void history_displaying() {	  		 		  
		  boolean history=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div/header/div/div/div/div/button[2]")).isDisplayed();
		  System.out.println("history display: "+history);
		  Log.info("diagnostics history");
    }
    @Test(priority = 12)
		  public void history_tab_clickable() {	  
		  boolean history2=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div/header/div/div/div/div/button[2]")).isEnabled();
		  System.out.println("history tab clickable: "+history2);
		  Log.info("history tab clickable");
    }
    @Test(priority = 13)
		  public void history_of_faults_text_displaying() {
    	  driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div/header/div/div/div/div/button[2]")).click();
    	  Log.info("Select Tab history");
    	  
		  boolean history1=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div/div/div/ul/p")).isDisplayed();
	      System.out.println("history of faults text displaying?: "+history1);
	      Log.info("history of faults text displaying");
			}
	
  @BeforeClass
  public void beforeClass() {
	  
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
	  
}
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
	  
		Log.info("Quit from portal");
  }

}
