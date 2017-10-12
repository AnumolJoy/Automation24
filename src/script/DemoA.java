package script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoA {
 static{
	 System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
 }
	public static void main(String[] args) {
	 //open the browser and enter the URL
      WebDriver driver=new ChromeDriver();  
      driver.get("http://localhost/login.do");
      //verify that Login Page is Displayed
      String eTitle="actiTIME - Login";
      String aTitle=driver.getTitle();
      if(aTitle.equals(eTitle)){
    	  System.out.println("PASS: Login Page is Displayed");
      }
      else{
    	  System.out.println("FAIL: Login Page is NOT Displayed");
      }
      //Enter valid user name, password & click login
      driver.findElement(By.id("username")).sendKeys("admin");
      driver.findElement(By.name("pwd")).sendKeys("manage");
      driver.findElement(By.xpath("//div[.='Login ']")).click();
      //verify that Home Page is Displayed
      WebDriverWait wait=new WebDriverWait(driver,10);
      try{
    	  wait.until(ExpectedConditions.titleContains("Enter"));
    	  System.out.println("PASS: Home Page is Displayed");
      }
      catch(Exception e){
    	  System.out.println("FAIL: Home Page is NOT Displayed");
      }

	}

}











