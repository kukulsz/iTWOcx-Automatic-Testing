package features;

import org.junit.AfterClass;
import org.junit.Test;
import org.testng.Assert;

import pages.HomePage;
import pages.LoginPage;

public class Login {
	
	@Test
	public void loginSuccessfullyViaID() {
		Utilities.Config.IEWebDriverStart();
		LoginPage.switchToFrame();
		LoginPage.txtUNAME().setText("RIB-SS");
		LoginPage.txtPWD().setText("1234");
		LoginPage.bntLogin().click();
		Utilities.CommonMethod.waitForSixMin();
		HomePage.switchToMainFrame();
		HomePage.switchToContentFrame();
		Assert.assertEquals(HomePage.lableWelcomeText().getText(), "Welcome");
	}
	//TODO
	@Test
	public void loginSuccessfullyViaEmail(){}
	
	//TODO
	@Test
	public void loginFailwithEmptyName(){}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Utilities.Config.closeBrowser();
	}
}
