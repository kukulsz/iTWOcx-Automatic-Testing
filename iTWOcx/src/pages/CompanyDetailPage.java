package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Utilities.ClickableField;
import Utilities.SelectListField;
import Utilities.TextField;

public class CompanyDetailPage {
	public static WebDriver driver=Utilities.Config.driver;
	public static String companyName;
	//frame location
	private static final String contentFrame_FRAME_LOCATION="contentFrame";
	private static final String COMPANY_NAME_TXT_LOCATION="CompanyName";
	private static final String BUSSINESS_NUMBER_TXT_LOCATION="BusinessNo";
	private static final String COMPANY_ID_TXT_LOCATION="PreferCode";
	private static final String COMPANY_ROLE_SELECT_LOCATION="role";
	private static final String SAVE_COMPANY_BUTTON_LOCATION="save";
	private static final String ADD_USER_BUTTON_LOCATION="";
		
	
	public static ClickableField bntSaveCompany(){
		return new ClickableField(driver.findElement(By.id(SAVE_COMPANY_BUTTON_LOCATION)));
		
	}
	
	public static ClickableField bntNewUser(){
		return new ClickableField(driver.findElement(By.id(ADD_USER_BUTTON_LOCATION)));
		
	}
	
	public static TextField txtCompanyName(){
		return new TextField(driver.findElement(By.id(COMPANY_NAME_TXT_LOCATION)));
		
	}
	
	public static TextField txtBussinessNumber(){
		return new TextField(driver.findElement(By.id(BUSSINESS_NUMBER_TXT_LOCATION)));
		
	}
	
	public static TextField txtCompanyID(){
		return new TextField(driver.findElement(By.id(COMPANY_ID_TXT_LOCATION)));
		
	}
	
	public static SelectListField selectCompanyRole(){
		return new SelectListField(new Select(driver.findElement(By.id(COMPANY_ROLE_SELECT_LOCATION))));
		
	}
	
	
	public static void switchToContenFrame(){
		driver.switchTo().frame(contentFrame_FRAME_LOCATION);
	}


}
