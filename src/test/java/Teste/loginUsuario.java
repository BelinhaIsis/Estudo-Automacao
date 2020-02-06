package Teste;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.homePages;

public class loginUsuario {

	static WebDriver navegador;
	static homePages loginUsuario;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Users/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		// driver = new FirefoxDriver();
		navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.get("http://www.juliodelima.com.br/taskit/");
		navegador.manage().window().maximize();

		loginUsuario = new homePages(navegador);
	}

	@Test
	public void test() {

		loginUsuario.login();
	}

	@After
	public void tearDown() throws Exception {

		navegador.quit();
	}

}
