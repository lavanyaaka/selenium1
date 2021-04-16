package Practise.SeleniumProject;


	

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class parallel {
	WebDriver driver;


	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
	//Check if parameter passed from TestNG is 'firefox'
	if(browser.equalsIgnoreCase("internet explorer")){
	//create firefox instance
	System.setProperty("webdriver.gecko.driver","F:\\drivers\\geckodriver.exe");  
	         driver = new FirefoxDriver();
	   }
	//Check if parameter passed as 'chrome'
	else if(browser.equalsIgnoreCase("chrome")){
	//set path to chromedriver.exe
	System.setProperty("webdriver.chrome.driver","F:\\drivers\\chromedriver.exe");
	//create chrome instance
	driver = new ChromeDriver();
	}
	//Check if parameter passed as 'Edge'
	else if(browser.equalsIgnoreCase("IE")){
	//set path to Edge.exe
	System.setProperty("webdriver.ie.driver","F:\\drivers\\IEDriverServer.exe");
	//create Edge instance
	driver = new InternetExplorerDriver();
	}
	else{
	//If no browser passed throw exception
	throw new Exception("Browser is not correct");
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testParameterWithXML() throws InterruptedException{
	driver.get("https://www.facebook.com/");
	//Find user name
	WebElement Email = driver.findElement(By.name("email"));
	//Fill user name
	Email.sendKeys("abcxyz@gmail.com");
	//Find password
	WebElement password = driver.findElement(By.name("pass"));
	//Fill password
	password.sendKeys("xxxxxx");
	}
	}


