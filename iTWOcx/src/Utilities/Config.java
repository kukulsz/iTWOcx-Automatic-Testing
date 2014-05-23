package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class Config {
	public static WebDriver driver=null;
	public static Selenium selenium=null;
	public static final String URL_18A="http://gzweb01.projectcentre.loc/cx18a/cx.aspx?j=LERYTESTPROJECT";
	public static final String UPLOAD_FILE_LOCATION="D:\\JAVA Study\\iTWOcx\\Test Data\\DOC1.jpg";

	

	public static void IEWebDriverStart(){
		// start a driver
			System.setProperty ("webdriver.ie.driver", "D:/Tools/Selenium/IEDriverServer_x64_2.41.0/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		// open testing URL
			driver.get(URL_18A);
		}

	// initial a Selenium driver
	public static Selenium getSelenium(){
		return new WebDriverBackedSelenium(driver, URL_18A);
	}
	
	public static void closeBrowser(){
		driver.close();
	}
}
