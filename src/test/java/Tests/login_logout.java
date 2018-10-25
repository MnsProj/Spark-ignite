package Tests;

import org.testng.annotations.Test;
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

import org.sikuli.script.Key;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

 public class login_logout {
	
	public WebDriver driver;
	public static Logger Log = Logger.getLogger("loginpage");
	
  	  
  @Test(priority = 0)
  public void Login() {
			
	          PropertyConfigurator.configure("Log4j.properties");
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.findElement(By.xpath(".//*[@id='root']/div/div[1]/div[1]/div/button")).click();
			  Log.info("Going to Login Page");
			
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.findElement(By.id("username")).sendKeys("Sept29");
			  Log.info("enter username");
			
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.findElement(By.id("password")).sendKeys("Infinity@1");
			  Log.info("enter password");
			  
			  boolean loginbutton=driver.findElement(By.xpath(".//*[@id='loginForm']/div[6]/div[2]/button")).isEnabled();
			  System.out.println(loginbutton);
			  
			  if(loginbutton= true){
				 driver.findElement(By.xpath(".//*[@id='loginForm']/div[6]/div[2]/button")).click();
			  }
			  Log.info("login button");
		}
  @Test(priority = 1)
  public void Logout() {
			PropertyConfigurator.configure("Log4j.properties");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//button[@class='jss99 jss93 jss94 jss83']")).click();
			Log.info("click account button");
						
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebElement ele4=driver.findElement(By.xpath(".//*[@id='menu-listProfile']/ul/li[2]/div"));
			ele4.click();
			Log.info("click signout button");
		}
  
  @Test(priority = 2)
  public void AfterLogout_click_getstarted() {
	  
	    PropertyConfigurator.configure("Log4j.properties");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement ele3=driver.findElement(By.xpath(".//*[@id='root']/div/div[1]/div[1]/div/button"));
		ele3.click();
		String loginlink=ele3.getText();
		Log.info("Going to Login Page");
		
		Assert.assertEquals(loginlink, "https://idam.spark.harman.com/");
	  
  }

  @BeforeClass
  public void beforeClass() {
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

  @AfterClass
  public void afterClass() {
	  PropertyConfigurator.configure("Log4j.properties");
	  driver.quit();
	  Log.info("Quit from portal");
	  
  }

}
