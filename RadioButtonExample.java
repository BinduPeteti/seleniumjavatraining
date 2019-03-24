/**
 * 
 */
package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author Bindu
 *
 */
public class RadioButtonExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C://Users//Bindu//Documents//Bindu Work//Software//Selenium//Driver Executables//Firefox Driver//geckoDriver//geckodriver.exe");

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();

		capabilities.setCapability("marionette", true);

		WebDriver driver = new FirefoxDriver(capabilities);
		
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		
		WebElement radioButtonGender = driver.findElement(By.xpath("//label"));
		
		radioButtonGender.click();
		
		WebElement checkButton = driver.findElement(By.id("buttoncheck"));
		
		checkButton.click();
	}

}
