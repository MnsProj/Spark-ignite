package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class HomeScreen {
	public WebDriver driver;
	public static Logger Log = Logger.getLogger("loginpage");
	
  @Test(priority = 0)
  public void Harmanlogo_Display_Mainscreen() {
	  PropertyConfigurator.configure("Log4j.properties");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Boolean harmanlogo=driver.findElement(By.xpath(".//*[@id='root']/div/div[2]/div/div/div[1]/a/div/img")).isDisplayed();
	  System.out.println("Harmanlogo_Display_Mainscreen: "+harmanlogo);
	  Log.info("Harmanlogo display in main screen");
  }
  @Test(priority = 1)
  public void Vehicle_dashboard_link_status() {
	  boolean dashboard=driver.findElement(By.linkText("Vehicle Dashboard")).isEnabled();
	  System.out.println("Vehicle_dashboard_link_status: "+dashboard);
	  Log.info("Vehicle dashboard link status ");
	  }
  @Test(priority = 2)
  public void Virtual_Mechanic_link_status() {
	  boolean virtualmechanic=driver.findElement(By.linkText("Virtual Mechanic")).isEnabled();
	  System.out.println("Virtual_Mechanic_link_status: "+virtualmechanic);
	  Log.info("Virtual Mechanic link status ");
	  }
  
  @Test(priority = 3)
  public void Accident_Reports_link_status() {
	  boolean accident=driver.findElement(By.linkText("Accident Reports")).isEnabled();
	  System.out.println("Accident_Reports_link_status: "+accident);
	  Log.info("Accident reports link status ");
	  }
  
  @Test(priority = 4)
  public void Trips_link_status() {
	  boolean triplink=driver.findElement(By.linkText("Trips")).isEnabled();
	  System.out.println("Trips_link_status: "+triplink);
	  Log.info("Trips link status ");
	  }
  
  @Test(priority = 5)
  public void Family_Share_link_status() {
	  boolean family=driver.findElement(By.linkText("Family Share")).isEnabled();
	  System.out.println("Family_Share_link_status: "+family);
	  Log.info("Family Share link status ");
	  }
  
  @Test(priority = 6)
  public void Geofences_link_status() {
	  boolean geofencelink=driver.findElement(By.linkText("Geofences")).isEnabled();
	  System.out.println("Geofences_link_status: "+geofencelink);
	  Log.info("Geofences link status ");
	  }
  
  @Test(priority = 7)
  public void Vehicle_Preferences_link_status() {
	  boolean vehiclepref=driver.findElement(By.linkText("Vehicle Preferences")).isEnabled();
	  System.out.println("Vehicle_Preferences_link_status: "+vehiclepref);
	  Log.info("Vehicle Preferences link status ");
	  }
  @Test(priority = 8)
  public void Emergency_Contact_link_status() {
	  boolean emergency=driver.findElement(By.linkText("Emergency Contact")).isEnabled();
	  System.out.println("Emergency_Contact_link_status: "+emergency);
	  Log.info("Emergency Contact link status ");
	  }
  @Test(priority = 9)
  public void Account_link_status() {
	  boolean Account=driver.findElement(By.xpath(".//button[@class='jss99 jss93 jss94 jss83']")).isEnabled();
	  System.out.println("Account_link_status: "+Account);
	  Log.info("Account link status ");
	  }
  @Test(priority = 10)
  public void wifi_button_display() {
	  boolean wifi=driver.findElement(By.xpath(".//div[@class='jss121 jss124 jss128 jss130']")).isDisplayed();
	  System.out.println("wifi_button_display: "+wifi);
	  Log.info("wifi button display status ");
	  
	 /* WebElement Wifi1=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[1]/div/ul/li[2]/div/h3"));
	  
	  System.out.println("wifi status: "+Wifi1.getText());*/
	  //Log.info("wifi status ");
	  }
  @Test(priority = 11)
  public void battery_status() {
	  
	  WebElement battery1=driver.findElement(By.xpath(".//*[@class='StatusWidgetWrapper']"));
	  System.out.println("Battery status: "+battery1.getText());
	  Log.info("battery_status_print ");
	  }
  @Test(priority = 12)
  public void Virtualmechanic_Mainscreen() {
	  
	  Boolean Virtualmechaniclink=driver.findElement(By.xpath(".//*[@class='blueText'][@href='/vehicle-health']")).isEnabled();
	  System.out.println("Virtualmechaniclink: "+Virtualmechaniclink);
	  Log.info("Virtualmechaniclink_mainscreen ");
	  }
  
  @Test(priority = 13)
  public void Last_trip_Mainscreen() {
	  
	  String startpoint=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[3]/div[2]/div/div[2]/div/div[2]/div/ul/li/div/h3/div/span[1]")).getText();
	  System.out.println("start point: "+startpoint);
	  Log.info("start point");
	  
	  String endpoint=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[3]/div[2]/div/div[2]/div/div[2]/div/ul/li/div/h3/div/span[2]")).getText();
	  System.out.println("end point: "+endpoint);
	  Log.info("end point");
	  
	  String distance=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[3]/div[2]/div/div[2]/div/div[2]/div/ul/li/div/p/span/span[1]")).getText();
	  System.out.println("distance: "+distance);
	  Log.info("distance");
	  
	  String timetaken=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[3]/div[2]/div/div[2]/div/div[2]/div/ul/li/div/p/span/span[2]")).getText();
	  System.out.println("timetaken: "+timetaken);
	  Log.info("timetaken");
	  }
  
  @Test(priority = 14)
  public void Triphistorylink_Mainscreen() {
	  
	  Boolean Triphistorylink=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[3]/div[2]/div/div[2]/div/a")).isEnabled();
	  System.out.println("Triphistorylink: "+Triphistorylink);
	  Log.info("Triphistorylink_Mainscreen");
	  
	  }
  @Test(priority = 15)
  public void Manage_Familysharinglink_Mainscreen() {
	  
	  Boolean Manage_Familysharinglink=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[3]/div[2]/div/div[3]/div/a")).isEnabled();
	  System.out.println("Manage_Familysharinglink: "+Manage_Familysharinglink);
	  Log.info("Manage_Familysharinglink_Mainscreen");
	  
	  }
  
  @Test(priority = 16)
  public void Geofencelink_Mainscreen() {
	  
	  Boolean Geofencelink=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[3]/div[2]/div/div[3]/div/a")).isEnabled();
	  System.out.println("Geofencelink: "+Geofencelink);
	  Log.info("Geofencelink_Mainscreen");
	  
	  }
  @Test(priority = 17)
  public void Harmanspark_Version_Mainscreen() {
	  
	  String Sparkversion=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/footer/div/p/span")).getText();
	  System.out.println(Sparkversion);
	  Log.info("Harmanspark_Version");
	  
	  }
  @Test(priority = 18)
  public void Map_display_status() {
	  boolean map=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div[3]")).isDisplayed();
	  System.out.println("Map_display: "+map);
	  Log.info("Map display status ");
 	  }
  @Test(priority = 19)
  public void Vehicle_name() {
	  WebElement vehiclename=driver.findElement(By.xpath(".//*[@id='root']/div/div[3]/div[1]/div/div[1]/button"));
	  System.out.println("Vehicle_name: "+vehiclename.getText());
	  Log.info("Vehicle_name");
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
  public void afterClass() throws IOException {
	        driver.quit();
	        //Runtime.getRuntime().exec("taskkill /im chromedriver.exe /f");
			Log.info("Quit from portal");
  }

}
