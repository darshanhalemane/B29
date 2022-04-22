package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {
public WebDriver driver;
public WebDriverWait wait;
static
{
	WebDriverManager.chromedriver().setup();
}
@BeforeMethod
public void  openApp()
{
	String url = getvalue("URL");
	String ito = getvalue("ITO");
	long i = Long.parseLong(ito);
	String eto = getvalue("ETO");
	long j = Long.parseLong(eto);
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
	wait=new WebDriverWait(driver, Duration.ofSeconds(j));
}
@AfterMethod
public void closeApp()
{
	driver.close();
}
public static String getvalue(String k)
{
	String value=" ";
	Properties p=new Properties();
	try {
		p.load(new FileInputStream("./config.properties"));
		value=p.getProperty(k);
	}
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	return value;
	
}
}
