package test123;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.HomePage;
import pomClasses.ResultClass;

public class Test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Automation\\chromedriver_win32\\chromedriver.exe");
		  
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://www.icicibank.com/");
		   
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   
		   HomePage homePage = new HomePage (driver);
		   /*homePage.movetoHelpAndSupport();
		   homePage.clickCustomerCar();
		   
		   ResultClass resultClass = new ResultClass (driver);
		   resultClass.clickPopUp1();
		   resultClass.clickDownloadImobile();
		   
		   ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		   driver.switchTo().window(addr.get(1));
		   
		   resultClass.clickDownloadNow();
		   
		   ArrayList<String> address = new ArrayList<String>(driver.getWindowHandles());
		   driver.switchTo().window(address.get(2));
		   
		   WebElement Downloadtext = driver.findElement(By.xpath("//h3[text()=' Download ']"));
		   
		   if(Downloadtext.isDisplayed())
		   {
			   System.out.println("Passed");
		   }
		   
		   else
		   {
			   System.out.println("Failed");
		   }*/
		   
		   homePage.movetoLoan();
		   homePage.clickOtherLoan();
		   
		   ResultClass resultClass = new ResultClass (driver);
		   resultClass.clickDreamCar();
		   
		   ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		   driver.switchTo().window(addr.get(1));
		   
		   String actualURL = driver.getCurrentUrl();
		   System.out.println(actualURL);
		   String actualTitle = driver.getTitle();
		   System.out.println(actualTitle);
				   
				   
		  //String expectedURL = "https://loan.icicibank.com/asset-portal-all/apply-now?loanType=al&ITM_nli_cms_AL_auto_loan_index_intro_bookcarbtn&WT.mc_id=Desk_OAPN_cms_cl_index_btn_applynow&_gl=1*15uc907*_ga*Mzk1NTQ3NjcyLjE2NDgwMzY3ODI.*_ga_SKB78GHTFV*MTY1NDEwNTc1My42Ny4xLjE2NTQxMDY2MjUuNjA.&_ga=2.143164979.746298045.1675148412-1420001716.1675148412";
		  String expectedtitle = "ICICI Bank";
		   
		   
		  if(actualTitle.equals(expectedtitle))
		   {
			   System.out.println("Passed");
		   }
		   else
		   {
			   System.out.println("Failed");
		   }
		   
		   
	}
		   
		   

}
