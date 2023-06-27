import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class Principal {
    int zero = 0;

    @BeforeAll
    public static void inicializar() {
        System.setProperty("webdriver.chrome.driver", "C:\\dev\\tools\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();



    }

    @Test
    public void login() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.itau.com.br/");
        Comandos comandos = new Comandos();

        comandos.aguardar(6);
        comandos.elementoExiste(By.xpath("//*[@id=\"agencia\"]"));
       // comandos.clicar(("//*[@id=\"__next\"]/div/main/section[1]/div[2]/header/div/div[1]/ul[1]/li[1]/a"));


        //boolean b = driver.findElements(By.xpath("//*[@id='input-search']")).size() > zero;


    }
}
