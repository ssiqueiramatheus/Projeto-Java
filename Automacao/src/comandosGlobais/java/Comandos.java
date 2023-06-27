import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.security.Principal;
import java.util.List;
import java.util.Set;

public class Comandos {
    public WebDriver driver;
    public WebDriverWait wait;

    public Comandos() {


        this.driver = new
        this.wait = new WebDriverWait(driver, 45);



    }
    public void aguardar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicar(String elemento) {

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elemento))).click();
    }

    public boolean elementoExiste(By seletor) {
        return driver.findElements(seletor).size() != 0;
    }

}
