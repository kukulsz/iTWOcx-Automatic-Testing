package functions;

import pages.LoginPage;

public class LoginMgr {

	public static void login(String userName,String password) {
        Utilities.Config.IEWebDriverStart();
		LoginPage.switchToFrame();
		LoginPage.txtUNAME().setText(userName);
		LoginPage.txtPWD().setText(password);
		LoginPage.bntLogin().click();
	}
}
