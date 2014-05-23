package pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.ClickableField;
import Utilities.TextField;
import Utilities.LableField;

public class LoginPage {
	
	public static WebDriver driver=Utilities.Config.driver;
	private static final String USERNAME_LOCATION="nme";
	private static final String PWD_LOCATION="pwd";
	private static final String LOGIN_LOCATION="//input[@value='Login']";
	private static final String LOGIN_FAIL_MSG1_LOCATION="//div[@class='error-detail']/b";
	private static final String LOGIN_FAIL_MSG2_LOCATION="//div[@class='error-detail']/p";
	private static final int LOGIN_FRAM_LOCATION=0;
	

	// get user name field
	public static TextField txtUNAME(){
		return new TextField (driver.findElement(By.name(USERNAME_LOCATION)));
			
	}
	
	// get user password field
	public static TextField txtPWD(){
		return new TextField (driver.findElement(By.name(PWD_LOCATION)));
			
	}
	
	// get login button
	public static ClickableField bntLogin(){
		return new ClickableField(driver.findElement(By.xpath(LOGIN_LOCATION)));
	}
	
	// get login fail message
	public static LableField lableFailLoginMsg1Text(){
		return new LableField(driver.findElement(By.xpath(LOGIN_FAIL_MSG1_LOCATION)));
	}
	
	public static LableField lableFailLoginMsg2Text(){
		return new LableField(driver.findElement(By.xpath(LOGIN_FAIL_MSG2_LOCATION)));
	}
	
	
	public static void switchToFrame(){
	    driver.switchTo().frame(LOGIN_FRAM_LOCATION);
	}
	
	public static void waitForPageToLoad(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
}
