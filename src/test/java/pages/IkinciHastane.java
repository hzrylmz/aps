package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IkinciHastane {
    public IkinciHastane(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[text()=' Devam '])[2]")
    public WebElement tamamlayiciSaglikSigortasi;

    @FindBy(xpath = "//div[text()=' Medula Numarası ']")
    public WebElement medulaNumarasiTitle;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement sgk_radioButton_Yok;

    @FindBy(xpath = "//div[text()=' Sgk kullanmadan devam ediyorsunuz. Onaylıyor musunuz? ']")
    public WebElement sgkPopUpmesaji;

    @FindBy(xpath = "//button[text()=' EVET ']")
    public WebElement sgkUyariPopup_evet;

    @FindBy(xpath = "//bp-dropdown[@id='doctorName']//a[contains(.,'Seç')]")
    public WebElement doktor_secimi_dropdown_secBtn_medula;

    @FindBy(xpath = "//div[text()=' Diğer ']")
    public WebElement sgk_kullanilamama_nedeni_Diger;

    @FindBy(xpath = "//div[text()=' SGK Anlaşmasız Hekim / Dış Hekim ']")
    public WebElement sgk_kullanilamama_nedeni_anlasmasizHekim_disHekim;

    @FindBy(xpath = "//div[text()=' SGK Güvencesi Yok / Müstehak Değil ']")
    public WebElement sgk_kullanilamama_nedeni_sgkGuvencesiYok_mustehakDegil;

    @FindBy(xpath = "(//button[text()=' Devam '])[2]")
    public WebElement grupSaglikSigortasi;

    @FindBy(xpath = "//div[text()=' SGK kullanılmadan talep edilen işlemler kapsam dışıdır. ']")
    public WebElement uyariMesaji_SGK_kullanilmadan_talep_edilen_islemler_kapsam_disidir;

    @FindBy(xpath = "(//button[text()=' Görüntüle '])[1]")
    public WebElement ilkSiradaki_goruntule;

    @FindBy(xpath = "//input[@name='chcBox']")
    public WebElement eklenen_islem_kalemi_listesi_ilkKayit;

    @FindBy(xpath = "//td[@id='thRULEHCDESC']")
    public WebElement statuAciklamasi;

    @FindBy(xpath = "//input[@id='thAddedItemRequestedPrice0_numericinput']")
    public WebElement eklenen_islem_kalemi_listesi_talepEdilenTutar;













}
