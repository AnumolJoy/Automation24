package script;

import org.testng.annotations.Test;
import pom.EnterTimeTrackPage;
import pom.LoginPage;
import generic.BaseTest;

public class VerifyProductVersion extends BaseTest{
	@Test(priority=3)
	public void testVerifyProductVersion(){
		//Enter Valid UN
		LoginPage l=new LoginPage(driver);
		l.setUserName("admin");
		//Enter valid PW
		l.setPassword("manager");
		//Click login
		l.clickLogin();
		//click help
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.clickHelp();
		//click about actiTIME
		e.clickAboutActiTIME();
		//verify version-actiTIME 2017.1
		e.verifyProductVersion("actiTIME 2017.1");
		//click close button
		e.clickClose();
		//click logout
		e.clickLogout();
	}
}


