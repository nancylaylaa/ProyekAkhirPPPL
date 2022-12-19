package ProyekAkhir;

import Formy.inputForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
    private WebDriver driver;
    public homePage(WebDriver driver){this.driver = driver;}
    private By formAccount = new By.ByLinkText("Create an Account");
    public inputNew createAccount(){
        driver.findElement(formAccount).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new inputNew(driver);
    }
}
