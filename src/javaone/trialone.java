package javaone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class trialone {

	
public static void main(String[]args) throws InterruptedException   {
	
	
System.setProperty("webdriver.chrome.driver", "/Users/aymaanabdullah/selenium/1st Selenium/Driver/chromedriver");
WebDriver driver = new ChromeDriver();

driver.get("https://www.google.com");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.close();

}
}