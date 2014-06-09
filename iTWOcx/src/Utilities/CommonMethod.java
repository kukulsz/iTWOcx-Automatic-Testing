package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonMethod {
	public static String elementLocation;
	public static WebDriver driver=Utilities.Config.driver;
	
	public static boolean isContentAppeared(String content) {
		boolean status = false;
		try {
			driver.findElement(By.xpath("//*[contains(.,'" + content + "')]"));
			System.out.println(content + " is appeard!");
			status = true;
		} catch (NoSuchElementException e) {
			status = false;
			System.out.println("'" + content + "' doesn't exist!");
		}
		return status;
	}

	
	public static void waitForElementPresent(final String location){
		WebDriverWait wait=new WebDriverWait(Utilities.Config.driver, 60);
		wait.until(new ExpectedCondition<WebElement>(){
			public WebElement apply(WebDriver driver){
				return driver.findElement(By.xpath(location));				
			}
		}
		);
	}
	
	
	public static void waitForSixMin(){
		Utilities.Config.getSelenium().waitForPageToLoad("60000");
	}
	
	public static void waitForPopUp(String windID){
		Utilities.Config.getSelenium().waitForPopUp(windID,"60000");
	}
	
	public static void waitLongTimeForPopUp(String windID){
		Utilities.Config.getSelenium().waitForPopUp(windID,"1200000");
	}
	
	public static void waitForFrameToLoad(String frameSrc){
		Utilities.Config.getSelenium().waitForFrameToLoad(frameSrc, "200000");
		
	}

	public static int getRandomNumber(){
		int randomNo=(int)(Math.random()*1000);
		return randomNo;		
	}
	
	public static void getCurrentTime(){
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(new Date()));	
	}
	
	public static void main(String[] args){
		System.out.println(getRandomNumber());
		getCurrentTime();
	}
	
	public static void closeWindow(String windowID){
		driver.switchTo().window(windowID).close();
		
	}
	
	public static void threadWait() throws InterruptedException{
		Thread.sleep(60000);
	}
	
}

