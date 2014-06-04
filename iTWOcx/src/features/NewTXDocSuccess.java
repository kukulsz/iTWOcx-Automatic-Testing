package features;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.Assert;

import pages.DocumentDetailPage;
import functions.CreateTransmittalDocMgr;
import functions.LoginMgr;

public class NewTXDocSuccess {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	//	Utilities.Config.closeBrowser();
	}

	@Before
	public void setUp() throws Exception {
		LoginMgr.login("rib-ss", "1234");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNewDocument() {
		int randomNuber=Utilities.CommonMethod.getRandomNumber();
		String txDocTitle="Automatically generate document title"+randomNuber;
		String uploadFileNumber="File1 number"+randomNuber;
		CreateTransmittalDocMgr.createTXDocuments(txDocTitle, uploadFileNumber);
		DocumentDetailPage.switchToDocNewInWindow();
		DocumentDetailPage.switchToReceiptRegFrame();
		Assert.assertTrue(Utilities.CommonMethod.isContentAppeared(txDocTitle));
		DocumentDetailPage.closeDocNewInWindow();
	}

}
