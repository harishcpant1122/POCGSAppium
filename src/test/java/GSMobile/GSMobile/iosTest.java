package GSMobile.GSMobile;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class iosTest {
	
    String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo4ODYzOTc4LCJ4cC5wIjo4ODYzOTc3LCJ4cC5tIjoxNTk0MzU3Mzk3NjAwLCJleHAiOjE5MDk3MTg3MDEsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.Vd9EglZug6pOmEloC6ykkuGHdaFPVkcz2ZOXmyQGR7s";
    //eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo4ODYzOTc4LCJ4cC5wIjo4ODYzOTc3LCJ4cC5tIjoxNTk0MzU3Mzk3NjAwLCJleHAiOjE5MDk3MTg3MDEsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.Vd9EglZug6pOmEloC6ykkuGHdaFPVkcz2ZOXmyQGR7s
    IOSDriver<IOSElement> driver = null;
    DesiredCapabilities dc = new DesiredCapabilities();
	
    @BeforeTest
    public void setUp() throws MalformedURLException {
        dc.setCapability("testName", "Quick Start iOS Native Demo");
        dc.setCapability("accessKey", accessKey);
        dc.setCapability("deviceQuery", "@os='ios' and @category='PHONE'");
        dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.experitest.ExperiBank");
        driver = new IOSDriver<>(new URL("https://cloud.seetest.io/wd/hub"), dc);
    }

    @Test
    public void quickStartiOSNativeDemo() {
        driver.rotate(ScreenOrientation.PORTRAIT);
        driver.findElement(By.xpath("//*[@id='usernameTextField']")).sendKeys("company");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//*[@id='passwordTextField']")).sendKeys("company");
        driver.findElement(By.xpath("//*[@id='loginButton']")).click();
        driver.findElement(By.xpath("//*[@id='makePaymentButton']")).click();
        driver.findElement(By.xpath("//*[@id='phoneTextField']")).sendKeys("0541234567");
        driver.findElement(By.xpath("//*[@id='nameTextField']")).sendKeys("Jon Snow");
        driver.findElement(By.xpath("//*[@id='amountTextField']")).sendKeys("50");
        driver.findElement(By.xpath("//*[@id='countryButton']")).click();
        driver.findElement(By.xpath("//*[@id='Switzerland']")).click();
        driver.findElement(By.xpath("//*[@id='sendPaymentButton']")).click();
        driver.findElement(By.xpath("//*[@id='Yes']")).click();
    }

	@AfterTest
	private void tearDown() {
        System.out.println("Report URL: "+ driver.getCapabilities().getCapability("reportUrl"));
        driver.quit();
	}
	    
}
