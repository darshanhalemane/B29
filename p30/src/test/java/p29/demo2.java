package p29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo2 {
@Test
public void testA()
{
WebDriverManager.firefoxdriver().setup();
WebDriver driver=new FirefoxDriver();
driver.get("http://www.google.com");

}
}