package Practise.SeleniumProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownValidation extends Base{
	
	@BeforeTest
	public void bTest() throws IOException {
		
		launchBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Test
	public void cabinType()  {
		
		WebElement drp = driver.findElement(By.xpath("//select[contains(@name,'cabinclass')]"));
		Select dropdown = new Select(drp);
		boolean status = dropdown.isMultiple();
		
		if(status){
			System.out.println("Allows multiple selection");
		} else {
			System.out.println("Does not allow multiple selection");
		}
		
	}
	
	@AfterTest
	public void aTest() {
		driver.close();
	}


}
