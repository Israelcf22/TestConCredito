package Com.test.Concredito;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio6 {
	private WebDriver driver;
    By Claselocator = By.className("bkM8m pla-link");  
	By registerLinkLocator = By.linkText("Imágenes");
    By imagen = By.className("WaWKOe");
    By Visor = By.className("IA8gLe");
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("Https://Google.com");
	}

	@After
	public void tearDown() throws Exception {
		 
		driver.quit();
		}

	@Test
	public void test() throws InterruptedException {
		WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.clear();       
        searchbox.sendKeys("Pelota");        
        searchbox.submit();
        driver.findElement(registerLinkLocator).click();
        Thread.sleep(4000);
        WebElement Imagen = driver.findElement(By.className("rg_i"));
        Imagen.click();
        /*WebElement Visor =  driver.findElement(By.className("WaWKOe"));*/
        Thread.sleep(4000);
        if (driver.findElement(imagen).isDisplayed()) {
			System.out.print("El visor de imagenes se encuentra habilitado");
		}
        else {
			System.out.print("No se ha mostrado el visor de imagenes");
		}
        
        driver.findElement(Visor).click();
        System.out.print("Se procede a dar Click en la X para cerrar el visor");
        Thread.sleep(4000);

        if (driver.findElement(imagen).isDisplayed()) {
			System.out.print("El visor de imagenes se encuentra habilitado");
		}
        else {
			System.out.print("ya no se encuentra habilitado el visor");
		}
        		
	}

}
