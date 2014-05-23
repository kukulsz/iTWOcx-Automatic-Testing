package pages;

import org.openqa.selenium.WebDriver;

public class DocumentDetailPage {
	public static WebDriver driver=Utilities.Config.driver;
	private static final String NEW_DOCUMENT_WINDOW_LOCATION="docnewwin";
	private static final String RECEIPT_REG_FRAME_LOCATION="ReceiptRegFrame";
	private static final String DocDetDetFrame__FRAME_LOCATION="DocDetDetFrame";
	private static final String RECEIPT_REG_FRAME_SRC_LOCATION="cx.aspx?page=dropbox/Receipt2xml&j=LERYTESTPROJECT&i=31026618&m=&e=&n=new&mdu=DBUP&p=&linkmdu=&z=41774.721305706";
	private static final String DocDetDetFrame_FRAME_SRC_LOCATION="cx.aspx?page=docs/DocDet2xml&j=LERYTESTPROJECT&mdu=COR&i=31037384&z=41778.7203054398";
	public static void switchToDocNewInWindow(){
		Utilities.CommonMethod.getCurrentTime();
		Utilities.CommonMethod.waitLongTimeForPopUp(NEW_DOCUMENT_WINDOW_LOCATION);
		Utilities.CommonMethod.getCurrentTime();
	    driver.switchTo().window(NEW_DOCUMENT_WINDOW_LOCATION);
	}
	
	public static void switchToReceiptRegFrame(){
		//Utilities.CommonMethod.waitForFrameToLoad(RECEIPT_REG_FRAME_SRC_LOCATION);
		try{
			Utilities.CommonMethod.threadWait();
		}catch(InterruptedException e){
		 e.printStackTrace();	
		}
		driver.switchTo().frame(RECEIPT_REG_FRAME_LOCATION);
	}
	
	public static void closeDocNewInWindow(){
		Utilities.CommonMethod.closeWindow(NEW_DOCUMENT_WINDOW_LOCATION);
	}
	
	public static void switchToDocDetDetFrame(){
	
		try {
			Utilities.CommonMethod.threadWait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Utilities.CommonMethod.waitForFrameToLoad(DocDetDetFrame_FRAME_SRC_LOCATION);
	    driver.switchTo().frame(DocDetDetFrame__FRAME_LOCATION);
	    
	}

}
