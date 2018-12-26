package Tests;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginpage {
  
	public WebDriver driver;
	public static Logger Log = Logger.getLogger("loginpage");
	
	@Test(priority = 0)
  public void Entering_Login_Page() {
		PropertyConfigurator.configure("Log4j.properties");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='root']/div/div[1]/div[1]/div/button")).click();
		Log.info("Entering Login Page");
	}
	@Test(priority = 1)
  public void Harman_logo_visibility() {
		PropertyConfigurator.configure("Log4j.properties");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean harmanlogovisibility= driver.findElement(By.xpath("//img[contains(@src, 'images/logo.png')]")).isDisplayed();
		Log.info("Harman logo visibility");
		System.out.println("harmanlogo is displaying: "+harmanlogovisibility);
	}
	@Test(priority = 2)
  public void Harman_Text_visibility() {	
		PropertyConfigurator.configure("Log4j.properties");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean harmantext=driver.findElement(By.cssSelector(".container-login-text-helper>div")).isDisplayed();
		Log.info("harman text visibility");
		System.out.println("harmantext is displaying: "+harmantext);
	}
	@Test(priority = 3)
  public void Forgot_Password_link_Status() {	
		//Assert.assertEquals(loginlink,"https://idam.spark.harman.com/authenticationendpoint/login.do?client_id=cx5aA4flThp0x6wlErlEuCTumZYa&commonAuthCallerPath=%2Foauth2%2Fauthorize&forceAuth=false&grant_type=implicit&passiveAuth=false&redirect_uri=https%3A%2F%2Fconnect.spark-telematics.us%2Fcallback&response_type=token&scope=SelfManage&tenantDomain=carbon.super&sessionDataKey=d1d98738-5d92-4af1-9db6-8a8aea0fb96a&relyingParty=cx5aA4flThp0x6wlErlEuCTumZYa&type=oauth2&sp=TantalumWebPortal&isSaaSApp=false&authenticators=BasicAuthenticator:LOCAL");
		PropertyConfigurator.configure("Log4j.properties");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean forgotlink=driver.findElement(By.id("passwordRecoverLink")).isEnabled();
		Log.info("forgot link status");
		System.out.println("forgotlink is enabled: "+forgotlink);
	}
	@Test(priority = 4)
  public void Loginbutton_status_before_Enter_user_pwd() {	
		PropertyConfigurator.configure("Log4j.properties");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean loginbutton=driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).isEnabled();
		Log.info("Login button status before entered user and passward");
		System.out.println("loginbutton status before enter user details: "+loginbutton);
	}
    @Test(priority = 5)
  public void Signup_link_status() {	
    	PropertyConfigurator.configure("Log4j.properties");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean signuplink=driver.findElement(By.id("sign-up")).isEnabled();
		Log.info("signup link");
		System.out.println("signuplink is enabled: "+signuplink);
  }
	
    
	@Test(priority = 6)
  public void Login_validation() {
		PropertyConfigurator.configure("Log4j.properties");
		  try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.findElement(By.id("username")).sendKeys("test60684");
			  Log.info("enter username");
			
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.findElement(By.id("password")).sendKeys("Test@123");
			  Log.info("enter password");
			  
			  boolean loginbutton=driver.findElement(By.xpath(".//*[@id='loginForm']/div[6]/div[2]/button")).isEnabled();
			  System.out.println(loginbutton);
			  Log.info("login button status after enter credentials");
			  
			  if(loginbutton= true){
				 WebElement ele= driver.findElement(By.xpath(".//*[@id='loginForm']/div[6]/div[2]/button"));
				 ele.click();
				 String str=ele.getText();
				 System.out.println(str);
					  }
			  Log.info("login button");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		/* Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='loginForm']/div[6]/div[2]/button")).click(),"https://portal.spark-telematics.us/dashboard");
			
		  if (value=false){
		  WebElement ele=driver.findElement(By.xpath(".//*[@class='error-login']"));
			String error_message=ele.getText();
			System.out.println(error_message);
					  
		  }		*/  
	 		  
	 
		}
	
	
	@BeforeClass
	public void before(){
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
	public void after(){
		PropertyConfigurator.configure("Log4j.properties");
		//driver.close();
		Log.info("Quit from portal");
		
	}
}
