package testcases;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import pages.LoginPage;
import functions.LoginMgr;

public class LoginFailWithEmptyNameAndPwd {

	@Test
	public void testLoginFailWithInvalidUserName() {
		LoginMgr.login("", "");
		Assert.assertEquals(LoginPage.lableFailLoginMsg1Text().getText(), "Username and Password are blank.");
		Assert.assertEquals(LoginPage.lableFailLoginMsg2Text().getText(), "You need to enter a Username and Password.");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Utilities.Config.closeBrowser();
	}

}
