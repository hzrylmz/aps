Feature: Anasayfa Islemleri
  Background: Basarili Bir Sekilde Login Olunmasi
    Given APS Giris ekranina gidilir
    Then Login Olunur


    Scenario: TC-34) Provizyon Takibi - Arama Hatasi
      And Provizyon Islemleri butonuna tiklanir
      And Provizyon Takibi-Guncelleme butonuna tiklanir
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      Then  Ekranda -Uyari: Sorgulama yapmak istediginiz tarih araligini seciniz veya provizyon numarasini giriniz!- uyarisinin alindigi gorulur


    Scenario: TC-35) Provizyon Takibi - Arama Hatasi
      And Provizyon Islemleri butonuna tiklanir
      And Provizyon Takibi-Guncelleme butonuna tiklanir
      And Provizyon Numarasi alanina provizyon no girisi yapilir
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      Then İlgili provizyonun ekranda listelendigi gorulur


    Scenario: TC-36) TCKN ile Arama
      And Provizyon Islemleri butonuna tiklanir
      And Provizyon Takibi-Guncelleme butonuna tiklanir
      And Provizyon Kayit Tarihi olarak ayin ilk gunu secilir
      And Kisi Sorgulama Alanina TCKN girisi yapilir
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Sayfa sag alttaki miktara kaydirilir
      And İlgili TCKN nin ekranda listelendigi gorulur


    Scenario: TC-37) Provizyon Bilgilerini Excel ile export etme
      And Provizyon Islemleri butonuna tiklanir
      And Provizyon Takibi-Guncelleme butonuna tiklanir
      And Provizyon Numarasi alanina provizyon no girisi yapilir
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Ekranda bulunan -Excele Aktar- butonuna tiklanir ve Excel dosyasinin export edildigi gorulur


    Scenario: TC-38) Provizyon Kaydinin Guncellenmesi
      And Provizyon Islemleri butonuna tiklanir
      And Provizyon Takibi-Guncelleme butonuna tiklanir
      And Provizyon Kayit Tarihi olarak ayin ilk gunu secilir
      And Kisi Sorgulama Alanina TCKN girisi yapilir
      And Provizyon Durumu secilir - Beklemede
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Arama sonuclari - Ekranda ilk listelenen kayit icin -Guncelle- butonuna tiklanir
      And Asi-İlac tabina tiklanir
      And Asi-İlac adi alanina giris yapilir - coraspin
      And Asi-İlac Adi Ara butonuna tiklanir
      And Arama sonucu gelen ekrana ilac adet bilgisi girilir
      And Ilac adedi eklemek icin Ekle butonuna tiklanir
      And Sayfa ilgili Kaydet elementine kaydirilir
      When Kaydet butonuna tiklandiginda






