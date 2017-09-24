package script;

import org.testng.annotations.Test;

import pom.LoginPage;
import generic.BaseTest;
import generic.Lib;

public class InvalidLogin extends BaseTest {
	@Test(priority=2)
	public void testInvalidLogin() throws InterruptedException{
		int rc=Lib.getRowcount(XLPATH, "InvalidLogin");
		for(int i=1;i<=rc;i++){
		 String un=Lib.getCellValue(XLPATH,"InvalidLogin",i,0);
		 String pw=Lib.getCellValue(XLPATH,"InvalidLogin",i,1);
		 LoginPage l=new LoginPage(driver);
		 l.setUserName(un);
		 l.setPassword(pw);
		 l.clickLogin();
		 Thread.sleep(1000);
		 l.verifyErrMsgIsDisplayed(driver);
		}
	}
}
//HOME WORK
//find out how to enter blank UN & PW from xl
//Take data from xl for Script3 

