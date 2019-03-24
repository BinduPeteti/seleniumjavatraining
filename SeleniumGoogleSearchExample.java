/**
 * 
 */
package SeleniumBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author Bindu
 *
 */
public class SeleniumGoogleSearchExample {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		System.out.println("TEST");

		System.setProperty("webdriver.gecko.driver",
				"C://Users//Bindu//Documents//Bindu Work//Software//Selenium//Driver Executables//Firefox Driver//geckoDriver//geckodriver.exe");

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();

		capabilities.setCapability("marionette", true);

		WebDriver driver = new FirefoxDriver(capabilities);

		driver.get("https://www.google.com");

		WebElement search = driver.findElement(By.name("q"));

		search.sendKeys("Selenium");

		search.submit();
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));

	}

}
