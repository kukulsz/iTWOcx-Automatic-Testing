package Utilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class TextField {

	private WebElement element;


	public TextField(WebElement element){
	this.element=element;
	}
	public void setText(String text){
		element.sendKeys(text);
	}
	public void sendTabKey(){
		element.sendKeys(Keys.TAB);
	}
	
	public void sendKey(Keys keyCode){
		element.sendKeys(keyCode);
	}
	public void clearText(){
		element.clear();
	}
	
	}
	

