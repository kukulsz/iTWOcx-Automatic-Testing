package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ClickableField;
import Utilities.LableField;

public class HomePage {
	public static WebDriver driver=Utilities.Config.driver;
	//frame location
	private static final int DEFAULT_FRAM_LOCATION=0;
	private static final String MAIN_FRAM_LOCATION="mainFrame";
	private static final String CONTENT_FRAM_LOCATION="contentFrame";
	private static final String PROJECT_BAR_FRAME_LOCATION="projectbar";
	// button element location
	private static final String NEW_DOCUMENT_BUTTON_LOCATION="//a[@title='New Document']//span[@id='img']";
	private static final String CONTACTS_BUTTON_LOCATION="//a[@title='Contacts']//span[@id='img']";
    //text element location
	private static final String WELCOME_TEXT_LOCATION="//span[@class='title' and contains(text(),'Welcome')]";
	
	// Get lableWelcomeText
	public static LableField lableWelcomeText(){
		return new LableField(driver.findElement(By.xpath(WELCOME_TEXT_LOCATION)));
	
	}
	
	// get button elements
	public static ClickableField bntNewDocument(){
		return new ClickableField(driver.findElement(By.xpath(NEW_DOCUMENT_BUTTON_LOCATION)));
	}
	

	public static ClickableField bntGoToContacts(){
		return new ClickableField(driver.findElement(By.xpath(CONTACTS_BUTTON_LOCATION)));
	}
	
	// get frames
	public static void switchToMainFrame(){
	    driver.switchTo().frame(MAIN_FRAM_LOCATION);
	    
	}
	
	public static void switchToContentFrame(){
	    driver.switchTo().frame(CONTENT_FRAM_LOCATION);
	}
	
	public static void switchToProjectBarFrame(){
		Utilities.Frame.waitForFrameandSwitchToItByName(driver, PROJECT_BAR_FRAME_LOCATION);

	}
	
	public static void switchToDefaultContent(){
	    driver.switchTo().defaultContent();
	}
	
	public static void switchToDefaultFrame(){
	    driver.switchTo().frame(DEFAULT_FRAM_LOCATION);
	}
	
	public static void waitForPageToLoad(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void waitForNewDocButtonShow(){
		Utilities.CommonMethod.waitForElementPresent(NEW_DOCUMENT_BUTTON_LOCATION);
	}
}
