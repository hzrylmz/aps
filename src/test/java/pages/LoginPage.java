package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='txtUsername_input']")
    public WebElement kullaniciAdi;

    @FindBy(xpath = "//input[@id='psPassword_input']")
    public WebElement sifre;

    @FindBy(xpath = "//button[@id='btnLogin_btn']")
    public WebElement GirisBtn;

    @FindBy(xpath = "//div[text()=' Giriş Ekranı ']")
    public WebElement girisEkraniTitle;





}