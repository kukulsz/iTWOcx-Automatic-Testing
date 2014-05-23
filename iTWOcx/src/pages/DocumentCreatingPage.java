package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Utilities.ClickableField;
import Utilities.SelectListField;
import Utilities.TextField;

public class DocumentCreatingPage {
	public static WebDriver driver=Utilities.Config.driver;
	
	// window location
	private static final String NEW_DOCUMENT_WINDOW_LOCATION="docnewwin";
	
	// frame location
	private static final String BoxIn__FRAME_LOCATION="BoxIn";
	private static final String BoxStat__FRAME_LOCATION="BoxStat";
	private static final String DocNewNewFrame__FRAME_LOCATION="DocNewNewFrame";
	private static final String DocNewButFrame__FRAME_LOCATION="DocNewButFrame";

	// button element location
	private static final String UPLOAD_FILE_BUTTON_LOCATION="File1";
	private static final String BROWSE_FILE_UPLOAD_BUTTON_LOCATION="atch";
	private static final String SUBMIT_TX_DOCUMENT_BUTTON_LOCATION="titidMenu30";
	private static final String SUBMIT_COR_DOCUMENT_BUTTON_LOCATION="titidMenu10";
	
    //text element location
	private static final String TX_DOC_TITLE_TEXT_LOCATION="title";
	private static final String DOC_ACTION_TEXT_LOCATION="quickAttn";
	private static final String DOC_INFO_TEXT_LOCATION="quickCC";
	private static final String FILE1_NO_TEXT_LOCATION="doc1";
	private static final String FILE1_REVISION_TEXT_LOCATION="//input[@name='rev1']";
	private static final String FILE1_TITLE_TEXT_LOCATION="//input[@name='tit1']";
	private static final String FILE1_NOTE_TEXT_LOCATION="//input[@name='not1']";
	private static final String COR_DOC_TITLE_TEXT_LOCATION="tt";
	private static final String COMMON_UF_TEXT_LOCATION="USR_COM";
	
	// selector element location
	private static final String DOC_STATUS_SELECTOR_LOCATION="mStat2";
	private static final String DOC_USER_FIELD_SELCTOR_LOCATION="USR_RSN";
	
	// linkage location
	private static final String BROWSE_LISTS_LINKAGE_LOCATION="//a[contains(text(),'Browse Lists')]";

	// get clickable elements
	public static ClickableField bntSubmitTXDocument(){
		return new ClickableField(driver.findElement(By.id(SUBMIT_TX_DOCUMENT_BUTTON_LOCATION)));
	}
	
	public static ClickableField bntSubmitCorDocument(){
		return new ClickableField(driver.findElement(By.id(SUBMIT_COR_DOCUMENT_BUTTON_LOCATION)));
	}
	
	
	public static ClickableField linkageBrowseLists(){
		return new ClickableField(driver.findElement(By.xpath(BROWSE_LISTS_LINKAGE_LOCATION)));
	}
	
	public static TextField uploadFile(){
		return new TextField(driver.findElement(By.id(UPLOAD_FILE_BUTTON_LOCATION)));
	}
	
	public static TextField uploaAttachment(){
		return new TextField(driver.findElement(By.id(BROWSE_FILE_UPLOAD_BUTTON_LOCATION)));
	}
	
	// get text elements
	public static TextField txtDocAction(){
		return new TextField(driver.findElement(By.id(DOC_ACTION_TEXT_LOCATION)));
		
	}
	
	public static TextField txtDocInfo(){
		return new TextField(driver.findElement(By.id(DOC_INFO_TEXT_LOCATION)));
		
	}
	
	public static TextField txtFile1Number(){
		return new TextField(driver.findElement(By.id(FILE1_NO_TEXT_LOCATION)));
		
	}
	
	public static TextField txtFile1Revision(){
		return new TextField(driver.findElement(By.xpath(FILE1_REVISION_TEXT_LOCATION)));
		
	}
	
	public static TextField txtFile1Title(){
		return new TextField(driver.findElement(By.xpath(FILE1_TITLE_TEXT_LOCATION)));
		
	}
	
	public static TextField txtFile1Notes(){
		return new TextField(driver.findElement(By.xpath(FILE1_NOTE_TEXT_LOCATION)));
		
	}
	
	public static TextField txtTransmittalDocTitle(){
		return new TextField(driver.findElement(By.id(TX_DOC_TITLE_TEXT_LOCATION)));
		
	}
	
	public static TextField txtCorDocTitle(){
		return new TextField(driver.findElement(By.id(COR_DOC_TITLE_TEXT_LOCATION)));
		
	}
	
	public static TextField corDocCommonUserField(){
		return new TextField(driver.findElement(By.id(COMMON_UF_TEXT_LOCATION)));
		
	}
	
	// get selector elements
	public static SelectListField selectDocUserField(){
		return new SelectListField(new Select(driver.findElement(By.id(DOC_USER_FIELD_SELCTOR_LOCATION))));
		
	}
	
	public static SelectListField selectDocStatus(){
		return new SelectListField(new Select(driver.findElement(By.id(DOC_STATUS_SELECTOR_LOCATION))));		
	}
	
	public static void switchToDocNewInWindow(){
		Utilities.CommonMethod.waitForPopUp(NEW_DOCUMENT_WINDOW_LOCATION);
	    driver.switchTo().window(NEW_DOCUMENT_WINDOW_LOCATION);
	}
	
	public static void switchToBoxInFrame(){
	    driver.switchTo().frame(BoxIn__FRAME_LOCATION);
	}
	
	
	
	public static void switchToDefaultContent(){
		driver.switchTo().defaultContent();
	}
	
	public static void switchToBoxStatFrame(){
		driver.switchTo().frame(BoxStat__FRAME_LOCATION);
	}
	
	public static void switchToDocNewNewFrame(){
	    driver.switchTo().frame(DocNewNewFrame__FRAME_LOCATION);
	}
	
	public static void switchToDocNewButFrame(){
	    driver.switchTo().frame(DocNewButFrame__FRAME_LOCATION);
	}
	
}
