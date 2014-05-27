package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class Config {
	public static WebDriver driver=null;
	public static Selenium selenium=null;
	public static final String version = "cx18cpi";
	public static final String projectName = "pro18b9";
	public static String URL="http://gzweb01.projectcentre.loc/" + version + "/cx.aspx?j=" + projectName;
	public static final String UPLOAD_FILE_LOCATION="Test Data\\DOC1.jpg";

	

	public static void IEWebDriverStart(){
		// start a driver
			System.setProperty ("webdriver.ie.driver", "Res/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		// open testing URL
			driver.get(URL);
		}

	// initial a Selenium driver
	public static Selenium getSelenium(){
		return new WebDriverBackedSelenium(driver, URL);
	}
	
	public static void closeBrowser(){
		driver.close();
	}
}
