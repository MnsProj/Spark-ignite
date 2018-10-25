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

public class Trips {
	
	public WebDriver driver;
	public static Logger Log = Logger.getLogger("loginpage");
	
	
	@Test(priority = 1)
	  public void Trips_link_status() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  boolean triplink=driver.findElement(By.linkText("Trips")).isEnabled();
		  System.out.println("Trips_link_status: "+triplink);
		  Log.info("Trips link status ");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		  driver.findElement(By.linkText("Trips")).click();
		  Log.info("Enter Trips ");
		  }
	@Test(priority = 2)
	  public void Map_status() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  boolean Mapstatus=driver.findElement(By.xpath(".//div[@class='gm-style']/div[1]")).isDisplayed();
		  System.out.println("Map status: "+Mapstatus);
		  Log.info("Map status");
		  }
	@Test(priority = 3)
	  public void First_Trip_selected() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean Tripselectable=driver.findElement(By.xpath(".//*[@class='jss121 jss124 jss128 tripListItem active']")).isEnabled();
		  System.out.println("First_Trip_selected: "+Tripselectable);
		  Log.info("First_Trip_selected");
	}
    @Test(priority = 4)
		  public void Last_Trip_details() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement Tripstartpoint=driver.findElement(By.xpath(".//*[@id='tripListPadding']/div/ul/div[1]/li/div/h3/div/span[1]"));
			  System.out.println("Trip Start point: "+Tripstartpoint.getText());
			  Log.info("Trip start point");
    		  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement Tripendpoint=driver.findElement(By.xpath(".//*[@id='tripListPadding']/div/ul/div[1]/li/div/h3/div/span[3]"));
				  System.out.println("Trip End point: "+Tripendpoint.getText());
				  Log.info("Trip start point");
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	  
		    WebElement DistanceCovered=driver.findElement(By.xpath(".//*[@id='tripListPadding']/div/ul/div[1]/li/div/p/span/span[1]"));
				  System.out.println("Distance Covered: "+DistanceCovered.getText());
				  Log.info("Distance Covered");
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
  		    WebElement Timetaken=driver.findElement(By.xpath(".//*[@id='tripListPadding']/div/ul/div[1]/li/div/p/span/span[2]"));
		          System.out.println("Time taken: "+Timetaken.getText());
				  Log.info("Time taken");
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	  
   		    WebElement Lasttripdate=driver.findElement(By.xpath(".//*[@id='tripListPadding']/div/ul/div[1]/div/li"));
                  System.out.println("Last trip date: "+Lasttripdate.getText());
				  Log.info("Last trip date");	
						  
	}
    @Test(priority = 5)
	  public void Select_secondTrip() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	Boolean Seconondtrip=driver.findElement(By.xpath(".//*[@id='tripListPadding']/div/ul/div[2]/li")).isEnabled();  
    	System.out.println("Seconond Trip selectable: "+Seconondtrip);
		  Log.info("Seconond trip");
    }
    
    @Test(priority = 6)
	  public void Last_Trip_Time_Taken() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement Time_Taken=driver.findElement(By.xpath(".//*[@id='tripDetailsPadding']/div/div[2]/div[1]/div[1]/div[1]"));  
  	  	System.out.println("Last_trip_Time_Taken: "+Time_Taken.getText());
		  Log.info("Time_Taken");
  }
    @Test(priority = 7)
	  public void Last_Trip_Time_icon_display() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	Boolean Last_Trip_Time_image=driver.findElement(By.xpath(".//*[@id='tripDetailsPadding']/div/div[2]/div[1]/div[1]/img")).isDisplayed();  
	  	System.out.println("Last_Trip_Time_icon_display: "+Last_Trip_Time_image);
		  Log.info("Last_Trip_Time_icon_display");
    }
    @Test(priority = 8)
	  public void Last_trip_Distance_covered() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	WebElement Distance_covered=driver.findElement(By.xpath(".//*[@id='tripDetailsPadding']/div/div[2]/div[1]/div[2]/div[1]"));  
	  	System.out.println("Last_trip_Distance_covered: "+Distance_covered.getText());
		  Log.info("Last_trip_Distance_covered");
}
    @Test(priority = 9)
	  public void Last_trip_Distance_covered_icon() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Boolean Distance_covered_image=driver.findElement(By.xpath(".//*[@id='tripDetailsPadding']/div/div[2]/div[1]/div[2]/div[1]")).isDisplayed();  
	  	System.out.println("Distance_covered image: "+Distance_covered_image);
		  Log.info("Last_trip_Distance_covered_image");
}
    @Test(priority = 10)
	  public void Last_trip_Fuel_consumption() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement Fuel_consumption=driver.findElement(By.xpath(".//*[@id='tripDetailsPadding']/div/div[2]/div[1]/div[3]/div[1]"));  
	  	System.out.println("Last_trip_Fuel_consumption: "+Fuel_consumption.getText());
		  Log.info("Last_trip_Fuel_consumption");
}
    @Test(priority = 11)
	  public void Last_trip_Fuel_consumption_icon() throws Exception {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Boolean Fuel_consumption_image=driver.findElement(By.xpath(".//*[@id='tripDetailsPadding']/div/div[2]/div[1]/div[3]/img")).isDisplayed();  
	  	System.out.println("Last_trip_Fuel_consumption_icon_displaying: "+Fuel_consumption_image);
		  Log.info("Last_trip_Fuel_consumption_icon_dispalying");
}
    
    @Test(priority = 12)
	  public void Last_trip_Driver_score()  {
    	
			
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				WebElement driverscore=driver.findElement(By.xpath(".//*[@id='tripDetailsPadding']/div/div[2]/div[1]/div[4]/div/div[1]/div/div"));
				
				boolean drivervisible=driverscore.isDisplayed();
				
				System.out.println("Driverscore visible status: "+drivervisible);
				if(drivervisible=true)
					
					System.out.println("Last_Trip_Driver_score: "+driverscore.getText());
			
			
			
			  Log.info("Last_trip_Driver_score");
		}
			

    @Test(priority = 13)
	  public void Last_trip_hard_braking() {
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		WebElement Last_trip_hard_braking=driver.findElement(By.xpath(".//*[@id='tripDetailsPadding']/div/div[2]/div[2]/div[1]/span"));
    		Boolean hard_braking_visible=Last_trip_hard_braking.isDisplayed();
    		System.out.println("hard_braking_visible_status: "+hard_braking_visible);
    		
    		if(hard_braking_visible=true)
	  	System.out.println("Last_trip_hard_braking "+Last_trip_hard_braking.getText());
		  Log.info("Last_trip_hard_braking");
}
    @Test(priority = 14)
	  public void Last_trip_hard_corners() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		WebElement Last_trip_hard_corners=driver.findElement(By.xpath(".//*[@id='tripDetailsPadding']/div/div[2]/div[2]/div[2]/span"));
    		Boolean hard_corners_visible=Last_trip_hard_corners.isDisplayed();
    		System.out.println("hard_corners_visible: "+hard_corners_visible);
    		
    		if(hard_corners_visible=true)
	  	System.out.println("Last_trip_hard_corners "+Last_trip_hard_corners.getText());
		  Log.info("Last_trip_hard_corners");
}
    @Test(priority = 15)
	  public void Last_trip_hard_acceleration() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement Last_trip_hard_acceleration=driver.findElement(By.xpath(".//*[@id='tripDetailsPadding']/div/div[2]/div[2]/div[3]/span")); 
	Boolean hard_acceleration_visible=Last_trip_hard_acceleration.isDisplayed();
	System.out.println("hard_acceleration_visible: "+hard_acceleration_visible);
	if(hard_acceleration_visible=true)
	  	System.out.println("Last_trip_hard_corners "+Last_trip_hard_acceleration.getText());
		  Log.info("Last_trip_hard_acceleration");
}
    @Test(priority = 16)
	  public void Last_trip_Time_over_60_mph() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement Last_trip_Time_over_60_mph=driver.findElement(By.xpath(".//*[@id='tripDetailsPadding']/div/div[2]/div[2]/div[4]/span")); 
	Boolean  Last_trip_Time_over_60_mph_visible=Last_trip_Time_over_60_mph.isDisplayed();
	System.out.println("Last_trip_Time_over_60_mph_visible: "+Last_trip_Time_over_60_mph_visible);
	if(Last_trip_Time_over_60_mph_visible=true)
	  	System.out.println("Last_trip_Time_over_60_mph "+Last_trip_Time_over_60_mph.getText());
		  Log.info("Last_trip_Time_over_60_mph");
}
    @Test(priority = 17)
	  public void Last_trip_Type() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);													
    	WebElement Last_trip_Type=driver.findElement(By.xpath(".//*[@id='tripDetailsPadding']/div/div[2]/div[3]/div/form/div/div/div/div"));
	
    	String trip_type=Last_trip_Type.getText();
	  	System.out.println("Last_trip_Type "+trip_type);
		  Log.info("Last_trip_Type");
		  
		  Boolean Last_trip_Type_enabled=driver.findElement(By.xpath(".//*[@id='tripDetailsPadding']/div/div[2]/div[3]/div/form/div/div/div/div")).isEnabled();
		  System.out.println("Last_trip_Type_enabled: "+Last_trip_Type_enabled);
		  
		  if(Last_trip_Type_enabled=true){
			  
			  driver.findElement(By.xpath(".//*[@id='tripDetailsPadding']/div/div[2]/div[3]/div/form/div/div/div/div")).click();
		  } 
		  
		  
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
		//options.addArguments("--headless");
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
	 // driver.quit();
	  
		//Log.info("Quit from portal");
  }

}
