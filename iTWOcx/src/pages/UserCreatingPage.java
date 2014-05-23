package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Utilities.ClickableField;
import Utilities.SelectListField;
import Utilities.TextField;

public class UserCreatingPage {
	public static WebDriver driver=Utilities.Config.driver;
	private static final String USER_EMAIL_TXT_LOCATION="userEmail";
	private static final String FIRST_NAME_TXT_LOCATION="FirstName";
	private static final String LAST_NAME_TXT_LOCATION="LastName";
	private static final String USER_TYPE_SELECT_LOCATION="userType";
	private static final String USER_ROLE_SELECT_LOCATION="UserRole";
	
	private static final String ADD_USER_BUTTON_LOCATION="";
	//userEmail     UserRole Title Address  PostAddress Phone Fax  Mobile  Description
	
	public static TextField txtUserEmail(){
		return new TextField(driver.findElement(By.id(USER_EMAIL_TXT_LOCATION)));
	}

	public static TextField txtFirstName(){
		return new TextField(driver.findElement(By.id(FIRST_NAME_TXT_LOCATION)));
	}
	
	public static TextField txtLastName(){
		return new TextField(driver.findElement(By.id(LAST_NAME_TXT_LOCATION)));
		
	}
	
	public static SelectListField selectUserRole(){
		return new SelectListField(new Select(driver.findElement(By.id(USER_ROLE_SELECT_LOCATION))));
	}
	
	
	public static ClickableField bntAddUser(){
		return new ClickableField(driver.findElement(By.id(ADD_USER_BUTTON_LOCATION)));
		
	}
}
