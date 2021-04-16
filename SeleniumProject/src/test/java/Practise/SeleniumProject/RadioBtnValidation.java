package Practise.SeleniumProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioBtnValidation extends Base {

	@BeforeTest
	public void bTest() throws IOException {
		
		launchBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Test
	public void radioBtn()  {
		
		boolean status = driver.findElement(By.xpath("//label[contains(text(),'Round Trip')]")).isSelected();
		
		if(status){
			System.out.println("Round Trip Checkbox is checked");
		} else {
			System.out.println("Round Trip Checkbox is unchecked");
		}
		
	}
	
	@Test
	public void radioBtn1()  {
		
		boolean status = driver.findElement(By.xpath("//label[contains(text(),'One Way')]")).isSelected();
		
		if(status){
			System.out.println("One Way Checkbox is checked");
		} else {
			System.out.println("One Way Checkbox is unchecked");
		}
		
	}
	
	@AfterTest
	public void aTest() {
		driver.close();
	}


}
