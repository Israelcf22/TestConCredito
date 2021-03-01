package Com.test.Concredito;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio1 {
	private WebDriver driver;
	
	By locator_name = By.id("result-stats"); /*Nombre de el elemento que sólo se encuentra una vez realizada una busqueda*/
    By Locartor_Xpath = By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]");
    
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
	 	Thread.sleep(2000);
        driver.findElement(Locartor_Xpath).click();
        if(driver.findElement(locator_name).isDisplayed());{
            
        	System.out.print("Se encuentra ya dentro de una pagina con resultados");				
		}          
          
	}

}
