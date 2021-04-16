package Practise.SeleniumProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePagePOM;

public class FlightBookingPage  extends Base{
	
	
	@BeforeTest
	public void bTest() throws IOException {
		
		launchBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	@Test
	public void booking() throws IOException {

		HomePagePOM h=new HomePagePOM(driver);
		h.getFlightbtn().click();
		h.getSearchbtn().click();
		h.getSourcebtn().sendKeys("ARM"+Keys.ENTER);
		h.getDestinationbtn().sendKeys("DEL"+Keys.ENTER);
		h.getDatebtn().click();
		driver.findElement(By.xpath("//div[9]//div[1]//div[1]//div[2]//div[29]")).click();
		h.getAdultbtn().click();
		h.getChildbtn().click();
		h.getSearchbtn().click();
		
	}
	
	@AfterTest
	public void aTest() {
		driver.close();
	}


}
