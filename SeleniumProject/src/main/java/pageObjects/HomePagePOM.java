package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM {
	
	public HomePagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(@class,'text-center flights')]")
	private WebElement flightbtn;
	
	@FindBy(xpath = "/html[1]/body[1]/div[7]/div[1]/input[1]")
	private WebElement sourcebtn;

	@FindBy(xpath = "/html[1]/body[1]/div[7]/div[1]/input[1]")
	private WebElement destinationbtn;
	
	@FindBy(xpath = "//div[contains(@class,'row no-gutters row-reverse align-items-end')]//div[contains(@class,'row no-gutters')]//div[1]//div[1]//div[2]//div[1]//span[1]//button[1]")
	private WebElement adultbtn;
	
	@FindBy(xpath = "//div[@id='flights']//div[2]//div[1]//div[2]//div[1]//span[1]//button[1]")
	private WebElement childbtn;
	
	@FindBy(xpath = "//form[contains(@name,'flightmanualSearch')]//div//div//div//div//button[contains(text(),'Search')]")
	private WebElement searchbtn;
	
	@FindBy(xpath = "//input[@id='FlightsDateStart']")
	private WebElement datebtn;
	
	public WebElement getDatebtn() {
		return datebtn;
	}
	public WebElement getFlightbtn() {
		return flightbtn;
	}

	public WebElement getSourcebtn() {
		return sourcebtn;
	}

	public WebElement getDestinationbtn() {
		return destinationbtn;
	}

	public WebElement getAdultbtn() {
		return adultbtn;
	}

	public WebElement getChildbtn() {
		return childbtn;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	


}
