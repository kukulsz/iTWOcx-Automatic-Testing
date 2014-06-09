package functions;

import pages.DocumentCreatingPage;
import pages.HomePage;
import pages.SelectDocTypePopUpPage;

public class CreateTransmittalDocMgr {
	public static void createTXDocuments(String txDocTitle,String uploadFileNumber){
	Utilities.CommonMethod.waitForSixMin();
	HomePage.switchToProjectBarFrame();
	HomePage.bntNewDocument().click();
	SelectDocTypePopUpPage.switchToDocNewInWindow();
	SelectDocTypePopUpPage.listRegister().click();
	SelectDocTypePopUpPage.listTransmittals().click();
	SelectDocTypePopUpPage.linkageTransmittal().click();
	DocumentCreatingPage.switchToDocNewInWindow();
	DocumentCreatingPage.switchToBoxInFrame();
	DocumentCreatingPage.txtTransmittalDocTitle().clearText();
	DocumentCreatingPage.txtTransmittalDocTitle().setText(txDocTitle);
	DocumentCreatingPage.selectDocStatus().selectVaule("INITIATED");
	DocumentCreatingPage.txtDocAction().setText("RIB-AM");
	DocumentCreatingPage.txtDocInfo().setText("rib-rl");
	DocumentCreatingPage.selectDocUserField().selectVaule("APP");
	DocumentCreatingPage.uploadFile().setText(Utilities.Config.UPLOAD_FILE_LOCATION);
	DocumentCreatingPage.txtFile1Number().setText(uploadFileNumber);
	DocumentCreatingPage.txtFile1Revision().setText("version: 1.1.0");
	DocumentCreatingPage.txtFile1Title().setText("File1 title");
	DocumentCreatingPage.txtFile1Notes().setText("Fitle notes");
	DocumentCreatingPage.switchToDefaultContent();
	DocumentCreatingPage.switchToBoxStatFrame();
	DocumentCreatingPage.bntSubmitTXDocument().click();
	}

}
