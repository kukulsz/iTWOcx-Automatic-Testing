package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Utilities.ClickableField;
import Utilities.SelectListField;
import Utilities.TextField;

public class CompanyListPage {
	public static WebDriver driver=Utilities.Config.driver;
	public static String companyName;
	//frame location
	private static final String listFrame_FRAME_LOCATION="listFrame";
	private static final String ADD_COMPANY_BUTTON_LOCATION="//a[@title='Add Company']";
	private static final String COMPANY_NAME_LINKAGE_LOCATION="//a[@target='contentFrame'][contains(text(),companyName)]";
	
	
	
	public static ClickableField bntAddCompany(){
		return new ClickableField(driver.findElement(By.xpath(ADD_COMPANY_BUTTON_LOCATION)));		
	}
	
	public static ClickableField linkageCompanyName(){
		return new ClickableField(driver.findElement(By.xpath(COMPANY_NAME_LINKAGE_LOCATION)));		
	}
	public static void switchToListFrame(){		
		driver.switchTo().frame(listFrame_FRAME_LOCATION);
	}
	
}
