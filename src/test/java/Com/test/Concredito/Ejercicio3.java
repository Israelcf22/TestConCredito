package Com.test.Concredito;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio3 {
	private WebDriver driver;      
	By locator_Xpath = By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[3]/center/input[2]");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.clear();       
        searchbox.sendKeys("Selenium");        
        searchbox.submit();
        driver.navigate().back();
	 	driver.findElement(locator_Xpath).click();
	 	Thread.sleep(2000);
	}
    
		
	}

