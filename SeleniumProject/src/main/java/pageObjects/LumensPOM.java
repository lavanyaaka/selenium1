package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Practise.SeleniumProject.Base;

public class LumensPOM extends Base {

	public LumensPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='btn-group dropdown-group']")
	private WebElement Acctdrp;

	@FindBy(xpath = "//a[@class='userlogin']")
	private WebElement Loginbtn;
	
	@FindBy(xpath = "//*[@id=\"ltkpopup-close-button\"]/a")
	private WebElement closePopup;
	
	public WebElement getClosePopup() {
		return closePopup;
	}

	@FindBy(name = "dwfrm_login_username")
	private WebElement emailtxtbox;

	@FindBy(name = "dwfrm_login_password")
	private WebElement passtxtbox;
	
	@FindBy(name = "dwfrm_login_login")
	private WebElement signupbtn;
	
	@FindBy(xpath = "//a[@class='logo-link lu-sprite']")
	private WebElement goToHome;
	
	@FindBy(xpath = "//*[@id=\"nav-tab-01\"]/a")
	private WebElement lighting;
	
	@FindBy(xpath = "//*[@id=\"foo\"]/td[1]/div/div/h3/a")
	private WebElement ceilingLights;
	
	@FindBy(xpath = "//*[@id=\"main\"]/div[2]/div[2]/div[4]/div[2]/div[1]/div/div/h3/a")
	private WebElement chandeliers;
	
	@FindBy(xpath = "//*[@id=\"main\"]/div[2]/div[2]/div[4]/div[2]/div[1]/div/div/h3/a")
	private WebElement largeChandeliers;
	
	@FindBy(xpath = "//*[@id=\"refinement-LU_BestSellerScore\"]/div/ul/li[1]/a")
	private WebElement filterReadyToShip;
	
	@FindBy(xpath = "//*[@id=\"refinement-Style\"]/div/ul/li[3]/a")
	private WebElement filterColour;
	
	
	@FindBy(xpath = "//*[@id=\"5ef2cbd20edf1fffee0cca4ceb\"]/div[1]/div[4]/a")
	private WebElement selectItem;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart\"]")
	private WebElement addTocart;
	
	@FindBy(xpath = "//*[@id=\"atcModal\"]/div/div/div/div/div/div[2]/div[2]/a[1]")
	private WebElement goTocart;
	

	public WebElement getEmailtxtbox() {
		return emailtxtbox;
	}

	public WebElement getPasstxtbox() {
		return passtxtbox;
	}

	public WebElement getSignupbtn() {
		return signupbtn;
	}
	public WebElement getAcctdrp() {
		return Acctdrp;
	}

	public WebElement getLoginbtn() {
		return Loginbtn;
	}

	public WebElement getLighting() {
		return lighting;
	}

	public WebElement getCeilingLights() {
		return ceilingLights;
	}

	public WebElement getChandeliers() {
		return chandeliers;
	}

	public WebElement getLargeChandeliers() {
		return largeChandeliers;
	}

	public WebElement getFilterReadyToShip() {
		return filterReadyToShip;
	}

	public WebElement getFilterColour() {
		return filterColour;
	}

	public WebElement getSelectItem() {
		return selectItem;
	}

	public WebElement getAddTocart() {
		return addTocart;
	}

	public WebElement getGoTocart() {
		return goTocart;
	}

	public WebElement getGoToHome() {
		return goToHome;
	}

	
	


}
