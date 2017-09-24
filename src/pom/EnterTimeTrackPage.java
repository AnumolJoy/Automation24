package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class EnterTimeTrackPage {

	@FindBy(xpath="//div[contains(text(),'Help')]")
	private WebElement help;
	
	@FindBy(linkText="About your actiTIME")
	private WebElement aboutActiTIME;
	
	@FindBy(id="aboutPopupCloseButtonId")
	private WebElement closeBTN;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath="//span[@class='productVersion']")
	private WebElement productVer;
	
	public EnterTimeTrackPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void clickHelp(){
		sleep();sleep();
		help.click();
	}
	
	public void clickAboutActiTIME(){
		sleep();
		aboutActiTIME.click();
	}
	
	public void clickClose(){
		sleep();
		closeBTN.click();
	}
	
	public void clickLogout(){
		sleep();
		logoutLink.click();
	}
	
	public void verifyProductVersion(String eVersion){
		String aVersion=productVer.getText();
		Assert.assertEquals(aVersion, eVersion);
	}
	
	public void verifyTitle(WebDriver driver,String eTitle){
		WebDriverWait wait=new WebDriverWait(driver,10);
		try{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("PASS: Home Page is Displayed",true);
		}
		catch(Exception e){
		  Reporter.log("FAIL:Home Page is Not Displayed",true);
			Assert.fail();
		}
	}
	
	public void sleep(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}










