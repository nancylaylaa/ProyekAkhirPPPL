import ProyekAkhir.*;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestProyekAkhir {
    private static WebDriver driver;

    @Test
    public void newAccount(){
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        homePage home_page = new homePage(driver);
        inputNew newUser = home_page.createAccount();
        newUser.setFirstName("Angkasa");
        newUser.setLastName("Manggala");
        newUser.setNewsletter();
        newUser.setEmail("angkasla6@gmail.com");//ini harus diganti tiap testing
        newUser.setPwd("permisiadaorangcakepn1H");
        newUser.setConfirmPwd("permisiadaorangcakepn1H");
        profilePage profile = newUser.createButton();
        String resultUrl = profile.getURL();
        Assert.assertEquals("https://magento.softwaretestingboard.com/customer/account/",resultUrl);
        productPage newProducts = profile.selectNew();
        detailPage infoProduct = newProducts.infoProduct();
    }
}
