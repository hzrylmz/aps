package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DetayliIslemKalemiArama {
    public DetayliIslemKalemiArama(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='itemDesc_input']")
    public WebElement detayliIslemKalemiArama_islemKalemAdi;

    @FindBy(xpath = "//input[@id='itemSutCode_input']")
    public WebElement detayliIslemKalemiArama_sutKodu;

    @FindBy(xpath = "//input[@id='itemHuvCode_input']")
    public WebElement detayliIslemKalemiArama_huvKodu;

    @FindBy(xpath = "(//button[@class='btn btn-info float-right ml-2'])[2]")
    public WebElement detayliIslemKalemiArama_AraBtn;

    @FindBy(xpath = "(//button[@id='_btn'])[1]")
    public WebElement detayliIslemKalemiArama_islemKalemiEkle;

    @FindBy(xpath = "//input[@id='itemDesc_input']")
    public WebElement sarfMalzemeAdi_input;





}
