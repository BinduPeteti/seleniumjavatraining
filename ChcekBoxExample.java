package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChcekBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C://Users//Bindu//Documents//Bindu Work//Software//Selenium//Driver Executables//Firefox Driver//geckoDriver//geckodriver.exe");

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();

		capabilities.setCapability("marionette", true);

		WebDriver driver = new FirefoxDriver(capabilities);
		
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		WebElement checkBox = driver.findElement(By.xpath("//label"));
		
		checkBox.click();
		
		driver.findElement(By.xpath("//label[contains(.,'Option 1')]")).click();
		driver.findElement(By.xpath("//label[contains(.,'Option 2')]")).click();
		driver.findElement(By.xpath("//label[contains(.,'Option 3')]")).click();
		driver.findElement(By.xpath("//label[contains(.,'Option 4')]")).click();

	}
}
