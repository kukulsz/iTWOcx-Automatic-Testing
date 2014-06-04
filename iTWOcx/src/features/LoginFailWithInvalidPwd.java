package features;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import pages.LoginPage;
import functions.LoginMgr;

public class LoginFailWithInvalidPwd {

	@Test
	public void testLoginFailWithInvalidPwd() {
		LoginMgr.login("RIB-SS", "1234456");
		Assert.assertEquals(LoginPage.lableFailLoginMsg1Text().getText(), "Login failed");
		Assert.assertEquals(LoginPage.lableFailLoginMsg2Text().getText(), "Invalid Password");		
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Utilities.Config.closeBrowser();
	}

}
