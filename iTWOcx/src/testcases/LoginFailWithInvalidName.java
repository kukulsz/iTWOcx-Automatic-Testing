package testcases;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import pages.LoginPage;
import functions.LoginMgr;

public class LoginFailWithInvalidName {

	@Test
	public void testLoginFailWithInvalidUserName() {
		LoginMgr.login("RIB-SS1", "1234");
		Assert.assertEquals(LoginPage.lableFailLoginMsg1Text().getText(), "Login failed");
		Assert.assertEquals(LoginPage.lableFailLoginMsg2Text().getText(), "Invalid Username");
			}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Utilities.Config.closeBrowser();
	}

}
