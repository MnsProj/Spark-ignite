package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class DashBoardbrokenlinks {
	
	public WebDriver driver;
	public static Logger Log = Logger.getLogger("loginpage");
  
	@Test
  	  public void Broken_link_Mainscreen() {
		  
		PropertyConfigurator.configure("Log4j.properties");

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  List<WebElement> links=driver.findElements(By.tagName("a"));
		  Log.info("list of links");
			
		  System.out.println("Total links are "+links.size());
		  System.out.println(links);
			
			for(int i=0;i<links.size();i++)
			{
				
				WebElement ele= links.get(i);
				
				String url=ele.getAttribute("href");
				
				verifyLinkActive(url);
				Log.info("verify active link");
			}
			
		}
		  
		public static void verifyLinkActive(String linkUrl)
		{
		  PropertyConfigurator.configure("Log4j.properties");
	      try 
	      {
	         URL url = new URL(linkUrl);
	         
	         HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
	         
	         httpURLConnect.setConnectTimeout(3000);
	         
	         httpURLConnect.connect();
	         
	         if(httpURLConnect.getResponseCode()==200)
	         {
	             System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
	          }
	        if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
	         {
	             System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
	          }
	      } catch (Exception e) {
	         System.out.println(e);
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
	    driver.findElement(By.id("username")).sendKeys("Sept29");
	    Log.info("enter username");
		
 	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 	    driver.findElement(By.id("password")).sendKeys("Infinity@1");
	    Log.info("enter password");
		  
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  		  
	    driver.findElement(By.xpath(".//*[@id='loginForm']/div[6]/div[2]/button")).click();
	    Log.info("login button");
  }

  @AfterClass
  public void afterClass() {
	  
	  PropertyConfigurator.configure("Log4j.properties");
		driver.quit();
		Log.info("Quit from portal");
  }
//
}
