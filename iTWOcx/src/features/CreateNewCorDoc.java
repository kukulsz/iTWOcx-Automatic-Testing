package features;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import pages.DocumentCreatingPage;
import pages.HomePage;
import pages.SelectDocTypePopUpPage;
import functions.LoginMgr;

public class CreateNewCorDoc {
	
	@Test
	public void createGenSuccessfully(){
		LoginMgr.login("RIB-SS", "1234");
		Utilities.CommonMethod.waitForPageLoad();
		HomePage.switchToProjectBarFrame();
		HomePage.bntNewDocument().click();
		SelectDocTypePopUpPage.switchToDocNewInWindow();
		SelectDocTypePopUpPage.txtDocTypeSearchBox().setText("GEN: General Correspondence");
		SelectDocTypePopUpPage.txtDocTypeSearchBox().sendKey(Keys.DOWN);
		SelectDocTypePopUpPage.txtDocTypeSearchBox().sendKey(Keys.ENTER);
		DocumentCreatingPage.switchToDocNewInWindow();
		DocumentCreatingPage.switchToDocNewNewFrame();
		DocumentCreatingPage.txtCorDocTitle().clearText();
		DocumentCreatingPage.txtCorDocTitle().setText("This is a document from Selenium");
		DocumentCreatingPage.selectDocStatus().selectVaule("OPEN");
		DocumentCreatingPage.txtDocAction().setText("RIB-SS");
		DocumentCreatingPage.txtDocInfo().setText("rib-am");
		DocumentCreatingPage.linkageBrowseLists().click();
		DocumentCreatingPage.uploaAttachment().setText(Utilities.Config.UPLOAD_FILE_LOCATION);
		DocumentCreatingPage.corDocCommonUserField().clearText();
		DocumentCreatingPage.corDocCommonUserField().setText("COMMON USER FIELD TESTING");
		DocumentCreatingPage.switchToDefaultContent();
		DocumentCreatingPage.switchToDocNewButFrame();
		DocumentCreatingPage.bntSubmitCorDocument().click();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Utilities.Config.closeBrowser();
	}

}
