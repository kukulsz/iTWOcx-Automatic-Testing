package features;

import org.junit.AfterClass;
import org.junit.Test;
import org.testng.Assert;

import pages.HomePage;
import functions.LoginMgr;;

public class LoginSuccessViaID {

	@Test
	public void testLoginSuccessViaID() {
		LoginMgr.login("RIB-SS", "1234");
		Utilities.CommonMethod.waitForPageLoad();
	    HomePage.switchToMainFrame();
	    HomePage.switchToContentFrame();
		Assert.assertEquals(HomePage.lableWelcomeText().getText(), "Welcome");
	}
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Utilities.Config.closeBrowser();
	}

}
