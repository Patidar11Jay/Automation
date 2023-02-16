package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	 private WebDriver driver;
	
	@FindBy (xpath = "//span[text()='Accounts']")
	 private WebElement Account;
	 
	 @FindBy (xpath = "//a[@href='https://www.icicibank.com/Personal-Banking/account-deposit/savings-account/insta-save-account.page?ITM=nli_cms_SA_saving_account_navigation']")
	 private WebElement SavingAccount;
	 
	 @FindBy (xpath = "(//a[@href='https://buy.icicibank.com/savings-account/product?ius=UPIC3146IC&iup=SAVR2M7EU8P&ITM=nli_CMS_SA_savingsaccount_instasaveaccountpage_banner_opencta&_gl=1*12om4ut*_ga*MTA1MDgwMjk2Ni4xNjI4MDYyMDQz*_ga_SKB78GHTFV*MTY0OTQxOTY1MC4yMS4xLjE2NDk0MjAxNDguMTM'])[1]")
	 private WebElement SvingAccount;
	 
	 @FindBy (xpath = "(//span[text()='Offers'])[1]")
	 private WebElement Offers;
	 
	 @FindBy (xpath = "//a[text()='Get assured cashback on electronics, travel, food & groceries, and much more']")
	 private WebElement CashBack;
	 
	 @FindBy (xpath = "//a[text()='Open an account Instantly']")
	 private WebElement OpenAccount;
	 
	 @FindBy (xpath = "(//span[@class='open-status'])[3]")
	 private WebElement HelpAndContact;
	 
	 @FindBy (xpath ="(//a[text()='Customer Care'])[1]")
	 private WebElement CustomerCare;
	 
	 @FindBy (xpath = "(//span[@class='open-status'])[6]")
	 private WebElement Loan;
	 
	 @FindBy (xpath = "(//a[text()='More'])[26]")
	 private WebElement OtherLoan;
	 
	 public HomePage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
		 this.driver=driver;
	 }
	 
	 public void movetoAccount() {
		 Actions act = new Actions (driver);
		 act.moveToElement(Account).perform();
	 }
	 
	 public void movetoSavingAccount() {
		 Actions act = new Actions (driver);
		 act.moveToElement(SavingAccount).perform();
	 }
	 
	 public void movetoSvingAccount() {
		 Actions act = new Actions (driver);
		 act.moveToElement(SvingAccount).click().perform();
	 }
	 
	 public void clickOpenAccount() {
		 OpenAccount.click();
	 }
	 
	 public void movetoOffers() {
		 Actions act = new Actions (driver);
		 act.moveToElement(Offers).perform();
	 }
	 public void movetoCashBack() {
		 Actions act = new Actions (driver);
		 act.moveToElement(CashBack).click().perform();
	 }
	 
	 public void movetoHelpAndSupport() {
		 Actions Act = new Actions (driver);
		 Act.moveToElement(HelpAndContact).perform();
	 }
	 
	 public void clickCustomerCar() {
		 Actions Act = new Actions (driver);
		 Act.moveToElement(CustomerCare).click().build().perform();
	 }
	 
	 public void movetoLoan() {
		 Actions act = new Actions (driver);
		 act.moveToElement(Loan).perform();
	 }
	 
	 public void clickOtherLoan() {
		 Actions act = new Actions (driver);
		 act.moveToElement(OtherLoan).click().build().perform();
	 }

	 
	 
}
