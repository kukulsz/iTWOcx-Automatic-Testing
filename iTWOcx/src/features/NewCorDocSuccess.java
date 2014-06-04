package features;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pages.DocumentDetailPage;
import functions.CreateCorrespondenceDocMgr;
import functions.LoginMgr;

public class NewCorDocSuccess {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	   Utilities.Config.closeBrowser();
	}

	@Before
	public void setUp() throws Exception {
		LoginMgr.login("rib-ss", "1234");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNewCorrespondenceDocument(){
		int randomNuber=Utilities.CommonMethod.getRandomNumber();
		String txDocTitle="Automatically generate correspondence document title"+randomNuber;
		CreateCorrespondenceDocMgr.createGENCorDocuments(txDocTitle, "");
		DocumentDetailPage.switchToDocNewInWindow();
		DocumentDetailPage.switchToDocDetDetFrame();
		Assert.assertTrue(Utilities.CommonMethod.isContentAppeared(txDocTitle));
		DocumentDetailPage.closeDocNewInWindow();
	}

}
