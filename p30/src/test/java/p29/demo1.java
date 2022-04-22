package p29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1 {
@Test
public void testA()
{
	WebDriverManager.chromedriver().setup();
	//WebDriverManager.chromedriver().browserVersion("97").setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
}
}
