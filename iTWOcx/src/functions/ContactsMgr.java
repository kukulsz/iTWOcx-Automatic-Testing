package functions;

import pages.CompanyDetailPage;
import pages.CompanyListPage;
import pages.HomePage;
import pages.UserCreatingPage;

public class ContactsMgr {
	public static void createCompany(String companyName, String companyNo,String companyID) {
		HomePage.switchToProjectBarFrame();
		HomePage.bntGoToContacts().click();
		Utilities.CommonMethod.waitForPageLoad();
		HomePage.switchToDefaultContent();
		HomePage.switchToDefaultFrame();
		HomePage.switchToMainFrame();
		CompanyListPage.switchToListFrame();
		CompanyListPage.bntAddCompany().click();
		HomePage.switchToDefaultContent();
		HomePage.switchToDefaultFrame();
		HomePage.switchToMainFrame();
		CompanyDetailPage.switchToContenFrame();
		CompanyDetailPage.txtCompanyName().setText(companyName);
		// send Tab key to active next text field
		CompanyDetailPage.txtCompanyName().sendTabKey();
		CompanyDetailPage.txtBussinessNumber().setText(companyNo);
		CompanyDetailPage.txtCompanyID().setText(companyID);
		CompanyDetailPage.selectCompanyRole().selectVaule("CLI");
		CompanyDetailPage.bntSaveCompany().click();
		Utilities.CommonMethod.waitForPageLoad();		
	}
	
	
	public static void createUser(String companyName,String emailAddress,String firstName, String lastName){
		HomePage.switchToDefaultContent();
		HomePage.switchToDefaultFrame();
		HomePage.switchToMainFrame();
		CompanyListPage.switchToListFrame();
		CompanyListPage.linkageCompanyName();
		Utilities.CommonMethod.waitForPageLoad();
		UserCreatingPage.txtUserEmail().setText(emailAddress);
		UserCreatingPage.txtFirstName().setText(firstName);
		UserCreatingPage.txtLastName().setText(lastName);
		UserCreatingPage.selectUserRole().selectVaule("CLI");
		UserCreatingPage.bntAddUser().click();		
	}

}
