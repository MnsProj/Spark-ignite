package Tests;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;

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
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;

 public class login_logout {
	
	public WebDriver driver;
	public static Logger Log = Logger.getLogger("loginpage");
	
  	  
  @Test(priority = 1,enabled=true,groups={"sanity"})
  public void Login() throws Exception {
			
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
			  
			  Thread.sleep(10000);
			  
			  Assert.assertEquals("https://portal.spark-telematics.us/dashboard",driver.getCurrentUrl() );
		}
  @Test(priority = 2,enabled=true,groups={"sanity"})
  public void Logout() throws Exception {
			
			/*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//button[@class='jss99 jss93 jss94 jss83']")).click();
			Log.info("click account button");
			Thread.sleep(10000);
			
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement ele4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='menu-listProfile']/ul/li[2]/div")));
			//WebElement ele4=driver.findElement(By.xpath(".//*[@id='menu-listProfile']/ul/li[2]/div"));
			ele4.click();
			Log.info("click signout button");
			
			Thread.sleep(10000);*/
	  
	  Screen screen = new Screen();
	  Pattern image = new Pattern("Image/account-btn.png");
	  Pattern image1 = new Pattern("Image/signout.png");
	  screen.click(image);
	  Log.info("click account button");
	  //screen.wait(10000);
	  screen.click(image1);
	  Log.info("click logout button");
	  //screen.wait(5000);
	  Thread.sleep(10000);
			
			Assert.assertEquals("Harman Spark",driver.getTitle());
		}
  
  @Test(priority = 3,enabled=true,groups={"sanity"})
  public void AfterLogout_click_getstarted() throws Exception {
	  
	   /* PropertyConfigurator.configure("Log4j.properties");
	    WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement ele3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='root']/div/div[1]/div[1]/div/button")));
		//WebElement ele3=driver.findElement(By.xpath(".//*[@id='root']/div/div[1]/div[1]/div/button"));
		ele3.click();
		System.out.println(ele3.getText());
		Log.info("Going to Login Page");*/
	  Screen screen1 = new Screen();
	  Pattern image3 = new Pattern("Image/GetStarted.png");
	  screen1.click(image3);
	  Thread.sleep(10000);
	  Assert.assertEquals("Login",driver.getTitle());
		
	  
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
	options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
	options.setExperimentalOption("useAutomationExtension", false);
	//options.addArguments("--headless");
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
	  driver.close();
	  Log.info("Quit from portal");
	  
  }

}
