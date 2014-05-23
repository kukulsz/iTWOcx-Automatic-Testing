package Utilities;

import org.openqa.selenium.support.ui.Select;

public class SelectListField {
	Select select;
	
	public SelectListField(Select select){
		this.select=select;
	}
	
	public void selectVaule(String value){
		select.selectByValue(value);
		
	}

}
