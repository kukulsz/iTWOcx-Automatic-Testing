package Utilities;

import org.openqa.selenium.WebElement;

public class ClickableField {
	WebElement element;
	
	public ClickableField(WebElement element){
		this.element=element;
		
	}
	
	public void click(){
		element.click();
	}
	
	

}
