package GSMobile.GSMobile;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AndroidTest {
	
	public static AppiumDriver driver;
	  
	  @Test
	  public void setUp() throws Exception {
		  System.out.println("Program started : " );	  
		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities.setCapability("deviceName", "Galaxy Nexus1");
		  capabilities.setCapability("platformVersion", "10");
		  capabilities.setCapability("platformName", "Android");
		  capabilities.setCapability("appPackage", "io.appium.android.apis");
		  capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		  driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();    	   
		  //driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		  //driver.findElementById("android:id/checkbox").click();
		  //driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        
		  //driver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
		  //driver.findElementById("android:id/button1").click();
		  //driver.findElementsByClassName("android.widget.Button").get(2).click();
       
  	   
  	   System.out.println("connected to google chrome  " );	
	  

	  }


}
