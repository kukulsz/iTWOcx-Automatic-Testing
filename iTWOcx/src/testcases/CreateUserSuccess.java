package testcases;

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

public class CreateUserSuccess {
	// Test data initial 
	int randomNo=Utilities.CommonMethod.getRandomNumber();
	String companyName="Company Name"+randomNo;
	String companyNo="Number"+randomNo;
	String companyID="ID"+randomNo;
	String emailAddress=randomNo+"Mailinator.com";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		LoginMgr.login("rib-ss","1234");
		CompanyListPage.companyName=companyName;
		Utilities.CommonMethod.waitForPageLoad();
		ContactsMgr.createCompany(companyName, companyNo, companyID);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateUserSuccess() {
	
		ContactsMgr.createUser(companyName, emailAddress, "auto", "name");
		Utilities.CommonMethod.waitForPageLoad();
		HomePage.switchToDefaultContent();
		HomePage.switchToDefaultFrame();
		HomePage.switchToMainFrame();
		CompanyListPage.switchToListFrame();
		Assert.assertTrue(Utilities.CommonMethod.isContentAppeared(emailAddress));
				

	}

}
