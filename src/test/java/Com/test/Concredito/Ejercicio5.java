package Com.test.Concredito;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio5 {
	private WebDriver driver;
	/*Elemento en la busqueda que te dice en el número de página que te encuentras */
	By idlocator2 = By.id("result-stats");
	By idlocator= By.id("pnnext");
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("Https://Google.com");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.clear();       
        searchbox.sendKeys("Pelota");        
        searchbox.submit();
        String Primerestado = driver.findElement(idlocator2).getText();
        System.out.print(Primerestado);
		driver.findElement(idlocator).click();
		String Segundoestado = driver.findElement(idlocator2).getText();
		System.out.print(Segundoestado);
        Thread.sleep(2000);
	    
        if (Primerestado != Segundoestado) {
			System.out.print("Usted se encuentra en una pagina distinta a la inicial "
			+ " por lo tanto debe contener resultados diferentes segun el funcionamiento de google");

		}
        
	}

}
