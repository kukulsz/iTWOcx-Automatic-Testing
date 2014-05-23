package Utilities;

import org.openqa.selenium.WebElement;

public class LableField {
	WebElement element;
	
	public LableField(WebElement element){
		this.element=element;
		
	}
	
	public String getText(){
		return element.getText();
		
	}

}
