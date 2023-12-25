package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[text()='Ana Sayfa']")
    public WebElement anaSayfaBtn;
    @FindBy(xpath = "//div[@class='row']//span[contains(.,'Provizyon İşlemleri')]")
    public WebElement provizyonIslemleriBtn;

    @FindBy(xpath = "//div[@class='row']//span[contains(.,'Yeni Provizyon Talebi')]")
    public WebElement yeniProvizyonTalebiBtn;

    @FindBy(xpath = "//input[@id='_input']")
    public WebElement aramaKriterleri_input;

    @FindBy(xpath = "(//button[@id='_btn'])[1]")
    public WebElement aramaKriterleri_araBtn;

    @FindBy(xpath = "//div[@class='user-name ng-star-inserted']")
    public WebElement profil_ismi;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logout;

    @FindBy(xpath = "//a[@class='sidebar-toggle']")
    public WebElement hamburger_menu;

    @FindBy(xpath = "//span[@id='btnCardMenuItem' and text()=' Provizyon Takibi / Güncelleme ']")
    public WebElement provizyonTakibi_guncelleme;

    @FindBy(xpath = "//input[@id='name_numericinput']")
    public WebElement provizyonNumarasi_input;

    @FindBy(xpath = "(//td[@id='thIdNumberValue'])[2]")
    public WebElement getAramaSonuclari_tckn_vkn;

    @FindBy(xpath = "(//td[@id='thCLAIMID'])[2]")
    public WebElement aramaSonuclari_provizyon;

    @FindBy(xpath = "(//input[@id='dbBeginDate_input'])[1]")
    public WebElement provizyonKayitTarihiAraligi_ilkKisim;

    @FindBy(xpath = "(//input[@id='dbBeginDate_input'])[2]")
    public WebElement provizyonKayitTarihiAraligi_ikinciKisim;

    @FindBy(xpath = "//input[@id='name_input']")
    public WebElement kisiSorgulama_input;

    @FindBy(xpath = "//button[contains(.,\"Excel'e Aktar\")]")
    public WebElement exceleAktar;

    @FindBy(xpath = "//a[text()='Hepsi ']")
    public WebElement provizyonDurumu_hepsi;

    @FindBy(xpath = "//div[text()=' Beklemede ']")
    public WebElement provizyonDurumu_Beklemede;

    @FindBy(xpath = "//div[@class='container dropdown-menu show']/div[@class='container']/div[contains(.,'Ret')]")
    public WebElement provizyonDurumu_Ret;

    @FindBy(xpath = "(//a[text()=' 1 '])[2]")
    public WebElement bugun_kaydedilen_provizyonlar_sayfa1;

    @FindBy(xpath = "//div[text()=' Sigortalı için bugün kaydedilen provizyonlar: ']")
    public WebElement sigortali_icin_bugun_kaydedilen_provizyonlar_title;

    @FindBy(xpath = "//ngb-datepicker-month-view[1]//div[@class='ngb-dp-day ng-star-inserted']/div[.='1']")
    public WebElement ayin_ilk_gunu;

    @FindBy(xpath = "//div[@style='position:absolute; right: 10px;']")
    public WebElement sagAltMiktar;

    @FindBy(xpath = "(//button[text()=' Güncelle '])[1]")
    public WebElement arama_sonuclari_birinci_guncelle;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement arama_sonuclari_provizyonDurumu;







}
