package dasara;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class B {
 static{
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
 }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		A a1=new A(driver);
		a1.setValue();
		FluentWait wait=new FluentWait(driver);
		wait.withTimeout(10,TimeUnit.SECONDS);
		wait.pollingEvery(1,TimeUnit.SECONDS);
		wait.until(ExpectedConditions.titleContains("Enter"));
		
	}
}






