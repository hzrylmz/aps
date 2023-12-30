package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.Driver;
import base.TestBase;
import utilities.ReusableMethods;

public class LoginSteps extends TestBase {
    @Given("APS Giris ekranina gidilir")
    public void apsGirisEkraninaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("urlAPS"));

    }

    @And("Kullanici Kodu dogru sekilde girilir")
    public void kullaniciKoduDogruSekildeGirilir() {
        loginPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kullaniciKodu"));
    }

    @And("Sifre dogru sekilde girilir")
    public void sifreDogruSekildeGirilir() {
        loginPage.sifre.sendKeys(ConfigReader.getProperty("sifre"));
    }

    @When("Giris butonuna tiklandiginda")
    public void girisButonunaTiklandiginda() {
        loginPage.GirisBtn.click();
        ReusableMethods.bekle(2);

    }

    @Then("Anasayfanin geldigi gorulur")
    public void anasayfaninGeldigiGorulur() {
        homePage.anaSayfaBtn.isDisplayed();

    }

    @And("Kullanici Kodu alani bos birakilir")
    public void kullaniciKoduAlaniBosBirakilir() {
        loginPage.kullaniciAdi.sendKeys("  ");
    }

    @Then("Hata mesajinin alindigi gorulur")
    public void hataMesajininAlindigiGorulur() {
        ReusableMethods.bekle(1);
        WebElement alertMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alertdialog']"));
        Assert.assertTrue(ReusableMethods.waitForVisibility((alertMessage),2).isDisplayed());

        String alertM= alertMessage.getText();
        Assert.assertTrue(alertM.contains("Hata: Giriş işlemi başarısız oldu. Lütfen bilgilerinizi kontrol edip tekrar deneyiniz."));
        //provizyonIslemleri.taniGirisi_KaydetBtn.isDisplayed();
        ReusableMethods.bekle(3);




        /*String girisEkraniTitle = loginPage.girisEkraniTitle.getText();
        String expectedTitle = "Giriş Ekranı";
        Assert.assertEquals(expectedTitle, girisEkraniTitle);
        ReusableMethods.bekle(1);*/


    }

    @And("Sifre alani bos birakilir")
    public void sifreAlaniBosBirakilir() {
        loginPage.kullaniciAdi.sendKeys("  ");
    }

    @And("Profil ismi butonuna tiklanir")
    public void profilIsmiButonunaTiklanir() {

        homePage.profil_ismi.click();
    }

    @When("LogOut butonuna tiklandiginda")
    public void logoutButonunaTiklandiginda() {
        homePage.logout.click();
        ReusableMethods.bekle(1);
    }

    @Then("Login ekranina donuldugu gorulur")
    public void loginEkraninaDonulduguGorulur() {
        loginPage.girisEkraniTitle.isDisplayed();
    }

    @And("Sifre alani silinir")
    public void sifreAlaniSilinir() {
        loginPage.sifre.clear();
    }

    @And("Doktor secilir -ilyas tarik katirci")
    public void doktorSecilirIlyasTarikKatirci() {
        provizyonIslemleri.doktor_ilyasTarikKatirci.click();
    }
}
