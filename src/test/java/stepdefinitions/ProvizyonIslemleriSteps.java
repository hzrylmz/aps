package stepdefinitions;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static utilities.Driver.getDriver;

public class ProvizyonIslemleriSteps extends TestBase {
    @Then("Login Olunur")
    public void loginOlunur() {
        loginPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kullaniciKodu"));
        loginPage.sifre.sendKeys(ConfigReader.getProperty("sifre"));
        loginPage.GirisBtn.click();
        ReusableMethods.bekle(2);
    }

    @And("Provizyon Islemleri butonuna tiklanir")
    public void provizyonIslemleriButonunaTiklanir() {
        homePage.provizyonIslemleriBtn.click();
        ReusableMethods.bekle(2);
    }

    @And("Yeni Provizyon Talebi butonuna tiklanir")
    public void yeniProvizyonTalebiButonunaTiklanir() {
        homePage.yeniProvizyonTalebiBtn.click();
        ReusableMethods.bekle(2);
    }

    @And("Arama Cubuguna TCKN girisi yapilir")
    public void aramaCubugunaTCKNGirisiYapilir() {
        homePage.aramaKriterleri_input.sendKeys(ConfigReader.getProperty("cagilTCKN"));
        ReusableMethods.bekle(1);
    }

    @And("Arama Kriterleri ekranindaki Ara butonuna tiklanir")
    public void aramaKriterleriEkranindakiAraButonunaTiklanir() {
        homePage.aramaKriterleri_araBtn.click();
        ReusableMethods.bekle(2);
    }

    @And("Police listesinden ilk siradaki police icin Devam butonuna tiklanir")
    public void policeListesindenIlkSiradakiPoliceIcinDevamButonunaTiklanir() {
        provizyonIslemleri.ilkSiradakiDevamBtn.click();
        ReusableMethods.bekle(2);
    }

    @And("Doktor Secimi icin sec dropdown ina tiklanir")
    public void doktorSecimiIcinSecDropdownInaTiklanir() {
        provizyonIslemleri.doktorAdi_sec_dropdownBtn.click();
    }

    @And("Doktor Secilir - Zerrin Boyaci")
    public void doktorSecilirZerrinBoyaci() {
        provizyonIslemleri.doktor_zerrinBoyaci.click();
    }


    @And("Doktor Secimi Sec butonuna tiklanir")
    public void doktorSecimiSecButonunaTiklanir() {
        provizyonIslemleri.DoktorSecimi_SecBtn.click();
        ReusableMethods.bekle(1);
    }


    @And("Sikayet alanina metin girisi yapilir")
    public void sikayetAlaninaMetinGirisiYapilir() {
        provizyonIslemleri.sikayet_metin_alani.sendKeys(ConfigReader.getProperty("sikayet"));
    }

    @And("Sikayet Baslangic Tarihi secimi yapilir")
    public void sikayetBaslangicTarihiSecimiYapilir() {
        provizyonIslemleri.sikayetTarihi_InputAlani.click();
        ReusableMethods.bekle(1);
        provizyonIslemleri.bugununTarihi.click();
        ReusableMethods.bekle(1);
    }

    @And("Tani Girisi alanina kod girilir")
    public void taniGirisiAlaninaKodGirilir() {
        provizyonIslemleri.taniGirisi_input.sendKeys("Z251");
        ReusableMethods.bekle(2);

        //JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        //jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //ReusableMethods.bekle(1);
        //actions.scrollToElement(provizyonIslemleri.taniKodu_KaldirBtn).perform();
    }

    @And("Tani Kodu- Ekle butonuna tiklanir")
    public void taniKoduEkleButonunaTiklanir() {
        provizyonIslemleri.taniKodu_EkleBtn.click();
        ReusableMethods.bekle(1);
    }

    @And("Sayfa asagi kaydirilir")
    public void sayfaAsagiKaydirilir() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        //jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        jsExecutor.executeScript("arguments[0].scrollIntoView();", provizyonIslemleri.taniKodu_KaldirBtn);
        ReusableMethods.bekle(1);


    }

    @And("Tani Girisi- Kaydet butonuna tiklanir")
    public void taniGirisiKaydetButonunaTiklanir() {
        provizyonIslemleri.taniGirisi_KaydetBtn.click();
        ReusableMethods.bekle(1);
    }


    @And("Asi-İlac tabina tiklanir")
    public void asiIlacTabinaTiklanir() {
        provizyonIslemleri.tab_asi_Ilac.click();
        ReusableMethods.bekle(1);
    }

    @And("Asi-İlac adi alanina giris yapilir - NASALEZE COLD")
    public void asiIlacAdiAlaninaGirisYapilirNASALEZECOLD() {
        provizyonIslemleri.asi_ilacAdi_input.sendKeys("NASALEZE COLD");
        ReusableMethods.bekle(1);
    }

    @And("Asi-İlac Adi Ara butonuna tiklanir")
    public void asiIlacAdiAraButonunaTiklanir() {
        provizyonIslemleri.asi_ilacAdi_islemKalemi_araBtn.click();
        ReusableMethods.bekle(1);
    }

    @And("Arama sonucu gelen ekrana ilac adet bilgisi girilir")
    public void aramaSonucuGelenEkranaIlacAdetBilgisiGirilir() {
        provizyonIslemleri.asi_ilac_adet.sendKeys("2");
        ReusableMethods.bekle(1);
    }

    @And("Ilac adedi eklemek icin Ekle butonuna tiklanir")
    public void ilacAdediEklemekIcinEkleButonunaTiklanir() {
        provizyonIslemleri.ilac_adedi_islemKalemi_Ekle.click();
        ReusableMethods.bekle(1);
    }


    @And("Sayfa ilgili Kaydet elementine kaydirilir")
    public void sayfaIlgiliKaydetElementineKaydirilir() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView();", provizyonIslemleri.islemKalemi_KaydetBtn);
        ReusableMethods.bekle(1);
    }

    @When("Kaydet butonuna tiklandiginda")
    public void kaydetButonunaTiklandiginda() {
        provizyonIslemleri.islemKalemi_KaydetBtn.click();
        ReusableMethods.bekle(1);
    }

    @Then("Ret statusunde hata mesaji alindigi gorulur")
    public void retStatusundeHataMesajiAlindigiGorulur() {
        String hata_mesaji = provizyonIslemleri.ret_statusu_hata_mesaji.getText();
        Assert.assertTrue(hata_mesaji.contains("Ret statüsünde sonuçlanmıştır"));

    }

    @And("Tani Girisi alanina kod girilir - \\(Menengokokal menenjit)")
    public void taniGirisiAlaninaKodGirilirMenengokokalMenenjit() {
        provizyonIslemleri.taniGirisi_input.sendKeys("A390");
        ReusableMethods.bekle(2);

    }

    @And("İslem Kalem Alanina metin girilir - VEMP \\(Vestibuler Evoked Myojenik Potansiyaller)")
    public void islemKalemAlaninaMetinGirilirVEMPVestibulerEvokedMyojenikPotansiyaller() {
        provizyonIslemleri.islemKalemAdi_input.sendKeys("VEMP");
        ReusableMethods.bekle(1);
    }

    @And("İslem Kalemi Ara butonuna tiklanir")
    public void islemKalemiAraButonunaTiklanir() {
        provizyonIslemleri.asi_ilacAdi_islemKalemi_araBtn.click();
    }

    @And("Ilac adedi-İslem Kalemi eklemek icin Ekle butonuna tiklanir")
    public void ilacAdediIslemKalemiEklemekIcinEkleButonunaTiklanir() {
        provizyonIslemleri.ilac_adedi_islemKalemi_Ekle.click();
    }

    @And("Sayfa ilgili Provizyon Formu Bas elementine kaydirilir")
    public void sayfaIlgiliProvizyonFormuBasElementineKaydirilir() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView();", provizyonIslemleri.provizyonFormuBasBtn);

    }

    @And("Provizyon Formu Bas butonuna tiklanir")
    public void provizyonFormuBasButonunaTiklanir() {
        provizyonIslemleri.provizyonFormuBasBtn.click();
        ReusableMethods.bekle(10);
    }

    @Then("Form Basimi Yapildigi gorulur")
    public void formBasimiYapildigiGorulur() {
        Set<String> windowhandles = Driver.getDriver().getWindowHandles();
        System.out.println(windowhandles);

        Iterator<String> it = windowhandles.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();

        String actualURl = Driver.getDriver().switchTo().window(childWindow).getCurrentUrl();
        Assert.assertTrue(actualURl.contains("EventProvision"));
        ReusableMethods.bekle(1);
        Driver.getDriver().close();
    }


    @And("Tani Girisi alanina kod girilir - \\(Kolera Vibrio cholorea, kolera tipine bagli)")
    public void taniGirisiAlaninaKodGirilirKoleraVibrioCholoreaKoleraTipineBagli() {
        provizyonIslemleri.taniGirisi_input.sendKeys("A000");
        ReusableMethods.bekle(2);
    }

    @And("Aradigimi Bulamadim butonuna tiklanir")
    public void aradigimiBulamadimButonunaTiklanir() {
        provizyonIslemleri.aradigimiBulamadimBtn.click();

    }

    @And("Detayli İslem Kalemi Arama ekranindaki İslem Kalem Adi alanina metin girisi yapilir- \\(RADYOFREKANS)")
    public void detayliIslemKalemiAramaEkranindakiIslemKalemAdiAlaninaMetinGirisiYapilirRADYOFREKANS() {
        detayliIslemKalemiArama.detayliIslemKalemiArama_islemKalemAdi.sendKeys("RADYOFREKANS");
        ReusableMethods.bekle(1);
    }

    @And("Detayli İslem Kalemi Arama ekranindaki Ara butonuna tiklanir")
    public void detayliIslemKalemiAramaEkranindakiAraButonunaTiklanir() {
        detayliIslemKalemiArama.detayliIslemKalemiArama_AraBtn.click();
        ReusableMethods.bekle(1);
    }

    @And("Detayli İslem Kalemi Arama ekranindaki ilk sonuc Ekle butonuna tiklanir")
    public void detayliIslemKalemiAramaEkranindakiIlkSonucEkleButonunaTiklanir() {
        detayliIslemKalemiArama.detayliIslemKalemiArama_islemKalemiEkle.click();
        ReusableMethods.bekle(1);
    }

    @Then("Provizyonun Olustugu gorulur")
    public void provizyonunOlustuguGorulur() {
        String bilgi_mesaji = provizyonIslemleri.provizyonOlusmaInfo.getText();
        Assert.assertTrue(bilgi_mesaji.contains("detay tablolar aşağıdaki gibidir"));

    }

    @And("Adli Vaka Mi? seçenegi -Evet- olarak secilir")
    public void adliVakaMiSecenegiEvetOlarakSecilir() {
        provizyonIslemleri.adliVaka_EvetRadiobox.click();
    }

    @And("Dosya tipi -Sigortali Beyani- olarak secilir")
    public void dosyaTipiSigortaliBeyaniOlarakSecilir() {
        provizyonIslemleri.sec_dropdown.click();
        ReusableMethods.bekle(1);
        provizyonIslemleri.dosyaTipi_sigortaliBeyani.click();
    }

    @And("Sec butonuna tiklanir ve ilgili dosya secilir")
    public void secButonunaTiklanirVeIlgiliDosyaSecilir() {
        provizyonIslemleri.adliVaka_dosyaUploadBtn.sendKeys("C:\\Users\\hizir.yilmaz\\IdeaProjects\\aps\\src\\test\\resources\\pics\\sigortali_beyani.png");
    }

    @And("Yuklenen dosya icin -Kaydet- butonuna tiklanir")
    public void yuklenenDosyaIcinKaydetButonunaTiklanir() {
        provizyonIslemleri.ilac_adedi_islemKalemi_Ekle.click();
        ReusableMethods.bekle(2);
    }


    @And("TCKN girisi yapilir - Bilgehan")
    public void tcknGirisiYapilirBilgehan() {
        homePage.aramaKriterleri_input.sendKeys(ConfigReader.getProperty("bilgehanTCKN"));

    }

    @Then("İlgili provizyon mesajinin alindigi gorulur")
    public void ilgiliProvizyonMesajininAlindigiGorulur() {
        String hata_mesaji = provizyonIslemleri.ilgili_provizyon_mesaji.getText();
        Assert.assertTrue(hata_mesaji.contains("statüsünde sonuçlanmıştır"));
    }

    @And("Kayitli Olmayan Doktor secilir")
    public void kayitliOlmayanDoktorSecilir() {
        provizyonIslemleri.kayitli_olmayan_doktor.click();
    }

    @And("Doktor Diploma Numarasi girisi yapilir")
    public void doktorDiplomaNumarasiGirisiYapilir() {
        provizyonIslemleri.diplomaNo_input.sendKeys(ConfigReader.getProperty("diplomaNo"));
    }

    @And("Doktor Diploma Numarasi - Ara butonuna tiklanir")
    public void doktorDiplomaNumarasiAraButonunaTiklanir() {
        provizyonIslemleri.doktorDiplomaNo_AraBtn.click();
    }

    @And("Doktor Bransı Secimi icin Sec dropdown ina tiklanir")
    public void doktorBransıSecimiIcinSecDropdownInaTiklanir() {
        provizyonIslemleri.doktorBransi_sec_dropdown.click();
        ReusableMethods.bekle(1);
    }

    @And("Doktor Bransi Secimi yapilir - aile hekimi")
    public void doktorBransiSecimiYapilirAileHekimi() {
        provizyonIslemleri.doktorBransi_aileHekimi.click();
    }

    @And("Diploma Numarasi uzerinden doktor secimi yapilir")
    public void diplomaNumarasiUzerindenDoktorSecimiYapilir() {
        provizyonIslemleri.kayitliOlmayanDoktor_sec_Btn.click();
    }

    @And("Scroll View Tani Girisi Kaydet butonuna kaydirilir")
    public void scrollViewTaniGirisiKaydetButonunaKaydirilir() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView();", provizyonIslemleri.taniGirisi_KaydetBtn);
        ReusableMethods.bekle(1);
    }


    @And("Detayli İslem Kalemi Arama ekranindaki Sut Kodu alanina metin girisi yapilir -CDKan-")
    public void detayliIslemKalemiAramaEkranindakiSutKoduAlaninaMetinGirisiYapilirCDKan() {
        detayliIslemKalemiArama.detayliIslemKalemiArama_sutKodu.sendKeys(ConfigReader.getProperty("sutKodu"));
    }

    @And("Anlasmali Kurum Tutari alanina giris yapilir")
    public void anlasmaliKurumTutariAlaninaGirisYapilir() {
        provizyonIslemleri.anlasmaliKurumTutari.sendKeys("99");
    }


    @And("Eklenen İslem Kalemi Listesi - Aciklama dropdown ina tiklanir")
    public void eklenenIslemKalemiListesiAciklamaDropdownInaTiklanir() {
        provizyonIslemleri.doktorBransi_sec_dropdown.click();
        ReusableMethods.bekle(1);
    }

    @And("Eklenen İslem Kalemi Listesi- Aciklama dropdown- SGK secimi yapilir")
    public void eklenenIslemKalemiListesiAciklamaDropdownSGKSecimiYapilir() {
        provizyonIslemleri.eklenenIsKalemiListesi_Aciklama_SGK.click();
    }

    @And("Eklenen İslem Kalemi Listesi - Guncelle butonuna tiklanir")
    public void eklenenIslemKalemiListesiGuncelleButonunaTiklanir() {
        provizyonIslemleri.eklenenIsKalemiListesi_Guncelle_Btn.click();
        ReusableMethods.bekle(1);
    }

    @And("Detayli İslem Kalemi Arama ekranindaki HUV Kodu alanina metin girisi yapilir -CDKan-")
    public void detayliIslemKalemiAramaEkranindakiHUVKoduAlaninaMetinGirisiYapilirCDKan() {
        detayliIslemKalemiArama.detayliIslemKalemiArama_huvKodu.sendKeys(ConfigReader.getProperty("huvKodu"));
    }

    @And("Eklenen Islem Kalemi Listesi - Aciklama Dropdown - Kampanyali Fiyat secimi yapilir")
    public void eklenenIslemKalemiListesiAciklamaDropdownKampanyaliFiyatSecimiYapilir() {
        provizyonIslemleri.eklenenIsKalemiListesi_Aciklama_KampanyaliFiyat.click();
    }

    @And("Arama Cubuguna YKN girisi yapilir")
    public void aramaCubugunaYKNGirisiYapilir() {
        homePage.aramaKriterleri_input.sendKeys(ConfigReader.getProperty("ykn"));
    }

    @Then("Bekleme statusunde ilgili mesaj gorulur")
    public void beklemeStatusundeIlgiliMesajGorulur() {
        String hata_mesaji = provizyonIslemleri.ilgili_provizyon_mesaji.getText();
        Assert.assertTrue(hata_mesaji.contains("Bekleme statüsünde sonuçlanmıştır"));
    }

    @Then("LogOut yapilir")
    public void logoutYapilir() {
        homePage.profil_ismi.click();
        homePage.logout.click();
        ReusableMethods.bekle(1);
        loginPage.girisEkraniTitle.isDisplayed();

    }

    @And("Arama Cubuguna Pasaport No girisi yapilir")
    public void aramaCubugunaPasaportNoGirisiYapilir() {
        homePage.aramaKriterleri_input.sendKeys(ConfigReader.getProperty("pasaportNo"));
    }

    @Then("Ekranda  -Uyari: Tarih bilgisi girilmesi zorunludur!- mesajinin verildigi gorulur")
    public void ekrandaUyariTarihBilgisiGirilmesiZorunludurMesajininVerildigiGorulur() {
        ReusableMethods.bekle(1);
        WebElement alertMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alertdialog']"));
        Assert.assertTrue(ReusableMethods.waitForVisibility((alertMessage),2).isDisplayed());

        String alertM= alertMessage.getText();
        Assert.assertTrue(alertM.contains("Tarih bilgisi girilmesi zorunludur"));

    }

    @And("Sikayet Baslangic tarihi yanlis secilir")
    public void sikayetBaslangicTarihiYanlisSecilir() {
        provizyonIslemleri.sikayetTarihi_InputAlani.sendKeys("01/01/1960");
        ReusableMethods.bekle(1);
    }

    @Then("Ekranda -Uyari: Sikayet baslangic tarihi sigortalinin dogum tarihinden kucuk olamaz!- mesajinin verildigi gorulur")
    public void ekrandaUyariSikayetBaslangicTarihiSigortalininDogumTarihindenKucukOlamazMesajininVerildigiGorulur() {
        ReusableMethods.bekle(1);
        WebElement alertMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alertdialog']"));
        Assert.assertTrue(ReusableMethods.waitForVisibility((alertMessage),2).isDisplayed());

        String alertM= alertMessage.getText();
        Assert.assertTrue(alertM.contains("Uyarı: Şikayet başlangıç tarihi sigortalının doğum tarihinden küçük olamaz!"));
        //provizyonIslemleri.taniGirisi_KaydetBtn.isDisplayed();
        ReusableMethods.bekle(3);

    }

    @Then("Ekranda -Uyari: Doktor secimi zorunludur!- mesajinin geldigi gorulur")
    public void ekrandaUyariDoktorSecimiZorunludurMesajininGeldigiGorulur() {
        ReusableMethods.bekle(1);
        WebElement alertMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alertdialog']"));
        Assert.assertTrue(ReusableMethods.waitForVisibility((alertMessage),2).isDisplayed());

        String alertM= alertMessage.getText();
        Assert.assertTrue(alertM.contains("Uyarı: Doktor seçimi zorunludur!"));
        //provizyonIslemleri.taniGirisi_KaydetBtn.isDisplayed();
        ReusableMethods.bekle(3);
    }


    @Then("Ekranda -Uyari: Tani girmelisiniz- mesajinin geldigi gorulur")
    public void ekrandaUyariTaniGirmelisinizMesajininGeldigiGorulur() {
        ReusableMethods.bekle(1);
        WebElement alertMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alertdialog']"));
        Assert.assertTrue(ReusableMethods.waitForVisibility((alertMessage),2).isDisplayed());

        String alertM= alertMessage.getText();
        Assert.assertTrue(alertM.contains("Uyarı: Tanı girmelisiniz"));
        //provizyonIslemleri.taniGirisi_KaydetBtn.isDisplayed();
        ReusableMethods.bekle(3);
    }

    @And("Sayfa asagi kaydirilir -Adli Vaka-Evet butonuna")
    public void sayfaAsagiKaydirilirAdliVakaEvetButonuna() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        //jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        jsExecutor.executeScript("arguments[0].scrollIntoView();", provizyonIslemleri.adliVaka_EvetRadiobox);
        ReusableMethods.bekle(1);
    }

    @Then("Ekranda -Uyari: Islem kalemi secilmemis- mesajinin geldigi gorulur")
    public void ekrandaUyariIslemKalemiSecilmemisMesajininGeldigiGorulur() {
        ReusableMethods.bekle(1);
        WebElement alertMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alertdialog']"));
        Assert.assertTrue(ReusableMethods.waitForVisibility((alertMessage),2).isDisplayed());

        String alertM= alertMessage.getText();
        Assert.assertTrue(alertM.contains("Uyarı: İşlem kalemi seçilmemiş"));
        //provizyonIslemleri.taniGirisi_KaydetBtn.isDisplayed();
        ReusableMethods.bekle(3);
    }

    @And("Sarf Malzeme tabina tiklanir")
    public void sarfMalzemeTabinaTiklanir() {
        provizyonIslemleri.sarfMalzeme.click();
        ReusableMethods.bekle(1);
    }

    @And("Sarf Malzeme Adi girisi yapilir - NARKOZ BALONLU")
    public void sarfMalzemeAdiGirisiYapilirNARKOZBALONLU() {
        detayliIslemKalemiArama.sarfMalzemeAdi_input.sendKeys(ConfigReader.getProperty("sarfMalzeme"));
    }


    @Then("Ekranda -Uyari: Adet Ekle- uyari mesajinin alindigi gorulur")
    public void ekrandaUyariAdetEkleUyariMesajininAlindigiGorulur() {
        ReusableMethods.bekle(1);
        WebElement alertMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alertdialog']"));
        Assert.assertTrue(ReusableMethods.waitForVisibility((alertMessage),2).isDisplayed());

        String alertM= alertMessage.getText();
        Assert.assertTrue(alertM.contains("Adet Giriniz!"));
        //provizyonIslemleri.taniGirisi_KaydetBtn.isDisplayed();
        ReusableMethods.bekle(3);
    }

    @And("Ekranda -Uyari: Adet bilgisi girilmesi zorunludur- mesajinin geldigi gorulurr")
    public void ekrandaUyariAdetBilgisiGirilmesiZorunludurMesajininGeldigiGorulurr() {
        ReusableMethods.bekle(1);
        WebElement alertMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alertdialog']"));
        Assert.assertTrue(ReusableMethods.waitForVisibility((alertMessage),2).isDisplayed());

        String alertM= alertMessage.getText();
        Assert.assertTrue(alertM.contains("Sarf Malzeme alanından giriş yapılmalıdır"));
        //provizyonIslemleri.taniGirisi_KaydetBtn.isDisplayed();
        ReusableMethods.bekle(3);
    }

    @And("Arama Cubuguna Aksigorta-TCKN girisi yapilir")
    public void aramaCubugunaAksigortaTCKNGirisiYapilir() {
        homePage.aramaKriterleri_input.sendKeys(ConfigReader.getProperty("aksigortaTCKN"));
        ReusableMethods.bekle(1);
    }

    @And("Arama Cubuguna Garanti-TCKN girisi yapilir")
    public void aramaCubugunaGarantiTCKNGirisiYapilir() {
        homePage.aramaKriterleri_input.sendKeys(ConfigReader.getProperty("garantiTCKN"));
        ReusableMethods.bekle(1);
    }

    @And("Detayli İslem Kalemi Arama ekranindaki İslem Kalem Adi alanina metin girisi yapilir- \\(VEMP)")
    public void detayliIslemKalemiAramaEkranindakiIslemKalemAdiAlaninaMetinGirisiYapilirVEMP() {
        detayliIslemKalemiArama.detayliIslemKalemiArama_islemKalemAdi.sendKeys("VEMP");
    }

    @And("Arama Cubuguna HDI-TCKN girisi yapilir")
    public void aramaCubugunaHDITCKNGirisiYapilir() {
        homePage.aramaKriterleri_input.sendKeys(ConfigReader.getProperty("hdiTCKN"));
        ReusableMethods.bekle(1);
    }


    @And("Doktor secilir - Basak Aksu")
    public void doktorSecilirBasakAksu() {
        provizyonIslemleri.doktor_basakAksu.click();
    }

    @And("Tani Girisi alanina kod girilir- Gebelik")
    public void taniGirisiAlaninaKodGirilirGebelik() {
        provizyonIslemleri.taniGirisi_input.sendKeys("O2");
        ReusableMethods.bekle(2);
    }

    @Then("Tani kodu gebelik oldugunda ekranda bulunan Sikayet Baslangic tarihinin -Son Adet Tarihi- olarak degistigi gorulur")
    public void taniKoduGebelikOldugundaEkrandaBulunanSikayetBaslangicTarihininSonAdetTarihiOlarakDegistigiGorulur() {
        String actualText = provizyonIslemleri.sikayet_sonAdetTarihi.getText();
        Assert.assertTrue(actualText.contains("Adet"));

    }

    @And("Tani Girisi alanina kod girilir - Karisik tip bunalti ve depresyon bozuklugu")
    public void taniGirisiAlaninaKodGirilirKarisikTipBunaltiVeDepresyonBozuklugu() {
        provizyonIslemleri.taniGirisi_input.sendKeys("F412");
        ReusableMethods.bekle(2);
    }

    @And("Doktor secilir- Ayse Bayram Selcuk")
    public void doktorSecilirAyseBayramSelcuk() {
        provizyonIslemleri.doktor_ayseBayramSelcuk.click();
    }

    @And("Tani Girisi alanina kod girilir - Dis gelisim bozuklugu tanimlanmamis -")
    public void taniGirisiAlaninaKodGirilirDisGelisimBozukluguTanimlanmamis() {
        provizyonIslemleri.taniGirisi_input.sendKeys("K009");
        ReusableMethods.bekle(2);
    }

    @And("İslem Kalem Alanina metin girilir - Ortodonti tedavisi - metal braket")
    public void islemKalemAlaninaMetinGirilirOrtodontiTedavisiMetalBraket() {
        provizyonIslemleri.islemKalemAdi_input.sendKeys("Ortodonti tedavisi / metal braket");
        ReusableMethods.bekle(1);
    }

    @And("İkinci siradaki islem kalemine tiklanir")
    public void ikinciSiradakiIslemKalemineTiklanir() {
        provizyonIslemleri.islemKalemi_Ekle_2.click();
    }

    @And("Sayfa ilgili Kaldir elementine kaydirilir")
    public void sayfaIlgiliKaldirElementineKaydirilir() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView();", provizyonIslemleri.eklenen_islem_kalem_listesi_kaldir);
        ReusableMethods.bekle(1);
    }

    @And("Asi-İlac adi alanina giris yapilir - coraspin")
    public void asiIlacAdiAlaninaGirisYapilirCoraspin() {
        provizyonIslemleri.asi_ilacAdi_input.sendKeys("coraspin");
        ReusableMethods.bekle(1);
    }
}
