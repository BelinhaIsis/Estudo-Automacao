package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePages {

	static WebDriver navegador;

	public homePages(WebDriver navegador) {

		this.navegador = navegador;
	}

	public void login() {

		navegador.findElement(By.linkText("Sign in")).click();
		WebElement formlariSignInBox = navegador.findElement(By.id("signinbox"));
		formlariSignInBox.findElement(By.name("login")).sendKeys("julio0001");
		formlariSignInBox.findElement(By.name("password")).sendKeys("123456");
		formlariSignInBox.findElement(By.linkText("SIGN IN")).click();

		WebElement me = navegador.findElement(By.className("me"));
		String textoNoElementoMe = me.getText();
		assertEquals("Hi,Julio", textoNoElementoMe);
	}

}
