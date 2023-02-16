package pomClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultClass {
	
	private WebDriver driver;
	
	@FindBy (xpath = "//button[@class='button']")
	private WebElement PopUp;
	
	@FindBy (xpath = "(//span[text()='Offers'])[1]")
	private WebElement Offer;
	
	@FindBy (xpath = "//a[text()='Attractive offers on Shopping, Travel & Dining categories']")
	private WebElement GetOffer;
	
	@FindBy (xpath = "//span[text()='Online Food Delivery ']")
	private WebElement FoodOffer;
	
	@FindBy (xpath = "(//a[text()='View Popular offers'])[2]")
	private WebElement SeeFullOffer;
	
	@FindBy (xpath = "(//div[@class='modal-close'])[1]")
	private WebElement PopUp1;
	
	@FindBy (xpath = "//a[text()='How to download iMobile']")
	private WebElement DownloadImobile;
	
	@FindBy (xpath = "//a[@id='getCallBackPopup']")
	private WebElement DownloadNow;
	
	@FindBy (xpath = "//h3[text()=' Download ']")
	private WebElement Downloadtext;
	
	@FindBy (xpath = "(//a[text()='BOOK YOUR DREAM CAR'])[1]")
	private WebElement DreamCar;
	
	@FindBy (xpath = "//button[text()='New Customer']")
	private WebElement NewCustomer;

	
	
	public ResultClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickPopUp() {
		Actions act = new Actions (driver);
	 act.moveToElement(PopUp).click().perform();
	}
	
	public void movetoOffer() {
		Actions act = new Actions (driver);
		act.moveToElement(Offer).click().perform();
		
	}
	
	public void movetoGetOffer() {
		Actions act = new Actions (driver);
		act.moveToElement(GetOffer).click().perform();
		
	}
	
	public void clickFoodOffer() {
		FoodOffer.click();
	}
	
	public void clickSeeFullOffer() {
		SeeFullOffer.click();
	}
	
	public void clickPopUp1() {
		PopUp1.click();
	}
	
	public void clickDownloadImobile() {
		DownloadImobile.click();
	}
	
	public void clickDownloadNow() {
		DownloadNow.click();
	}
	
	public void clickDreamCar() {
		DreamCar.click();
	}

}
