/**
 * 
 */
package SeleniumBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.jboss.shrinkwrap.api.asset.Asset;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import junit.framework.Assert;

/**
 * @author Bindu
 *
 */
public class SeleniumInputFormExample {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.gecko.driver",
				"C://Users//Bindu//Documents//Bindu Work//Software//Selenium//Driver Executables//Firefox Driver//geckoDriver//geckodriver.exe");

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();

		capabilities.setCapability("marionette", true);

		WebDriver driver = new FirefoxDriver(capabilities);

		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

		WebElement messageText = driver.findElement(By.id("user-message"));
		
		String expectedText = "My First Selenium Test";

		messageText.sendKeys(expectedText);

		WebElement getMessageButoon = driver.findElement(By.xpath("//form/button"));

		getMessageButoon.click();

		WebElement testMessage = driver.findElement(By.id("display"));
		
		String actualText = testMessage.getText();

		System.out.println("Text Message " + actualText);

		Assert.assertEquals("Display Values are equal", expectedText, actualText);

	}

}
