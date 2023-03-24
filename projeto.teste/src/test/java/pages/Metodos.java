package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;
	String correios = "https://www.correios.com.br/";

	public void abrirNavegador(String appUrl, String descricaoPasso) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(correios);
		driver.manage().window().maximize();

	}

	public void escrever(String texto, By elemento) {
		driver.findElement(elemento).sendKeys(texto);

	}
public void submit(By elemento) {
	driver.findElement(elemento).submit();
	
}
public void fecharNavegador() {
	driver.quit();
}

}
