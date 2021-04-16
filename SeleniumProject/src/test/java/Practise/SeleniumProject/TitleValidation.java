package Practise.SeleniumProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TitleValidation extends Base {
	
	@BeforeTest
	public void bTest() throws IOException {
		
		launchBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Test
	public void title() throws IOException {
		String title=driver.getTitle();
		Assert.assertEquals(title, "PHPTRAVELS | Travel Technology Partner");
		
	}
	
	@AfterTest
	public void aTest() {
		driver.close();
	}

}
