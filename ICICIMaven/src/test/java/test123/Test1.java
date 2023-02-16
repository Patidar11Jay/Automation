package test123;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pomClasses.HomePage;
import pomClasses.ResultClass;

public class Test1 {

	public static void main(String[] args) {

			//System.setProperty("webdriver.chrome.driver","F:\\Automation\\chromedriver_win32\\chromedriver.exe");
		  
		   //WebDriver driver = new ChromeDriver();
		   
		System.setProperty("webdriver.gecko.driver","F:\\Automation\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		   
		   driver.get("https://www.icicibank.com/");
		   
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   
		   HomePage homePage = new HomePage (driver);
		   /*homePage.movetoAccount();
		   homePage.movetoSavingAccount();
		   homePage.movetoSvingAccount();
		   //homePage.clickOpenAccount();
		   
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
		   }*/
		   
		   
		   homePage.movetoOffers();
		   homePage.movetoCashBack();
		   
		   ResultClass resultPage = new ResultClass (driver);
		  //resultPage.clickPopUp();
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

}
