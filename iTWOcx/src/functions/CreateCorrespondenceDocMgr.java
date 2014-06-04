package functions;

import pages.DocumentCreatingPage;
import pages.HomePage;
import pages.SelectDocTypePopUpPage;

public class CreateCorrespondenceDocMgr {
	public static void createGENCorDocuments(String txDocTitle,String uploadFileNumber){
	Utilities.CommonMethod.waitForPageLoad();
	HomePage.switchToProjectBarFrame();
	HomePage.bntNewDocument().click();
	SelectDocTypePopUpPage.switchToDocNewInWindow();
	SelectDocTypePopUpPage.listCorrespondence().click();
	SelectDocTypePopUpPage.linkageCorrespondence().click();
	DocumentCreatingPage.switchToDocNewInWindow();
	DocumentCreatingPage.switchToDocNewNewFrame();
	DocumentCreatingPage.txtCorDocTitle().clearText();
	DocumentCreatingPage.txtCorDocTitle().setText(txDocTitle);
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

}
