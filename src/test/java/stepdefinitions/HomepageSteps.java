package stepdefinitions;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomepageSteps extends TestBase {
    @And("Anasayfadaki Hamburger menu butonuna tiklanir")
    public void anasayfadakiHamburgerMenuButonunaTiklanir() {
        homePage.hamburger_menu.click();
        ReusableMethods.bekle(1);
    }

    @And("Provizyon Takibi-Guncelleme butonuna tiklanir")
    public void provizyonTakibiGuncellemeButonunaTiklanir() {
        homePage.provizyonTakibi_guncelleme.click();
        ReusableMethods.bekle(1);
    }

    @Then("Ekranda -Uyari: Sorgulama yapmak istediginiz tarih araligini seciniz veya provizyon numarasini giriniz!- uyarisinin alindigi gorulur")
    public void ekrandaUyariSorgulamaYapmakIstediginizTarihAraliginiSecinizVeyaProvizyonNumarasiniGirinizUyarisininAlindigiGorulur() {
        ReusableMethods.bekle(1);
        WebElement alertMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alertdialog']"));
        Assert.assertTrue(ReusableMethods.waitForVisibility((alertMessage),2).isDisplayed());

        String alertM= alertMessage.getText();
        Assert.assertTrue(alertM.contains("Uyarı: Sorgulama yapmak istediğiniz tarih aralığını seçiniz veya provizyon numarasını giriniz!"));
        //provizyonIslemleri.taniGirisi_KaydetBtn.isDisplayed();
        ReusableMethods.bekle(3);
    }

    @And("Provizyon Numarasi alanina provizyon no girisi yapilir")
    public void provizyonNumarasiAlaninaProvizyonNoGirisiYapilir() {
        homePage.provizyonNumarasi_input.sendKeys("44766403");
        ReusableMethods.bekle(1);
    }

    @And("Provizyon Kayit Tarihi olarak gunun tarihi secilir")
    public void provizyonKayitTarihiOlarakGununTarihiSecilir() {
        homePage.provizyonKayitTarihiAraligi_ilkKisim.click();
        ReusableMethods.bekle(1);
        provizyonIslemleri.bugununTarihi.click();
        ReusableMethods.bekle(1);
    }
    @Then("İlgili provizyonun ekranda listelendigi gorulur")
    public void ilgiliProvizyonunEkrandaListelendigiGorulur() {
        String actual_provizyon = homePage.aramaSonuclari_provizyon.getText();
        String expected_provizyon = "44766403";

        Assert.assertEquals(expected_provizyon,actual_provizyon);
    }

    @And("İlgili TCKN nin ekranda listelendigi gorulur")
    public void ilgiliTCKNNinEkrandaListelendigiGorulur() {
        String actual_miktar = homePage.sagAltMiktar.getText();
        String expected_miktar = "#0";

        Assert.assertNotEquals(expected_miktar, actual_miktar);

    }

    @And("Kisi Sorgulama Alanina TCKN girisi yapilir")
    public void kisiSorgulamaAlaninaTCKNGirisiYapilir() {
        homePage.kisiSorgulama_input.sendKeys(ConfigReader.getProperty("cagilTCKN"));
        ReusableMethods.bekle(1);
    }

    @And("Ekranda bulunan -Excele Aktar- butonuna tiklanir ve Excel dosyasinin export edildigi gorulur")
    public void ekrandaBulunanExceleAktarButonunaTiklanirVeExcelDosyasininExportEdildigiGorulur() {
        homePage.exceleAktar.isEnabled();
        homePage.exceleAktar.isDisplayed();
        ReusableMethods.bekle(1);
    }

    @And("Provizyon Durumu secilir - Beklemede")
    public void provizyonDurumuSecilirBeklemede() {
        homePage.provizyonDurumu_hepsi.click();
        ReusableMethods.bekle(1);
        homePage.provizyonDurumu_Beklemede.click();
        ReusableMethods.bekle(1);
    }

    @And("Sayfa alt kisimdaki page bire kaydirilir")
    public void sayfaAltKisimdakiPageBireKaydirilir() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView();", homePage.bugun_kaydedilen_provizyonlar_sayfa1);
        ReusableMethods.bekle(1);

    }

    @Then("Ekranda -Sigortali icin bugun kaydedilen provizyonlar- basliginin da geldigi gorulur")
    public void ekrandaSigortaliIcinBugunKaydedilenProvizyonlarBasligininDaGeldigiGorulur() {
        homePage.sigortali_icin_bugun_kaydedilen_provizyonlar_title.isDisplayed();
    }

    @And("Provizyon Kayit Tarihi olarak ayin ilk gunu secilir")
    public void provizyonKayitTarihiOlarakAyinIlkGunuSecilir() {
        homePage.provizyonKayitTarihiAraligi_ilkKisim.click();
        ReusableMethods.bekle(1);
        homePage.ayin_ilk_gunu.click();
        ReusableMethods.bekle(1);
    }

    @And("Sayfa sag alttaki miktara kaydirilir")
    public void sayfaSagAlttakiMiktaraKaydirilir() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView();", homePage.sagAltMiktar);
        ReusableMethods.bekle(2);
    }

    @And("Arama sonuclari - Ekranda ilk listelenen kayit icin -Guncelle- butonuna tiklanir")
    public void aramaSonuclariEkrandaIlkListelenenKayitIcinGuncelleButonunaTiklanir() {
        homePage.arama_sonuclari_birinci_guncelle.click();
    }
}
