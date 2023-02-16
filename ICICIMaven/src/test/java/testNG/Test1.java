package testNG;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomClasses.HomePage;
import pomClasses.ResultClass;

public class Test1 {
	
	private WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browserName) {
		
	 if (browserName.equals("Chrome")) {
		 System.setProperty("webdriver.chrome.driver","F:\\Automation\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	 }
		if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","F:\\Automation\\geckodriver-v0.32.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
			}
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test1() {
		 HomePage homePage = new HomePage (driver);
		   homePage.movetoAccount();
		   homePage.movetoSavingAccount();
		   homePage.movetoSvingAccount();
		   

		   
		   String ExpectedUrl = "https://buy.icicibank.com/ucj/savings/mobile";
		   String ExpectedTitle = "Insta Platform";
		   
		   String ActualUrl = driver.getCurrentUrl();
		   String ActualTitle = driver.getTitle();
		   
		   if (ExpectedUrl.equals(ExpectedUrl) && ExpectedTitle.equals(ActualTitle))
		   {
			   System.out.println("Passed");
		   }
		   else
		   {
			   System.out.println("Failed");
		   }
	}
	
	@Test
	public void test2() {
		HomePage homePage = new HomePage (driver);
		   homePage.movetoOffers();
		   homePage.movetoCashBack();
		   
		   ResultClass resultPage = new ResultClass (driver);
		   resultPage.movetoOffer();
		   resultPage.movetoGetOffer();
		   resultPage.clickFoodOffer();
		   resultPage.clickSeeFullOffer();

		   ArrayList<String> address = new ArrayList<String>(driver.getWindowHandles());
		   driver.switchTo().window(address.get(1));
		   
		   String ExpectedUrl = "https://www.icicibank.com/offers";
		   String ExpectedTitle = "Deals & Offers, Discount Coupons & Vouchers - ICICI Internet Banking";
		   
		   String ActualUrl = driver.getCurrentUrl();
		   String ActualTitle = driver.getTitle();
		   
		   if (ExpectedUrl.equals(ExpectedUrl) && ExpectedTitle.equals(ActualTitle))
		   {
			   System.out.println("Passed");
		   }
		   else
		   {
			   System.out.println("Failed");
		   }
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void afterTest() {
		
	}


}
