import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Emergency {
	
	public WebDriver driver;
	public static Logger Log = Logger.getLogger("loginpage");
  
	@Test(priority = 1)
  	  public void Emergency_Contact_link_status() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  boolean emergency=driver.findElement(By.linkText("Emergency Contact")).isEnabled();
		  System.out.println("Emergency_Contact_link_status: "+emergency);
		  Log.info("Emergency Contact link status ");
		  
	
		if(emergency=true){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement ele1=driver.findElement(By.linkText("Emergency Contact"));
		  ele1.click();
		  String after=ele1.getText();
		  Assert.assertEquals(after, "Emergency Contact");
		  Log.info("click emergency ");
		  }
	}
	@Test(priority = 2)
		public void Add_Emergency_contact() throws FindFailed {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		boolean add_emg_button=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div/button")).isDisplayed();
		System.out.println("Add emergency button status: "+add_emg_button);
		
		if(add_emg_button=true){
		
		driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div/button")).click();
		//driver.findElement(By.xpath(".//*[@id='root']/div/div[2]/div/div/div[2]/ul/a[8]/div/div")).sendKeys("Manas");
		//driver.findElement(By.xpath("")).sendKeys(keysToSend);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Screen screen = new Screen();
		  Pattern image1 = new Pattern("src/main/resources/sikuli-img/Emergency contact name.png");
		  Pattern image2 = new Pattern("src/main/resources/sikuli-img/Emergency contact no.png");
		  Pattern image3 = new Pattern("src/main/resources/sikuli-img/save button.png");
		  
		  
		// using screen object we can call type  method which will accept image path and content which //we have to type and will perform action.
		 
		// This  will type on username field
		 
		screen.type(image1, "manas");
		 
		//This will type of password field
		 
		screen.type(image2, "5417543010");
		 
		// This will click on save button
		screen.click(image3);
		  
		Log.info("Add emergency contact");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement web= driver.findElement(By.xpath(".//*[@id='message-id']"));
		  String success=web.getText();
		  if(success=="Action Successful"){
			 System.out.println("Successful popup captured" );
		  }
		  Log.info("Successful popup received");
	}
	}
	
	@Test(priority = 3)
	public void Edit_Emergency_contact() throws FindFailed, Exception{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div/div[2]/div[2]/div/ul/li[1]/div[2]/button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[2]/div[2]/div[2]/div/input")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[2]/div[2]/div[2]/div/input")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[2]/div[2]/div[2]/div/input")).sendKeys("manas1");
		driver.findElement(By.xpath("html/body/div[2]/div[2]/div[3]/div[2]/button")).click();
		Log.info("Clicked save button ");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement web= driver.findElement(By.xpath(".//*[@id='message-id']"));
		  String success=web.getText();
		  if(success=="Action Successful"){
			 System.out.println("Successful popup captured" );
		  }
		  Log.info("Successful popup received");
//		Screen screen = new Screen();
//		  Pattern image5 = new Pattern("src/main/resources/sikuli-img/Edit contact name.png");
//		  Pattern image6 = new Pattern("src/main/resources/sikuli-img/Edit contact no.png");
//		  Pattern image7 = new Pattern("src/main/resources/sikuli-img/save button.png");
//		  //screen.click(image5);
//		  screen.wait(image5, 10);
//		  screen.type("a", KeyModifier.CTRL);
//		  screen.wait(image5, 10);
//		  screen.type(Key.BACKSPACE);
//		  screen.type(image5, "manas1");
	}
	
	@Test(priority = 4)
	public void delete_Emergency_contact() throws FindFailed {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Boolean deletebutton=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div/div[2]/div[2]/div/p/button")).isDisplayed();
		System.out.println(deletebutton);
		
		if(deletebutton=true){
		driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div/div[2]/div[2]/div/p/button")).click();
		Screen screen = new Screen();
		  Pattern image4 = new Pattern("src/main/resources/sikuli-img/Delete.png");
		  screen.click(image4);
		Log.info("Delete button emergency contact clicked");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement web= driver.findElement(By.xpath(".//*[@id='message-id']"));
		  String success=web.getText();
		  if(success=="Action Successful"){
			 System.out.println("Successfully deleted popup received" );
		  }
		  Log.info("Successful popup received");
		}else{
			driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div/div[2]/div[1]/div/p/button")).click();
			Screen screen = new Screen();
			  Pattern image4 = new Pattern("src/main/resources/sikuli-img/Delete.png");
			  screen.click(image4);
			Log.info("Delete button emergency contact clicked");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  WebElement web= driver.findElement(By.xpath(".//*[@id='message-id']"));
			  String success=web.getText();
			  if(success=="Action Successful"){
				 System.out.println("Successfully deleted popup received" );
			  }
			  Log.info("Successful popup received");
		}
		
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
	  
	  

  }

  @AfterClass
  public void afterClass() {
	
			 driver.close();
			 Log.info("Quit from portal");
		  }
  
}
