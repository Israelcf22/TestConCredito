package Com.test.Concredito;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class Ejercicio4 {
	private WebDriver driver;   
	By registrerLinkLocator =  By.linkText("Daft Punk - Wikipedia, la enciclopedia libre");
	/*By locator_Xpath = By.xpath("//*[@id=\"rso\"]/div[1]/div/div[2]/div[1]/a/h3/span");*/
	/*By locator_cssSelector = By.cssSelector(null);}*/
     
    
	/*By locator_tagname = By.tagName("a:visited");*/
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("Https://Google.com");
		
		/*href="https://es.wikipedia.org/wiki/Daft_Punk"*/
	}

	@After
	public void tearDown() throws Exception {
		  driver.quit();
		}
	 	
   
	
	
	@Test
	public void test() throws InterruptedException {
		WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.clear();       
        searchbox.sendKeys("Daft punk");        
        searchbox.submit();
        WebElement enlace = driver.findElement(By.className("LC20lb"));
        enlace.click();
        driver.navigate().back();
      
       
        
        
        /*
        if(driver.findElement(locator_tagname).isDisplayed());{
        	
        	boolean result = driver.findElement(locator_tagname).isDisplayed();
        	System.out.print(result);
			System.out.print("Usted cuenta con una pagina ya visitada");*/
					
	}           
	     
}
	
