package features;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pages.CompanyListPage;
import pages.HomePage;
import functions.ContactsMgr;
import functions.LoginMgr;

public class CreateCompanySuccess {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		LoginMgr.login("rib-ss","1234");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateCompany() {
		int randomNo=Utilities.CommonMethod.getRandomNumber();
		String companyName="Company Name"+randomNo;
		String companyNo="Number"+randomNo;
		String companyID="ID"+randomNo;
		Utilities.CommonMethod.waitForSixMin();
		ContactsMgr.createCompany(companyName, companyNo, companyID);
		HomePage.switchToDefaultContent();
		HomePage.switchToDefaultFrame();
		HomePage.switchToMainFrame();
		CompanyListPage.switchToListFrame();
		// verify the company have been added
		Assert.assertTrue(Utilities.CommonMethod.isContentAppeared(companyName));	
	}

}
