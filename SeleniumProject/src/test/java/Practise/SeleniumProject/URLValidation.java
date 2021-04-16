package Practise.SeleniumProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class URLValidation extends Base{
	
	@BeforeTest
	public void bTest() throws IOException {
		
		launchBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Test
	public void url()  {
		String title=driver.getCurrentUrl();
		Assert.assertEquals(title, "https://www.phptravels.net/home");
		
	}
	
	@AfterTest
	public void aTest() {
		driver.close();
	}

}
