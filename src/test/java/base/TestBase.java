package base;

import org.openqa.selenium.interactions.Actions;
import pages.*;

import static utilities.Driver.getDriver;

public abstract class TestBase {
    public LoginPage loginPage = new LoginPage();
    public Actions actions = new Actions(getDriver());

    public ProvizyonIslemleri provizyonIslemleri = new ProvizyonIslemleri();

    public HomePage homePage = new HomePage();

    public DetayliIslemKalemiArama detayliIslemKalemiArama = new DetayliIslemKalemiArama();

    public IkinciHastane ikinciHastane = new IkinciHastane();









}