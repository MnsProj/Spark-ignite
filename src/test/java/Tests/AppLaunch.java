package Tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppLaunch {

	public static void main(String[] args) throws MalformedURLException {
		
		File f=new File("Apps_BU_Ignite_Intra");
		File fs=new File(f,"Apps_BU_Ignite_Intra/Beta by Crashlytics (5).apk");
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "AVD_for_Nexus_6");
		dc.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		dc.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		
	}

}
