/**
 * 
 */
package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import junit.framework.Assert;

/**
 * @author Bindu
 *
 */
public class SeleniumFindSumOf2Elelments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C://Users//Bindu//Documents//Bindu Work//Software//Selenium//Driver Executables//Firefox Driver//geckoDriver//geckodriver.exe");

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();

		capabilities.setCapability("marionette", true);

		WebDriver driver = new FirefoxDriver(capabilities);

		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		WebElement sum1TextBox = driver.findElement(By.id("sum1"));
		
		sum1TextBox.sendKeys("143");
		
		WebElement sum2Textbox = driver.findElement(By.id("sum2"));
		
		sum2Textbox.sendKeys("156");
		
		WebElement getTotalButton = driver.findElement(By.xpath("//form[@id='gettotal']/button"));

		getTotalButton.click();
		
		WebElement displaySum = driver.findElement(By.id("displayvalue"));
		
		String actualText = displaySum.getText();

		System.out.println("Text Message " + actualText);

		Assert.assertEquals("Display Values are equal", "299", actualText);


	}

}
