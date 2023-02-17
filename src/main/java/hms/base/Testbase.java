package hms.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public Testbase()
	{
		try {
			FileInputStream ipconfig=new FileInputStream("./src/main/java/hms/config/appconfig.properties");
			prop=new Properties();
			prop.load(ipconfig);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//initialization
	public static void initialization()
	
	{
		String brname=prop.getProperty("BROWSER");
		
		if(brname.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(brname.equals("firefox"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
		}else if(brname.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		//basic methods
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(90));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
		
		
		  
	}
	
	public static void waitforelement(WebElement el)
	{
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(40));
		wt.until(ExpectedConditions.visibilityOf(el));
	}
	
}