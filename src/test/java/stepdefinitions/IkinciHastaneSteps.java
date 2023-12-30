package stepdefinitions;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class IkinciHastaneSteps extends TestBase {
    @And("Kullanici Kodu dogru sekilde girilir - İkinci Hastane")
    public void kullaniciKoduDogruSekildeGirilirIkinciHastane() {
        loginPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("ikinciHastaneKullaniciKodu"));

    }

    @And("Arama Cubuguna TCKN girisi yapilir -Sedanur")
    public void aramaCubugunaTCKNGirisiYapilirSedanur() {
        homePage.aramaKriterleri_input.sendKeys(ConfigReader.getProperty("sedanurTCKN"));
        ReusableMethods.bekle(1);
    }

    @And("Police listesinden -Tamamlayici Saglik Sigortasi- olan police secilir")
    public void policeListesindenTamamlayiciSaglikSigortasiOlanPoliceSecilir() {
        ikinciHastane.tamamlayiciSaglikSigortasi.click();
        ReusableMethods.bekle(1);
    }

    @Then("Medula Numara alaninin onyuze geldigi gorulur")
    public void medulaNumaraAlanininOnyuzeGeldigiGorulur() {
        ikinciHastane.medulaNumarasiTitle.isDisplayed();
    }

    @And("SGK tercihi -Yok- olarak degistirilir")
    public void sgkTercihiYokOlarakDegistirilir() {
        ikinciHastane.sgk_radioButton_Yok.click();
        ReusableMethods.bekle(1);
    }

    @Then("-Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesajinin ciktigi gorulur")
    public void sgkKullanmadanDevamEdiyorsunuzOnayliyorMusunuzMesajininCiktigiGorulur() {
        ikinciHastane.sgkPopUpmesaji.isDisplayed();
    }

    @And("Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesaji EVET secilir")
    public void sgkKullanmadanDevamEdiyorsunuzOnayliyorMusunuzMesajiEVETSecilir() {
        ikinciHastane.sgkUyariPopup_evet.click();
        ReusableMethods.bekle(1);
    }

    @And("Doktor secilir - Nalan Sarac")
    public void doktorSecilirNalanSarac() {
        provizyonIslemleri.doktor_nalanSarac.click();
    }

    @And("Tani Girisi alanina kod girilir - Migren")
    public void taniGirisiAlaninaKodGirilirMigren() {
        provizyonIslemleri.taniGirisi_input.sendKeys("G43");
        ReusableMethods.bekle(2);
    }

    @Then("-Kaydetme islemini gerceklestirebilmek icin SGK Kullanilmama Nedenini secmelisiniz- mesajinin geldigi gorulur")
    public void kaydetmeIsleminiGerceklestirebilmekIcinSGKKullanilmamaNedeniniSecmelisinizMesajininGeldigiGorulur() {
        ReusableMethods.bekle(1);
        WebElement alertMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alertdialog']"));
        Assert.assertTrue(ReusableMethods.waitForVisibility((alertMessage),2).isDisplayed());

        String alertM= alertMessage.getText();
        Assert.assertTrue(alertM.contains("Kaydetme işlemini gerçekleştirebilmek için SGK Kullanılmama Nedenini seçmelisiniz"));
    }

    @And("Doktor Secimi icin sec dropdown ina tiklanir - Medula")
    public void doktorSecimiIcinSecDropdownInaTiklanirMedula() {
        ikinciHastane.doktor_secimi_dropdown_secBtn_medula.click();
        ReusableMethods.bekle(1);
    }

    @And("SGK kullanmama nedeni seçilir -Diger")
    public void sgkKullanmamaNedeniSecilirDiger() {
        ikinciHastane.sgk_kullanilamama_nedeni_Diger.click();
        ReusableMethods.bekle(1);
    }

    @And("Doktor secilir - Ali Kemal Ulas")
    public void doktorSecilirAliKemalUlas() {
        provizyonIslemleri.doktor_aliKemalUlas.click();
    }

    @And("Tani Girisi alanina kod girilir- Akut larengofarenjit")
    public void taniGirisiAlaninaKodGirilirAkutLarengofarenjit() {
        provizyonIslemleri.taniGirisi_input.sendKeys("J060");
        ReusableMethods.bekle(2);
    }

    @And("İslem Kalem Alanina metin girilir - C reaktif protein \\(CRP)")
    public void islemKalemAlaninaMetinGirilirCReaktifProteinCRP() {
        provizyonIslemleri.islemKalemAdi_input.sendKeys("C reaktif protein (CRP)");
        ReusableMethods.bekle(1);

    }

    @And("Arama Cubuguna TCKN girisi yapilir - Ugur Ahmet")
    public void aramaCubugunaTCKNGirisiYapilirUgurAhmet() {
        homePage.aramaKriterleri_input.sendKeys(ConfigReader.getProperty("ugurAhmetTCKN"));
        ReusableMethods.bekle(1);

    }

    @And("Police listesinden -grup saglik sigortasi- olan police secilir")
    public void policeListesindenGrupSaglikSigortasiOlanPoliceSecilir() {
        ikinciHastane.grupSaglikSigortasi.click();
        ReusableMethods.bekle(2);

    }

    @Then("SGK kullanilmadan talep edilen islemler kapsam disidir- uyari mesajinin alindigi gorulur")
    public void sgkKullanilmadanTalepEdilenIslemlerKapsamDisidirUyariMesajininAlindigiGorulur() {
        ikinciHastane.uyariMesaji_SGK_kullanilmadan_talep_edilen_islemler_kapsam_disidir.isDisplayed();
    }

    @And("SGK kullanmama nedeni seçilir - SGK Anlasmasiz Hekim  Dis Hekim")
    public void sgkKullanmamaNedeniSecilirSGKAnlasmasizHekimDisHekim() {
        ikinciHastane.sgk_kullanilamama_nedeni_anlasmasizHekim_disHekim.click();
        ReusableMethods.bekle(1);
    }

    @Then("-Uyari: Tanimli olan anlasmali tutardan yuksek tutar girisi yapilamaz.- mesajinin geldigi gorulur")
    public void uyariTanimliOlanAnlasmaliTutardanYuksekTutarGirisiYapilamazMesajininGeldigiGorulur() {
        ReusableMethods.bekle(1);
        WebElement alertMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alertdialog']"));
        Assert.assertTrue(ReusableMethods.waitForVisibility((alertMessage),2).isDisplayed());

        String alertM= alertMessage.getText();
        Assert.assertTrue(alertM.contains("Tanımlı olan anlaşmalı tutardan yüksek tutar girişi yapılamaz"));
        ReusableMethods.bekle(2);
    }

    @And("Eklen İslem Kalemi Listesi - Adet alani degistirilir")
    public void eklenIslemKalemiListesiAdetAlaniDegistirilir() {
        provizyonIslemleri.eklenenIslemKalemiListesi_adet.sendKeys("12");
    }

    @Then("-Uyari: Ayni islem kaleminden birden fazla giris yapilmak istenmistir. Bu islem kalemi icin sadece iki adet talep edebilirsiniz- mesajinin verildigi gorulur")
    public void uyariAyniIslemKalemindenBirdenFazlaGirisYapilmakIstenmistirBuIslemKalemiIcinSadeceIkiAdetTalepEdebilirsinizMesajininVerildigiGorulur() {
        ReusableMethods.bekle(1);
        WebElement alertMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alertdialog']"));
        Assert.assertTrue(ReusableMethods.waitForVisibility((alertMessage),2).isDisplayed());

        String alertM= alertMessage.getText();
        Assert.assertTrue(alertM.contains(" Bu işlem kalemi için sadece 1 adet talep edebilirsiniz"));
        ReusableMethods.bekle(2);
    }

    @And("Detayli İslem Kalemi Arama ekranindaki İslem Kalem Adi alanina metin girisi yapilir- LAB CRP AFIAS")
    public void detayliIslemKalemiAramaEkranindakiIslemKalemAdiAlaninaMetinGirisiYapilirLABCRPAFIAS() {
        detayliIslemKalemiArama.detayliIslemKalemiArama_islemKalemAdi.sendKeys("LAB CRP AFIAS");
    }

    @Then("-Uyari: TSS policelerde islem kalem alanindan giris yapilmalidir-  mesajinin verildigi gorulur")
    public void uyariTSSPolicelerdeIslemKalemAlanindanGirisYapilmalidirMesajininVerildigiGorulur() {
        ReusableMethods.bekle(1);
        WebElement alertMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alertdialog']"));
        Assert.assertTrue(ReusableMethods.waitForVisibility((alertMessage),2).isDisplayed());

        String alertM= alertMessage.getText();
        Assert.assertTrue(alertM.contains("TSS poliçelerde işlem kalem alanından giriş yapılmalıdır"));
        ReusableMethods.bekle(2);
    }

    @And("Kisi Sorgulama Alanina TCKN girisi yapilir -ugurAhmetTCKN")
    public void kisiSorgulamaAlaninaTCKNGirisiYapilirUgurAhmetTCKN() {
        homePage.kisiSorgulama_input.sendKeys(ConfigReader.getProperty("ugurAhmetTCKN"));
        ReusableMethods.bekle(1);
    }

    @And("Provizyon Durumu secilir - Ret")
    public void provizyonDurumuSecilirRet() {
        homePage.provizyonDurumu_hepsi.click();
        ReusableMethods.bekle(1);
        homePage.provizyonDurumu_Ret.click();
        ReusableMethods.bekle(2);
    }

    @And("Ilk siradaki goruntule butonuna tiklanir")
    public void ilkSiradakiGoruntuleButonunaTiklanir() {
        ikinciHastane.ilkSiradaki_goruntule.click();
        ReusableMethods.bekle(1);
    }

    @And("Eklenen Islem kalemi listesinde bulunan kayit secilir")
    public void eklenenIslemKalemiListesindeBulunanKayitSecilir() {
        ikinciHastane.eklenen_islem_kalemi_listesi_ilkKayit.click();
    }

    @And("Eklenen Islem kalemi Listesi- Kaldir butonuna tiklanir")
    public void eklenenIslemKalemiListesiKaldirButonunaTiklanir() {
        provizyonIslemleri.eklenen_islem_kalem_listesi_kaldir.click();
    }

    @Then("-Uyari: Red veya bekleme statulu islem kalemlerini kaldiramazsiniz- mesajinin verildigi gorulur")
    public void uyariRedVeyaBeklemeStatuluIslemKalemleriniKaldiramazsinizMesajininVerildigiGorulur() {
        ReusableMethods.bekle(1);
        WebElement alertMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alertdialog']"));
        Assert.assertTrue(ReusableMethods.waitForVisibility((alertMessage),2).isDisplayed());

        String alertM= alertMessage.getText();
        Assert.assertTrue(alertM.contains("Red veya bekleme statülü işlem kalemlerini kaldıramazsınız"));
        ReusableMethods.bekle(2);
    }

    @And("Arama sonuclari - Ekranda ilk listelenen kayit icin -Guncelle- butonuna tiklanir - Ret icin")
    public void aramaSonuclariEkrandaIlkListelenenKayitIcinGuncelleButonunaTiklanirRetIcin() {
        ikinciHastane.ilkSiradaki_goruntule.click();
        ReusableMethods.bekle(1);
    }

    @Then("-Uyari: Ilgili islem kalemi icin Medula Takip Numarasina ekleme yapildiktan sonra, provizyon guncelleme alanindan Medula Bilgilerini Al butonu ile ekleme yapilmalidir.- mesajinin verildigi gorulur")
    public void uyariIlgiliIslemKalemiIcinMedulaTakipNumarasinaEklemeYapildiktanSonraProvizyonGuncellemeAlanindanMedulaBilgileriniAlButonuIleEklemeYapilmalidirMesajininVerildigiGorulur() {
        ReusableMethods.bekle(1);
        WebElement alertMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alertdialog']"));
        Assert.assertTrue(ReusableMethods.waitForVisibility((alertMessage),2).isDisplayed());

        String alertM= alertMessage.getText();
        Assert.assertTrue(alertM.contains("İlgili işlem kalemi için Medula Takip Numarasına ekleme yapıldıktan sonra, provizyon güncelleme alanından"));
        ReusableMethods.bekle(2);
    }

    @And("İslem Kalem Alanina metin girilir - vitamin D")
    public void islemKalemAlaninaMetinGirilirVitaminD() {
        provizyonIslemleri.islemKalemAdi_input.sendKeys("vitamin D");
        ReusableMethods.bekle(1);
    }

    @Then("Hata almadan eklenebildigi gorulur")
    public void hataAlmadanEklenebildigiGorulur() {
        ikinciHastane.eklenen_islem_kalemi_listesi_ilkKayit.isDisplayed();
    }

    @And("Arama Cubuguna TCKN girisi yapilir - Ecem Koc")
    public void aramaCubugunaTCKNGirisiYapilirEcemKoc() {
        homePage.aramaKriterleri_input.sendKeys(ConfigReader.getProperty("ecemKocTCKN"));
        ReusableMethods.bekle(1);
    }

    @And("Doktor secilir - Seher Sari")
    public void doktorSecilirSeherSari() {
        provizyonIslemleri.doktor_seherSari.click();
    }

    @And("Son Adet Tarihi islem gununun iki ay oncesi secilir")
    public void sonAdetTarihiIslemGunununIkiAyOncesiSecilir() {
        provizyonIslemleri.sonAdetTarihi.sendKeys("10/10/2023");
        ReusableMethods.bekle(1);
    }

    @And("Ret mesajinin -Sifir onalti yas sigortalida gebelik tanisi ile onay alinamaz- statu aciklamasinin alindigi gorulur")
    public void retMesajininSifirOnaltiYasSigortalidaGebelikTanisiIleOnayAlinamazStatuAciklamasininAlindigiGorulur() {
        String actualText = ikinciHastane.statuAciklamasi.getText();

        Assert.assertTrue(actualText.contains("0-16 Yaş sigortalıda gebelik tanısı ile onay alınamaz."));
        ReusableMethods.bekle(2);
    }

    @And("Doktor secilir -Nezih Akgun")
    public void doktorSecilirNezihAkgun() {
        provizyonIslemleri.doktor_nezihAkgun.click();
    }

    @And("İslem Kalem Alanina metin girilir - Cocuk kardiolojisi muayenesi")
    public void islemKalemAlaninaMetinGirilirCocukKardiolojisiMuayenesi() {
        provizyonIslemleri.islemKalemAdi_input.sendKeys("Çocuk kardiolojisi muayenesi");
        ReusableMethods.bekle(1);
    }

    @Then("RET mesajinin -Yetiskin kisiler icin cocuk hastaliklari branslari kapsam disidir- oldugu gorulur")
    public void retMesajininYetiskinKisilerIcinCocukHastaliklariBranslariKapsamDisidirOlduguGorulur() {
        String actualText = ikinciHastane.statuAciklamasi.getText();

        Assert.assertTrue(actualText.contains("Yetişkin kişiler için çocuk hastalıkları branşları kapsam dışıdır"));
        ReusableMethods.bekle(2);
    }

    @And("Tani Girisi alanina kod girilir- Ameliyat Yarasinin acilmasi baska yerde siniflanmamis")
    public void taniGirisiAlaninaKodGirilirAmeliyatYarasininAcilmasiBaskaYerdeSiniflanmamis() {
        provizyonIslemleri.taniGirisi_input.sendKeys("T813");
        ReusableMethods.bekle(2);
    }

    @And("İslem Kalem Alanina metin girilir - Fizik tedavi ve rehabilitasyon A grubunda yer alan hastaliklar")
    public void islemKalemAlaninaMetinGirilirFizikTedaviVeRehabilitasyonAGrubundaYerAlanHastaliklar() {
        provizyonIslemleri.islemKalemAdi_input.sendKeys("Fizik tedavi ve rehabilitasyon A grubunda yer alan hastalıklar");
        ReusableMethods.bekle(1);
    }

    @Then("RET mesajinin -Fizik Tedavi talepleriniz icin OTS PLUS uzerinden basvuru yaparak ilerleyiniz.- oldugu gorulur")
    public void retMesajininFizikTedaviTaleplerinizIcinOTSPLUSUzerindenBasvuruYaparakIlerleyinizOlduguGorulur() {
        String actualText = ikinciHastane.statuAciklamasi.getText();

        Assert.assertTrue(actualText.contains("Fizik Tedavi talepleriniz için OTS PLUS üzerinden başvuru yaparak ilerleyiniz"));
        ReusableMethods.bekle(2);
    }

    @And("Tani Girisi alanina kod girilir- Fiziksel tedavi diger")
    public void taniGirisiAlaninaKodGirilirFizikselTedaviDiger() {
        provizyonIslemleri.taniGirisi_input.sendKeys("Z501");
        ReusableMethods.bekle(2);
    }

    @And("İslem Kalem Alanina metin girilir - Apendiks, insidental \\(asil ameliyata ek), patolojik inceleme")
    public void islemKalemAlaninaMetinGirilirApendiksInsidentalAsilAmeliyataEkPatolojikInceleme() {
        provizyonIslemleri.islemKalemAdi_input.sendKeys("Apendiks, insidental (asıl ameliyata ek), patolojik inceleme");
        ReusableMethods.bekle(1);
    }

    @Then("RET mesajinin -Ilgili islem kalemi icin OTS Plus uzerinden basvuru yapmaniz gerekmektedir- oldugu gorulur")
    public void retMesajininIlgiliIslemKalemiIcinOTSPlusUzerindenBasvuruYapmanizGerekmektedirOlduguGorulur() {
        String actualText = ikinciHastane.statuAciklamasi.getText();

        Assert.assertTrue(actualText.contains("İlgili işlem kalemi için ''OTS Plus'' üzerinden başvuru yapmanız gerekmektedir"));
        ReusableMethods.bekle(2);
    }

    @And("Tani Girisi alanina kod girilir - Kalp hastaliklarinin diger formlari")
    public void taniGirisiAlaninaKodGirilirKalpHastaliklarininDigerFormlari() {
        provizyonIslemleri.taniGirisi_input.sendKeys("I3");
        ReusableMethods.bekle(2);
    }

    @And("Detayli İslem Kalemi Arama ekranindaki İslem Kalem Adi alanina metin girisi yapilir- \\(SAG KALP KATETERIZASYONU)")
    public void detayliIslemKalemiAramaEkranindakiIslemKalemAdiAlaninaMetinGirisiYapilirSAGKALPKATETERIZASYONU() {
        detayliIslemKalemiArama.detayliIslemKalemiArama_islemKalemAdi.sendKeys("SAĞ KALP KATETERİZASYONU");
    }

    @And("Eklene İslem Kalemi Listesi- Talep Edilen Tutar alani degistirilir")
    public void ekleneIslemKalemiListesiTalepEdilenTutarAlaniDegistirilir() {
        ikinciHastane.eklenen_islem_kalemi_listesi_talepEdilenTutar.sendKeys("10001");
    }

    @Then("Ekrana -Ilgili talep icin Provizyon Merkezi ile gorusulmelidir. Secilen islem kalemi icin provizyon merkezi ile gorusulmelidir.- mesajinin verildigi gorulur")
    public void ekranaIlgiliTalepIcinProvizyonMerkeziIleGorusulmelidirSecilenIslemKalemiIcinProvizyonMerkeziIleGorusulmelidirMesajininVerildigiGorulur() {
        String actualText = ikinciHastane.statuAciklamasi.getText();

        Assert.assertTrue(actualText.contains("İlgili talep için Provizyon Merkezi ile görüşülmelidir. Seçilen işlem kalemi için provizyon merkezi ile görüşülmelidir"));
        ReusableMethods.bekle(2);

    }
}
