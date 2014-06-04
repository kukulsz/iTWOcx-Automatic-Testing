package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.ClickableField;
import Utilities.TextField;

public class SelectDocTypePopUpPage {
	
	public static WebDriver driver=Utilities.Config.driver;
	private static final String NEW_DOCUMENT_WINDOW_LOCATION="docnewwin";
	//list element location
	private static final String REGISTER_LIST_LOCATION="//li[span[a[@title='Register']]]";
	private static final String TRANSMITALLS_LIST_LOCATION="//li[span[a[@title='Transmittals']]]";
	private static final String TRANSMITALL_LINKAGE_LOCATION="//a[@title='TX: Transmittal']";
	private static final String CORRESPONDENCE_LIST_LOCATION="//li[span/a[contains(text(),'Correspondence')]]";
	private static final String CORRESPONDENCE_LINKAGE_LOCATION="//a[contains(text(),'GEN: General Correspondence')]";
	private static final String DOCTYPE_SEARCH_LOCATION = "//*[@id='tblList']//input";
	
	public static void switchToDocNewInWindow(){
		Utilities.CommonMethod.waitForPopUp(NEW_DOCUMENT_WINDOW_LOCATION);
	    driver.switchTo().window(NEW_DOCUMENT_WINDOW_LOCATION);
	}
	
	// get list elements
		public static ClickableField listRegister(){
			return new ClickableField(driver.findElement(By.xpath(REGISTER_LIST_LOCATION)));
		}
		
		public static ClickableField listTransmittals(){
			return new ClickableField(driver.findElement(By.xpath(TRANSMITALLS_LIST_LOCATION)));
		}
		
		public static ClickableField linkageTransmittal(){
			return new ClickableField(driver.findElement(By.xpath(TRANSMITALL_LINKAGE_LOCATION)));
		}
		
		public static ClickableField listCorrespondence(){
			return new ClickableField(driver.findElement(By.xpath(CORRESPONDENCE_LIST_LOCATION)));
		}
		
		
		public static ClickableField linkageCorrespondence(){
			return new ClickableField(driver.findElement(By.xpath(CORRESPONDENCE_LINKAGE_LOCATION)));
		}
		

	public static void waitForPageToLoad(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static TextField txtDocTypeSearchBox() {
		return new TextField(driver.findElement(By.xpath(DOCTYPE_SEARCH_LOCATION)));
	}
	

}
