package Factory;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class BaseClass {
		 
		public static WebDriver driver;
		static Properties p;
		 
			
			public  static WebDriver initializeBrowser() throws IOException
			{
				 
					switch(getProperties().getProperty("browser").toLowerCase()) 
					{
					case "chrome":
				        driver=new ChromeDriver();
				        break;
				    case "edge":
				    	driver=new EdgeDriver();
				        break;
				    case "firefox": 
				    	driver=new FirefoxDriver();
				    	break;
				    default:
				        System.out.println("No matching browser");
				        driver=null;
					}
				
				// driver.manage().deleteAllCookies(); 
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
				 return driver; 
			}
			public static WebDriver getDriver() {
				return driver;
			}
		 
		public static Properties getProperties() throws IOException
		{		 
		    FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		    p=new Properties();
			p.load(file);
			return p;
		}
	
}