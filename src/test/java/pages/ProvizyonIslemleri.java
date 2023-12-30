package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProvizyonIslemleri {

    public ProvizyonIslemleri(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@id='_btn'])[2]")
    public WebElement ilkSiradakiDevamBtn;

    @FindBy(xpath = "(//button[@class='btn btn-sm'])[1]")
    public WebElement doktorAdi_sec_dropdownBtn;

    @FindBy(xpath = "//button[@id='BTN-selectRegisteredDoctor_btn']")
    public WebElement DoktorSecimi_SecBtn;

    @FindBy(xpath = "//div[@class='container dropdown-menu show']/div[@class='container']/div[contains(.,'ZERRİN BOYACI')]")
    public WebElement doktor_zerrinBoyaci;

    @FindBy(xpath = "//div[@class='container dropdown-menu show']/div[@class='container']/div[contains(.,'BAŞAK BAKSU')]")
    public WebElement doktor_basakAksu;

    @FindBy(xpath = "//div[@class='container dropdown-menu show']/div[@class='container']/div[contains(.,'AYŞE SELÇUK BAYRAM')]")
    public WebElement doktor_ayseBayramSelcuk;

    @FindBy(xpath = "//div[@class='container dropdown-menu show']/div[@class='container']/div[contains(.,'NALAN SARAÇ')]")
    public WebElement doktor_nalanSarac;

    @FindBy(xpath = "//div[@class='container dropdown-menu show']/div[@class='container']/div[contains(.,'ALİ KEMAL ULAŞ')]")
    public WebElement doktor_aliKemalUlas;

    @FindBy(xpath = "//div[@class='container dropdown-menu show']/div[@class='container']/div[contains(.,'SEHER SARI')]")
    public WebElement doktor_seherSari;

    @FindBy(xpath = "//div[@class='container dropdown-menu show']//div[26]")
    public WebElement doktor_ilyasTarikKatirci;

    @FindBy(xpath = "//div[@class='container dropdown-menu show']//div[3]")
    public WebElement doktor_nezihAkgun;

    @FindBy(xpath = "//textarea[@id='complaintDesc_input']")
    public WebElement sikayet_metin_alani;

    @FindBy(xpath = "//input[@id='complaintDate_input']")
    public WebElement sikayetTarihi_InputAlani;

    @FindBy(xpath = "//div[@class='ngb-dp-day ngb-dp-today ng-star-inserted']")
    public WebElement bugununTarihi;

    @FindBy(xpath = "//input[@id='lastMenstrualDate_input']")
    public WebElement sonAdetTarihi;

    @FindBy(xpath = "//input[@id='icd10_input']")
    public WebElement taniGirisi_input;

    @FindBy(xpath = "//div[text()=' Tanı Girişi '] ")
    public WebElement taniGirisi_title;

    @FindBy(xpath = "//button[text()='Ekle']")
    public WebElement taniKodu_EkleBtn;

    @FindBy(xpath = "//button[text()='Kaldır']")
    public WebElement taniKodu_KaldirBtn;

    @FindBy(xpath = "//button[text()='Kaydet']")
    public WebElement taniGirisi_KaydetBtn;

    @FindBy(xpath = "//div[text()=' Aşı / İlaç ']")
    public WebElement tab_asi_Ilac;

    @FindBy(xpath = "//bp-textbox[1]//input[@id='_input']")
    public WebElement asi_ilacAdi_input;

    @FindBy(xpath = "//button[@class='btn btn-info float-right ml-2']")
    public WebElement asi_ilacAdi_islemKalemi_araBtn;

    @FindBy(xpath = "//input[@id='thAmount0_numericinput']")
    public WebElement asi_ilac_adet;

    @FindBy(xpath = "//button[@id='_btn']")
    public WebElement ilac_adedi_islemKalemi_Ekle;

    @FindBy(xpath = "//tr[3]//button[@id='_btn']")
    public WebElement islemKalemi_Ekle_2;

    @FindBy(xpath = "//button[text()='Kaydet']")
    public WebElement islemKalemi_KaydetBtn;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement ret_statusu_hata_mesaji;

    @FindBy(xpath = "//input[@id='inputItem0_input']")
    public WebElement islemKalemAdi_input;

    @FindBy(xpath = "//button[text()='Provizyon Formu Bas']")
    public WebElement provizyonFormuBasBtn;

    @FindBy(xpath ="//button[text()=' Kaldır ']" )
    public WebElement eklenen_islem_kalem_listesi_kaldir;

    @FindBy(xpath = "//button[text()='Aradığımı Bulamadım ']")
    public WebElement aradigimiBulamadimBtn;

    @FindBy(xpath = "//div[@class='alert alert-info']")
    public WebElement provizyonOlusmaInfo;

    @FindBy(xpath = "//bp-radiobutton[@id='rdjudicialCase']//div[2]/input[@class='form-check-input']")
    public WebElement adliVaka_EvetRadiobox;

    @FindBy(xpath = "//a[contains(.,'Seç')]")
    public WebElement sec_dropdown;

    @FindBy(xpath = "//div[@class='container dropdown-menu show']/div[@class='container']/div[contains(.,'Sigortali Beyani')]")
    public WebElement dosyaTipi_sigortaliBeyani;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement adliVaka_dosyaUploadBtn;

    @FindBy(xpath = "(//div[@role='alert'])[1]")
    public WebElement ilgili_provizyon_mesaji;

    @FindBy(xpath = "(//input[@class='form-check-input'])[2]")
    public WebElement kayitli_olmayan_doktor;

    @FindBy(xpath = "//input[@id='doctorCertificateNumber_input']")
    public WebElement diplomaNo_input;

    @FindBy(xpath = "//button[@id='BTN-getDoctorList_btn']")
    public WebElement doktorDiplomaNo_AraBtn;

    @FindBy(xpath = "//button[@class='btn btn-sm']")
    public WebElement doktorBransi_sec_dropdown;

    @FindBy(xpath = "//div[@class='container dropdown-menu show']/div[@class='container']/div[contains(.,'Aile Hekimi')]")
    public WebElement doktorBransi_aileHekimi;

    @FindBy(xpath = "//button[@class='btn btn-bp-success btn-sm']")
    public WebElement kayitliOlmayanDoktor_sec_Btn;

    @FindBy(xpath = "//input[@id='thAddedItemRequestedPrice0_numericinput']")
    public WebElement anlasmaliKurumTutari;

    @FindBy(xpath = "//div[@class='container dropdown-menu show']/div[@class='container']/div[contains(.,'Sgk')]")
    public WebElement eklenenIsKalemiListesi_Aciklama_SGK;

    @FindBy(xpath = "//div[@class='container dropdown-menu show']/div[@class='container']/div[contains(.,'Kampanyalı Fiyat')]")
    public WebElement eklenenIsKalemiListesi_Aciklama_KampanyaliFiyat;

    @FindBy(xpath = "//button[text()=' Güncelle ']")
    public WebElement eklenenIsKalemiListesi_Guncelle_Btn;

    @FindBy(xpath = "//div[text()=' Bu alanın doldurulması zorunludur. ']")
    public WebElement sikayetTarihiHatasi;

    @FindBy(xpath = "//div[@class='col d-flex justify-content-center py-2 bp-tab-div-active']")
    public WebElement sarfMalzeme;

    @FindBy(xpath = "(//div[@id='top'])[8]")
    public WebElement sikayet_sonAdetTarihi;

    @FindBy(xpath = "//input[@id='thAddedItemAmount0_numericinput']")
    public WebElement eklenenIslemKalemiListesi_adet;
















}
