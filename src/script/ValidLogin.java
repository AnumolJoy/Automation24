package script;

import org.testng.annotations.Test;

import pom.EnterTimeTrackPage;
import pom.LoginPage;
import generic.BaseTest;
import generic.Lib;

public class ValidLogin extends BaseTest{
	@Test(priority=1)
	public void testValidLogin(){
		String un=Lib.getCellValue(XLPATH,"ValidLogin",1,0);
		String pw=Lib.getCellValue(XLPATH,"ValidLogin",1,1);
		String title=Lib.getCellValue(XLPATH,"ValidLogin",1,2);
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		l.setPassword(pw);
		l.clickLogin();
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.verifyTitle(driver,title);
	}
}


