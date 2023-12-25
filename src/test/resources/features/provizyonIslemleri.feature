
Feature: Provizyon Islemleri
  Background: Basarili Bir Sekilde Login Olunmasi
    Given APS Giris ekranina gidilir
    Then Login Olunur


    Scenario: TC-1) TCKN ile Ret Statusunde Provizyon Olusturma Kontrolu
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      And Arama Cubuguna TCKN girisi yapilir
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
      And Doktor Secimi icin sec dropdown ina tiklanir
      And Doktor Secilir - Zerrin Boyaci
      And Doktor Secimi Sec butonuna tiklanir
      And Sikayet alanina metin girisi yapilir
      And Sikayet Baslangic Tarihi secimi yapilir
      And Tani Girisi alanina kod girilir
      And Tani Kodu- Ekle butonuna tiklanir
      And Sayfa asagi kaydirilir
      And Tani Girisi- Kaydet butonuna tiklanir
      And Asi-İlac tabina tiklanir
      And Asi-İlac adi alanina giris yapilir - NASALEZE COLD
      And Asi-İlac Adi Ara butonuna tiklanir
      And Arama sonucu gelen ekrana ilac adet bilgisi girilir
      And Ilac adedi eklemek icin Ekle butonuna tiklanir
      And Sayfa ilgili Kaydet elementine kaydirilir
      When Kaydet butonuna tiklandiginda
      Then Ret statusunde hata mesaji alindigi gorulur
      Then LogOut yapilir


    Scenario: TC-2) TCKN ile Provizyon Olustuma- Form Basim Kontrolu
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      And Arama Cubuguna TCKN girisi yapilir
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
      And Doktor Secimi icin sec dropdown ina tiklanir
      And Doktor Secilir - Zerrin Boyaci
      And Doktor Secimi Sec butonuna tiklanir
      And Sikayet alanina metin girisi yapilir
      And Sikayet Baslangic Tarihi secimi yapilir
      And Tani Girisi alanina kod girilir - (Menengokokal menenjit)
      And Tani Kodu- Ekle butonuna tiklanir
      And Sayfa asagi kaydirilir
      And Tani Girisi- Kaydet butonuna tiklanir
      And İslem Kalem Alanina metin girilir - VEMP (Vestibuler Evoked Myojenik Potansiyaller)
      And İslem Kalemi Ara butonuna tiklanir
      And Ilac adedi eklemek icin Ekle butonuna tiklanir
      And Sayfa ilgili Kaydet elementine kaydirilir
      When Kaydet butonuna tiklandiginda
      And Sayfa ilgili Provizyon Formu Bas elementine kaydirilir
      #And Provizyon Formu Bas butonuna tiklanir
      #Then Form Basimi Yapildigi gorulur
      Then LogOut yapilir

    Scenario: TC-3) TCKN ile Bekleme Statusunde Provizyon Olusturma
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      #And Arama Cubuguna TCKN girisi yapilir
      And TCKN girisi yapilir - Bilgehan
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
      And Doktor Secimi icin sec dropdown ina tiklanir
      And Doktor Secilir - Zerrin Boyaci
      And Doktor Secimi Sec butonuna tiklanir
      And Sikayet alanina metin girisi yapilir
      And Sikayet Baslangic Tarihi secimi yapilir
      And Tani Girisi alanina kod girilir - (Kolera Vibrio cholorea, kolera tipine bagli)
      And Tani Kodu- Ekle butonuna tiklanir
      And Sayfa asagi kaydirilir
      And Tani Girisi- Kaydet butonuna tiklanir
      And Aradigimi Bulamadim butonuna tiklanir
      And Detayli İslem Kalemi Arama ekranindaki İslem Kalem Adi alanina metin girisi yapilir- (RADYOFREKANS)
      And Detayli İslem Kalemi Arama ekranindaki Ara butonuna tiklanir
      And Detayli İslem Kalemi Arama ekranindaki ilk sonuc Ekle butonuna tiklanir
      And Sayfa ilgili Kaydet elementine kaydirilir
      When Kaydet butonuna tiklandiginda
      Then Bekleme statusunde ilgili mesaj gorulur
      Then LogOut yapilir


    Scenario: TC-4) TCKN ile Provizyon Oluşturma - Adli Vaka
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      #And Arama Cubuguna TCKN girisi yapilir
      And TCKN girisi yapilir - Bilgehan
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
      And Doktor Secimi icin sec dropdown ina tiklanir
      And Doktor Secilir - Zerrin Boyaci
      And Doktor Secimi Sec butonuna tiklanir
      And Sikayet alanina metin girisi yapilir
      And Sikayet Baslangic Tarihi secimi yapilir
      And Sayfa ilgili Kaydet elementine kaydirilir
      And Adli Vaka Mi? seçenegi -Evet- olarak secilir
      And Sayfa ilgili Kaydet elementine kaydirilir
      And Sec butonuna tiklanir ve ilgili dosya secilir
      And Dosya tipi -Sigortali Beyani- olarak secilir
      And Yuklenen dosya icin -Kaydet- butonuna tiklanir
      And Tani Girisi alanina kod girilir - (Kolera Vibrio cholorea, kolera tipine bagli)
      And Tani Kodu- Ekle butonuna tiklanir
      And Sayfa asagi kaydirilir
      And Tani Girisi- Kaydet butonuna tiklanir
      And İslem Kalem Alanina metin girilir - VEMP (Vestibuler Evoked Myojenik Potansiyaller)
      And İslem Kalemi Ara butonuna tiklanir
      And Ilac adedi eklemek icin Ekle butonuna tiklanir
      And Sayfa ilgili Kaydet elementine kaydirilir
      When Kaydet butonuna tiklandiginda
      Then İlgili provizyon mesajinin alindigi gorulur
      Then LogOut yapilir


    Scenario: TC-5) TCKN ile Kayitli Olmayan Doktor ile Provizyon Olusturma
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      And Arama Cubuguna TCKN girisi yapilir
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
      And Kayitli Olmayan Doktor secilir
      And Doktor Diploma Numarasi girisi yapilir
      And Doktor Bransı Secimi icin Sec dropdown ina tiklanir
      And Doktor Bransi Secimi yapilir - aile hekimi
      And Doktor Diploma Numarasi - Ara butonuna tiklanir
      And Diploma Numarasi uzerinden doktor secimi yapilir
      And Scroll View Tani Girisi Kaydet butonuna kaydirilir
      And Sikayet alanina metin girisi yapilir
      And Sikayet Baslangic Tarihi secimi yapilir
      And Tani Girisi alanina kod girilir - (Menengokokal menenjit)
      And Tani Kodu- Ekle butonuna tiklanir
      And Sayfa asagi kaydirilir
      And Tani Girisi- Kaydet butonuna tiklanir
      And İslem Kalem Alanina metin girilir - VEMP (Vestibuler Evoked Myojenik Potansiyaller)
      And İslem Kalemi Ara butonuna tiklanir
      And Ilac adedi eklemek icin Ekle butonuna tiklanir
      And Sayfa ilgili Kaydet elementine kaydirilir
      When Kaydet butonuna tiklandiginda
      Then İlgili provizyon mesajinin alindigi gorulur
      Then LogOut yapilir

    Scenario: TC-6) TCKN ile Provizyon Olusturma-SUT Kodu Bilgisi
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      And Arama Cubuguna TCKN girisi yapilir
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
      And Doktor Secimi icin sec dropdown ina tiklanir
      And Doktor Secilir - Zerrin Boyaci
      And Doktor Secimi Sec butonuna tiklanir
      And Sikayet alanina metin girisi yapilir
      And Sikayet Baslangic Tarihi secimi yapilir
      And Tani Girisi alanina kod girilir - (Menengokokal menenjit)
      And Tani Kodu- Ekle butonuna tiklanir
      And Sayfa asagi kaydirilir
      And Tani Girisi- Kaydet butonuna tiklanir
      And Aradigimi Bulamadim butonuna tiklanir
      And Detayli İslem Kalemi Arama ekranindaki Sut Kodu alanina metin girisi yapilir -CDKan-
      And Detayli İslem Kalemi Arama ekranindaki Ara butonuna tiklanir
      And Detayli İslem Kalemi Arama ekranindaki ilk sonuc Ekle butonuna tiklanir
      And Sayfa ilgili Kaydet elementine kaydirilir
      And Anlasmali Kurum Tutari alanina giris yapilir
      And Eklenen İslem Kalemi Listesi - Aciklama dropdown ina tiklanir
      And Eklenen İslem Kalemi Listesi- Aciklama dropdown- SGK secimi yapilir
      And Eklenen İslem Kalemi Listesi - Guncelle butonuna tiklanir
      And Sayfa ilgili Kaydet elementine kaydirilir
      When Kaydet butonuna tiklandiginda
      Then İlgili provizyon mesajinin alindigi gorulur
      Then LogOut yapilir


    Scenario: TC-7) TCKN ile Provizyon Olusturma - HUV Kodu Bilgisi
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      And Arama Cubuguna TCKN girisi yapilir
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
      And Doktor Secimi icin sec dropdown ina tiklanir
      And Doktor Secilir - Zerrin Boyaci
      And Doktor Secimi Sec butonuna tiklanir
      And Sikayet alanina metin girisi yapilir
      And Sikayet Baslangic Tarihi secimi yapilir
      And Tani Girisi alanina kod girilir - (Menengokokal menenjit)
      And Tani Kodu- Ekle butonuna tiklanir
      And Sayfa asagi kaydirilir
      And Tani Girisi- Kaydet butonuna tiklanir
      And Aradigimi Bulamadim butonuna tiklanir
      And Detayli İslem Kalemi Arama ekranindaki HUV Kodu alanina metin girisi yapilir -CDKan-
      And Detayli İslem Kalemi Arama ekranindaki Ara butonuna tiklanir
      And Detayli İslem Kalemi Arama ekranindaki ilk sonuc Ekle butonuna tiklanir
      And Sayfa ilgili Kaydet elementine kaydirilir
      And Anlasmali Kurum Tutari alanina giris yapilir
      And Eklenen İslem Kalemi Listesi - Aciklama dropdown ina tiklanir
      And Eklenen Islem Kalemi Listesi - Aciklama Dropdown - Kampanyali Fiyat secimi yapilir
      And Eklenen İslem Kalemi Listesi - Guncelle butonuna tiklanir
      And Sayfa ilgili Kaydet elementine kaydirilir
      When Kaydet butonuna tiklandiginda
      Then İlgili provizyon mesajinin alindigi gorulur
      Then LogOut yapilir


    Scenario: TC-8) YKN ile Ret Statusunde Provizyon Olusturma
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      And Arama Cubuguna YKN girisi yapilir
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
      And Doktor Secimi icin sec dropdown ina tiklanir
      And Doktor Secilir - Zerrin Boyaci
      And Doktor Secimi Sec butonuna tiklanir
      And Sikayet alanina metin girisi yapilir
      And Sikayet Baslangic Tarihi secimi yapilir
      And Tani Girisi alanina kod girilir
      And Tani Kodu- Ekle butonuna tiklanir
      And Sayfa asagi kaydirilir
      And Tani Girisi- Kaydet butonuna tiklanir
      And Asi-İlac tabina tiklanir
      And Asi-İlac adi alanina giris yapilir - NASALEZE COLD
      And Asi-İlac Adi Ara butonuna tiklanir
      And Arama sonucu gelen ekrana ilac adet bilgisi girilir
      And Ilac adedi eklemek icin Ekle butonuna tiklanir
      And Sayfa ilgili Kaydet elementine kaydirilir
      When Kaydet butonuna tiklandiginda
      Then Ret statusunde hata mesaji alindigi gorulur
      Then LogOut yapilir


    Scenario: TC-9) YKN ile Provizyon Olusturma
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      And Arama Cubuguna YKN girisi yapilir
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
      And Doktor Secimi icin sec dropdown ina tiklanir
      And Doktor Secilir - Zerrin Boyaci
      And Doktor Secimi Sec butonuna tiklanir
      And Sikayet alanina metin girisi yapilir
      And Sikayet Baslangic Tarihi secimi yapilir
      And Tani Girisi alanina kod girilir - (Menengokokal menenjit)
      And Tani Kodu- Ekle butonuna tiklanir
      And Sayfa asagi kaydirilir
      And Tani Girisi- Kaydet butonuna tiklanir
      And İslem Kalem Alanina metin girilir - VEMP (Vestibuler Evoked Myojenik Potansiyaller)
      And İslem Kalemi Ara butonuna tiklanir
      And Ilac adedi eklemek icin Ekle butonuna tiklanir
      And Sayfa ilgili Kaydet elementine kaydirilir
      When Kaydet butonuna tiklandiginda
      Then İlgili provizyon mesajinin alindigi gorulur
      Then LogOut yapilir


    Scenario: TC-10) YKN ile Bekleme Statusunde Provizyon Olusturma
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      And Arama Cubuguna YKN girisi yapilir
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
      And Doktor Secimi icin sec dropdown ina tiklanir
      And Doktor Secilir - Zerrin Boyaci
      And Doktor Secimi Sec butonuna tiklanir
      And Sikayet alanina metin girisi yapilir
      And Sikayet Baslangic Tarihi secimi yapilir
      And Tani Girisi alanina kod girilir - (Kolera Vibrio cholorea, kolera tipine bagli)
      And Tani Kodu- Ekle butonuna tiklanir
      And Sayfa asagi kaydirilir
      And Tani Girisi- Kaydet butonuna tiklanir
      And Aradigimi Bulamadim butonuna tiklanir
      And Detayli İslem Kalemi Arama ekranindaki İslem Kalem Adi alanina metin girisi yapilir- (RADYOFREKANS)
      And Detayli İslem Kalemi Arama ekranindaki Ara butonuna tiklanir
      And Detayli İslem Kalemi Arama ekranindaki ilk sonuc Ekle butonuna tiklanir
      And Sayfa ilgili Kaydet elementine kaydirilir
      When Kaydet butonuna tiklandiginda
      Then Bekleme statusunde ilgili mesaj gorulur
      Then LogOut yapilir

      Scenario: TC-11) YKN ile Provizyon Oluşturma - Adli Vaka
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna YKN girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Doktor Secimi icin sec dropdown ina tiklanir
        And Doktor Secilir - Zerrin Boyaci
        And Doktor Secimi Sec butonuna tiklanir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic Tarihi secimi yapilir
        And Sayfa ilgili Kaydet elementine kaydirilir
        And Adli Vaka Mi? seçenegi -Evet- olarak secilir
        And Sayfa ilgili Kaydet elementine kaydirilir
        And Sec butonuna tiklanir ve ilgili dosya secilir
        And Dosya tipi -Sigortali Beyani- olarak secilir
        And Yuklenen dosya icin -Kaydet- butonuna tiklanir
        And Tani Girisi alanina kod girilir - (Kolera Vibrio cholorea, kolera tipine bagli)
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        And İslem Kalem Alanina metin girilir - VEMP (Vestibuler Evoked Myojenik Potansiyaller)
        And İslem Kalemi Ara butonuna tiklanir
        And Ilac adedi eklemek icin Ekle butonuna tiklanir
        And Sayfa ilgili Kaydet elementine kaydirilir
        When Kaydet butonuna tiklandiginda
        Then İlgili provizyon mesajinin alindigi gorulur
        Then LogOut yapilir


      Scenario: TC-12)YKN ile Kayitli Olmayan Doktor ile Provizyon Olusturma
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna YKN girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Kayitli Olmayan Doktor secilir
        And Doktor Diploma Numarasi girisi yapilir
        And Doktor Bransı Secimi icin Sec dropdown ina tiklanir
        And Doktor Bransi Secimi yapilir - aile hekimi
        And Doktor Diploma Numarasi - Ara butonuna tiklanir
        And Diploma Numarasi uzerinden doktor secimi yapilir
        And Scroll View Tani Girisi Kaydet butonuna kaydirilir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic Tarihi secimi yapilir
        And Tani Girisi alanina kod girilir - (Menengokokal menenjit)
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        And İslem Kalem Alanina metin girilir - VEMP (Vestibuler Evoked Myojenik Potansiyaller)
        And İslem Kalemi Ara butonuna tiklanir
        And Ilac adedi eklemek icin Ekle butonuna tiklanir
        And Sayfa ilgili Kaydet elementine kaydirilir
        When Kaydet butonuna tiklandiginda
        Then İlgili provizyon mesajinin alindigi gorulur
        Then LogOut yapilir


      Scenario: TC-13) YKN ile Provizyon Olusturma - SUT Kodu Bilgisi
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna YKN girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Doktor Secimi icin sec dropdown ina tiklanir
        And Doktor Secilir - Zerrin Boyaci
        And Doktor Secimi Sec butonuna tiklanir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic Tarihi secimi yapilir
        And Tani Girisi alanina kod girilir - (Menengokokal menenjit)
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        And Aradigimi Bulamadim butonuna tiklanir
        And Detayli İslem Kalemi Arama ekranindaki Sut Kodu alanina metin girisi yapilir -CDKan-
        And Detayli İslem Kalemi Arama ekranindaki Ara butonuna tiklanir
        And Detayli İslem Kalemi Arama ekranindaki ilk sonuc Ekle butonuna tiklanir
        And Sayfa ilgili Kaydet elementine kaydirilir
        And Anlasmali Kurum Tutari alanina giris yapilir
        And Eklenen İslem Kalemi Listesi - Aciklama dropdown ina tiklanir
        And Eklenen İslem Kalemi Listesi- Aciklama dropdown- SGK secimi yapilir
        And Eklenen İslem Kalemi Listesi - Guncelle butonuna tiklanir
        And Sayfa ilgili Kaydet elementine kaydirilir
        When Kaydet butonuna tiklandiginda
        Then İlgili provizyon mesajinin alindigi gorulur
        Then LogOut yapilir


      Scenario: TC-14) YKN ile Provizyon Olusturma - HUV Kodu Bilgisi
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna YKN girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Doktor Secimi icin sec dropdown ina tiklanir
        And Doktor Secilir - Zerrin Boyaci
        And Doktor Secimi Sec butonuna tiklanir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic Tarihi secimi yapilir
        And Tani Girisi alanina kod girilir - (Menengokokal menenjit)
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        And Aradigimi Bulamadim butonuna tiklanir
        And Detayli İslem Kalemi Arama ekranindaki HUV Kodu alanina metin girisi yapilir -CDKan-
        And Detayli İslem Kalemi Arama ekranindaki Ara butonuna tiklanir
        And Detayli İslem Kalemi Arama ekranindaki ilk sonuc Ekle butonuna tiklanir
        And Sayfa ilgili Kaydet elementine kaydirilir
        And Anlasmali Kurum Tutari alanina giris yapilir
        And Eklenen İslem Kalemi Listesi - Aciklama dropdown ina tiklanir
        And Eklenen Islem Kalemi Listesi - Aciklama Dropdown - Kampanyali Fiyat secimi yapilir
        And Eklenen İslem Kalemi Listesi - Guncelle butonuna tiklanir
        And Sayfa ilgili Kaydet elementine kaydirilir
        When Kaydet butonuna tiklandiginda
        Then İlgili provizyon mesajinin alindigi gorulur
        Then LogOut yapilir


      Scenario: TC-15) Pasaport No ile Ret Statusunde Provizyon Olusturma
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna Pasaport No girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Doktor Secimi icin sec dropdown ina tiklanir
        And Doktor Secilir - Zerrin Boyaci
        And Doktor Secimi Sec butonuna tiklanir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic Tarihi secimi yapilir
        And Tani Girisi alanina kod girilir
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        And Asi-İlac tabina tiklanir
        And Asi-İlac adi alanina giris yapilir - NASALEZE COLD
        And Asi-İlac Adi Ara butonuna tiklanir
        And Arama sonucu gelen ekrana ilac adet bilgisi girilir
        And Ilac adedi eklemek icin Ekle butonuna tiklanir
        And Sayfa ilgili Kaydet elementine kaydirilir
        When Kaydet butonuna tiklandiginda
        Then Ret statusunde hata mesaji alindigi gorulur
        Then LogOut yapilir


      Scenario: TC-16) Pasaport No ile Provizyon Olusturma
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna Pasaport No girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Doktor Secimi icin sec dropdown ina tiklanir
        And Doktor Secilir - Zerrin Boyaci
        And Doktor Secimi Sec butonuna tiklanir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic Tarihi secimi yapilir
        And Tani Girisi alanina kod girilir - (Menengokokal menenjit)
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        And İslem Kalem Alanina metin girilir - VEMP (Vestibuler Evoked Myojenik Potansiyaller)
        And İslem Kalemi Ara butonuna tiklanir
        And Ilac adedi eklemek icin Ekle butonuna tiklanir
        And Sayfa ilgili Kaydet elementine kaydirilir
        When Kaydet butonuna tiklandiginda
        And Sayfa ilgili Provizyon Formu Bas elementine kaydirilir
        #And Provizyon Formu Bas butonuna tiklanir
        #Then Form Basimi Yapildigi gorulur
        Then LogOut yapilir


      Scenario: TC-17) Pasaport No ile Bekleme Statusunde Provizyon Olusturma
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna Pasaport No girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Doktor Secimi icin sec dropdown ina tiklanir
        And Doktor Secilir - Zerrin Boyaci
        And Doktor Secimi Sec butonuna tiklanir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic Tarihi secimi yapilir
        And Tani Girisi alanina kod girilir - (Kolera Vibrio cholorea, kolera tipine bagli)
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        And Aradigimi Bulamadim butonuna tiklanir
        And Detayli İslem Kalemi Arama ekranindaki İslem Kalem Adi alanina metin girisi yapilir- (RADYOFREKANS)
        And Detayli İslem Kalemi Arama ekranindaki Ara butonuna tiklanir
        And Detayli İslem Kalemi Arama ekranindaki ilk sonuc Ekle butonuna tiklanir
        And Sayfa ilgili Kaydet elementine kaydirilir
        When Kaydet butonuna tiklandiginda
        Then Bekleme statusunde ilgili mesaj gorulur
        Then LogOut yapilir


      Scenario: TC-18) Pasaport No ile Provizyon Olusturma - Adli Vaka
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna Pasaport No girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Doktor Secimi icin sec dropdown ina tiklanir
        And Doktor Secilir - Zerrin Boyaci
        And Doktor Secimi Sec butonuna tiklanir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic Tarihi secimi yapilir
        And Sayfa ilgili Kaydet elementine kaydirilir
        And Adli Vaka Mi? seçenegi -Evet- olarak secilir
        And Sayfa ilgili Kaydet elementine kaydirilir
        And Sec butonuna tiklanir ve ilgili dosya secilir
        And Dosya tipi -Sigortali Beyani- olarak secilir
        And Yuklenen dosya icin -Kaydet- butonuna tiklanir
        And Tani Girisi alanina kod girilir - (Kolera Vibrio cholorea, kolera tipine bagli)
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        And İslem Kalem Alanina metin girilir - VEMP (Vestibuler Evoked Myojenik Potansiyaller)
        And İslem Kalemi Ara butonuna tiklanir
        And Ilac adedi eklemek icin Ekle butonuna tiklanir
        And Sayfa ilgili Kaydet elementine kaydirilir
        When Kaydet butonuna tiklandiginda
        Then İlgili provizyon mesajinin alindigi gorulur
        Then LogOut yapilir


      Scenario: TC-19) Pasaport No ile Kayitli Olmayan Doktor ile Provizyon Olusturma
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna Pasaport No girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Kayitli Olmayan Doktor secilir
        And Doktor Diploma Numarasi girisi yapilir
        And Doktor Bransı Secimi icin Sec dropdown ina tiklanir
        And Doktor Bransi Secimi yapilir - aile hekimi
        And Doktor Diploma Numarasi - Ara butonuna tiklanir
        And Diploma Numarasi uzerinden doktor secimi yapilir
        And Scroll View Tani Girisi Kaydet butonuna kaydirilir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic Tarihi secimi yapilir
        And Tani Girisi alanina kod girilir - (Menengokokal menenjit)
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        And İslem Kalem Alanina metin girilir - VEMP (Vestibuler Evoked Myojenik Potansiyaller)
        And İslem Kalemi Ara butonuna tiklanir
        And Ilac adedi eklemek icin Ekle butonuna tiklanir
        And Sayfa ilgili Kaydet elementine kaydirilir
        When Kaydet butonuna tiklandiginda
        Then İlgili provizyon mesajinin alindigi gorulur
        Then LogOut yapilir


      Scenario: TC-20) Pasaport No ile Provizyon Olusturma - SUT Kodu Bilgisi
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna Pasaport No girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Doktor Secimi icin sec dropdown ina tiklanir
        And Doktor Secilir - Zerrin Boyaci
        And Doktor Secimi Sec butonuna tiklanir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic Tarihi secimi yapilir
        And Tani Girisi alanina kod girilir - (Menengokokal menenjit)
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        And Aradigimi Bulamadim butonuna tiklanir
        And Detayli İslem Kalemi Arama ekranindaki Sut Kodu alanina metin girisi yapilir -CDKan-
        And Detayli İslem Kalemi Arama ekranindaki Ara butonuna tiklanir
        And Detayli İslem Kalemi Arama ekranindaki ilk sonuc Ekle butonuna tiklanir
        And Sayfa ilgili Kaydet elementine kaydirilir
        And Anlasmali Kurum Tutari alanina giris yapilir
        And Eklenen İslem Kalemi Listesi - Aciklama dropdown ina tiklanir
        And Eklenen İslem Kalemi Listesi- Aciklama dropdown- SGK secimi yapilir
        And Eklenen İslem Kalemi Listesi - Guncelle butonuna tiklanir
        And Sayfa ilgili Kaydet elementine kaydirilir
        When Kaydet butonuna tiklandiginda
        Then İlgili provizyon mesajinin alindigi gorulur
        Then LogOut yapilir


      Scenario: TC-21) Pasaport No ile Provizyon Olusturma - HUV Kodu Bilgisi
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna Pasaport No girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Doktor Secimi icin sec dropdown ina tiklanir
        And Doktor Secilir - Zerrin Boyaci
        And Doktor Secimi Sec butonuna tiklanir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic Tarihi secimi yapilir
        And Tani Girisi alanina kod girilir - (Menengokokal menenjit)
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        And Aradigimi Bulamadim butonuna tiklanir
        And Detayli İslem Kalemi Arama ekranindaki HUV Kodu alanina metin girisi yapilir -CDKan-
        And Detayli İslem Kalemi Arama ekranindaki Ara butonuna tiklanir
        And Detayli İslem Kalemi Arama ekranindaki ilk sonuc Ekle butonuna tiklanir
        And Sayfa ilgili Kaydet elementine kaydirilir
        And Anlasmali Kurum Tutari alanina giris yapilir
        And Eklenen İslem Kalemi Listesi - Aciklama dropdown ina tiklanir
        And Eklenen Islem Kalemi Listesi - Aciklama Dropdown - Kampanyali Fiyat secimi yapilir
        And Eklenen İslem Kalemi Listesi - Guncelle butonuna tiklanir
        And Sayfa ilgili Kaydet elementine kaydirilir
        When Kaydet butonuna tiklandiginda
        Then İlgili provizyon mesajinin alindigi gorulur
        Then LogOut yapilir


      Scenario: TC-22) Sikayet Baslangıc Tarihi Hatasi
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna TCKN girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Doktor Secimi icin sec dropdown ina tiklanir
        And Doktor Secilir - Zerrin Boyaci
        And Doktor Secimi Sec butonuna tiklanir
        And Sikayet alanina metin girisi yapilir
        And Tani Girisi alanina kod girilir - (Menengokokal menenjit)
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        Then Ekranda  -Uyari: Tarih bilgisi girilmesi zorunludur!- mesajinin verildigi gorulur


      Scenario: TC-23) Sikayet Tarihi-Dogum Tarihi Hatasi
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna TCKN girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Doktor Secimi icin sec dropdown ina tiklanir
        And Doktor Secilir - Zerrin Boyaci
        And Doktor Secimi Sec butonuna tiklanir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic tarihi yanlis secilir
        And Tani Girisi alanina kod girilir - (Menengokokal menenjit)
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        Then Ekranda -Uyari: Sikayet baslangic tarihi sigortalinin dogum tarihinden kucuk olamaz!- mesajinin verildigi gorulur


      Scenario: TC-24) Doktor Seçim Hatası
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna TCKN girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic Tarihi secimi yapilir
        And Tani Girisi alanina kod girilir - (Kolera Vibrio cholorea, kolera tipine bagli)
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        Then Ekranda -Uyari: Doktor secimi zorunludur!- mesajinin geldigi gorulur


      Scenario: TC-25) Tani Secim Hatasi
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna TCKN girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Doktor Secimi icin sec dropdown ina tiklanir
        And Doktor Secilir - Zerrin Boyaci
        And Doktor Secimi Sec butonuna tiklanir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic Tarihi secimi yapilir
        And Sayfa asagi kaydirilir -Adli Vaka-Evet butonuna
        And Tani Girisi- Kaydet butonuna tiklanir
        Then Ekranda -Uyari: Tani girmelisiniz- mesajinin geldigi gorulur


      Scenario: TC-26) Yeni Provizyon Talebi Ekrani Kaydet Hatasi
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna TCKN girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Doktor Secimi icin sec dropdown ina tiklanir
        And Doktor Secilir - Zerrin Boyaci
        And Doktor Secimi Sec butonuna tiklanir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic Tarihi secimi yapilir
        And Tani Girisi alanina kod girilir - (Menengokokal menenjit)
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        When Kaydet butonuna tiklandiginda
        Then Ekranda -Uyari: Islem kalemi secilmemis- mesajinin geldigi gorulur


      Scenario: TC-27) Ilac Adet Hatasi
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna TCKN girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Doktor Secimi icin sec dropdown ina tiklanir
        And Doktor Secilir - Zerrin Boyaci
        And Doktor Secimi Sec butonuna tiklanir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic Tarihi secimi yapilir
        And Tani Girisi alanina kod girilir
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        And Asi-İlac tabina tiklanir
        And Asi-İlac adi alanina giris yapilir - NASALEZE COLD
        And Asi-İlac Adi Ara butonuna tiklanir
        #And Arama sonucu gelen ekrana ilac adet bilgisi girilir
        And Ilac adedi eklemek icin Ekle butonuna tiklanir
        Then Ekranda -Uyari: Adet Ekle- uyari mesajinin alindigi gorulur


      Scenario: TC-28) Sarf Malzeme Adet Hatasi
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna TCKN girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Doktor Secimi icin sec dropdown ina tiklanir
        And Doktor Secilir - Zerrin Boyaci
        And Doktor Secimi Sec butonuna tiklanir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic Tarihi secimi yapilir
        And Tani Girisi alanina kod girilir
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        And Sarf Malzeme tabina tiklanir
        And Aradigimi Bulamadim butonuna tiklanir
        And Sarf Malzeme Adi girisi yapilir - NARKOZ BALONLU
        And Detayli İslem Kalemi Arama ekranindaki Ara butonuna tiklanir
        And Detayli İslem Kalemi Arama ekranindaki ilk sonuc Ekle butonuna tiklanir
        And Ekranda -Uyari: Adet bilgisi girilmesi zorunludur- mesajinin geldigi gorulurr


      Scenario:TC-31) TCKN ile RET Statusunde Kayit Olusturma - Aksigorta
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna Aksigorta-TCKN girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Doktor Secimi icin sec dropdown ina tiklanir
        And Doktor Secilir - Zerrin Boyaci
        And Doktor Secimi Sec butonuna tiklanir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic Tarihi secimi yapilir
        And Tani Girisi alanina kod girilir
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        And Aradigimi Bulamadim butonuna tiklanir
        And Detayli İslem Kalemi Arama ekranindaki İslem Kalem Adi alanina metin girisi yapilir- (VEMP)
        And Detayli İslem Kalemi Arama ekranindaki Ara butonuna tiklanir
        And Detayli İslem Kalemi Arama ekranindaki ilk sonuc Ekle butonuna tiklanir
        And Sayfa ilgili Kaydet elementine kaydirilir
        When Kaydet butonuna tiklandiginda
        Then Ret statusunde hata mesaji alindigi gorulur
        Then LogOut yapilir


      Scenario: TC-32) TCKN ile RET Statusunde Kayit Olusturma - Garanti Emeklilik
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna Garanti-TCKN girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Doktor Secimi icin sec dropdown ina tiklanir
        And Doktor Secilir - Zerrin Boyaci
        And Doktor Secimi Sec butonuna tiklanir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic Tarihi secimi yapilir
        And Tani Girisi alanina kod girilir
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        And Aradigimi Bulamadim butonuna tiklanir
        And Detayli İslem Kalemi Arama ekranindaki İslem Kalem Adi alanina metin girisi yapilir- (VEMP)
        And Detayli İslem Kalemi Arama ekranindaki Ara butonuna tiklanir
        And Detayli İslem Kalemi Arama ekranindaki ilk sonuc Ekle butonuna tiklanir
        And Sayfa ilgili Kaydet elementine kaydirilir
        When Kaydet butonuna tiklandiginda
        Then Ret statusunde hata mesaji alindigi gorulur
        Then LogOut yapilir


      Scenario: TC-33) TCKN ile RET Statusunde Kayit Olusturma - HDI
        And Provizyon Islemleri butonuna tiklanir
        And Yeni Provizyon Talebi butonuna tiklanir
        And Arama Cubuguna HDI-TCKN girisi yapilir
        And Arama Kriterleri ekranindaki Ara butonuna tiklanir
        And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
        And Doktor Secimi icin sec dropdown ina tiklanir
        And Doktor Secilir - Zerrin Boyaci
        And Doktor Secimi Sec butonuna tiklanir
        And Sikayet alanina metin girisi yapilir
        And Sikayet Baslangic Tarihi secimi yapilir
        And Tani Girisi alanina kod girilir
        And Tani Kodu- Ekle butonuna tiklanir
        And Sayfa asagi kaydirilir
        And Tani Girisi- Kaydet butonuna tiklanir
        And Aradigimi Bulamadim butonuna tiklanir
        And Detayli İslem Kalemi Arama ekranindaki İslem Kalem Adi alanina metin girisi yapilir- (VEMP)
        And Detayli İslem Kalemi Arama ekranindaki Ara butonuna tiklanir
        And Detayli İslem Kalemi Arama ekranindaki ilk sonuc Ekle butonuna tiklanir
        And Sayfa ilgili Kaydet elementine kaydirilir
        When Kaydet butonuna tiklandiginda
        Then Ret statusunde hata mesaji alindigi gorulur
        Then LogOut yapilir


        Scenario: TC-39) SAT Kontrolu
          And Provizyon Islemleri butonuna tiklanir
          And Yeni Provizyon Talebi butonuna tiklanir
          And TCKN girisi yapilir - Bilgehan
          And Arama Kriterleri ekranindaki Ara butonuna tiklanir
          And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
          And Doktor Secimi icin sec dropdown ina tiklanir
          And Doktor secilir - Basak Aksu
          And Doktor Secimi Sec butonuna tiklanir
          And Sikayet alanina metin girisi yapilir
          And Sikayet Baslangic Tarihi secimi yapilir
          And Tani Girisi alanina kod girilir- Gebelik
          And Tani Kodu- Ekle butonuna tiklanir
          Then Tani kodu gebelik oldugunda ekranda bulunan Sikayet Baslangic tarihinin -Son Adet Tarihi- olarak degistigi gorulur


        Scenario: TC-40) Brans Bazli Ret - Psikiyatr
          And Provizyon Islemleri butonuna tiklanir
          And Yeni Provizyon Talebi butonuna tiklanir
          And Arama Cubuguna TCKN girisi yapilir
          And Arama Kriterleri ekranindaki Ara butonuna tiklanir
          And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
          And Doktor Secimi icin sec dropdown ina tiklanir
          And Doktor Secilir - Zerrin Boyaci
          And Doktor Secimi Sec butonuna tiklanir
          And Sikayet alanina metin girisi yapilir
          And Sikayet Baslangic Tarihi secimi yapilir
          And Tani Girisi alanina kod girilir - Karisik tip bunalti ve depresyon bozuklugu
          And Tani Kodu- Ekle butonuna tiklanir
          And Sayfa asagi kaydirilir
          And Tani Girisi- Kaydet butonuna tiklanir
          And İslem Kalem Alanina metin girilir - VEMP (Vestibuler Evoked Myojenik Potansiyaller)
          And İslem Kalemi Ara butonuna tiklanir
          And Ilac adedi eklemek icin Ekle butonuna tiklanir
          And Sayfa ilgili Kaydet elementine kaydirilir
          When Kaydet butonuna tiklandiginda
          Then Ret statusunde hata mesaji alindigi gorulur
          Then LogOut yapilir


        Scenario: TC-41) Brans Bazli Ret- Dis
          And Provizyon Islemleri butonuna tiklanir
          And Yeni Provizyon Talebi butonuna tiklanir
          And Arama Cubuguna TCKN girisi yapilir
          And Arama Kriterleri ekranindaki Ara butonuna tiklanir
          And Police listesinden ilk siradaki police icin Devam butonuna tiklanir
          And Doktor Secimi icin sec dropdown ina tiklanir
          And Doktor secilir- Ayse Bayram Selcuk
          And Doktor Secimi Sec butonuna tiklanir
          And Sikayet alanina metin girisi yapilir
          And Sikayet Baslangic Tarihi secimi yapilir
          And Tani Girisi alanina kod girilir - Dis gelisim bozuklugu tanimlanmamis -
          And Tani Kodu- Ekle butonuna tiklanir
          And Sayfa asagi kaydirilir
          And Tani Girisi- Kaydet butonuna tiklanir
          And İslem Kalem Alanina metin girilir - Ortodonti tedavisi - metal braket
          And İslem Kalemi Ara butonuna tiklanir
          And İkinci siradaki islem kalemine tiklanir
          And Sayfa ilgili Kaldir elementine kaydirilir
          And Sayfa ilgili Kaydet elementine kaydirilir
          When Kaydet butonuna tiklandiginda
          Then Ret statusunde hata mesaji alindigi gorulur
          Then LogOut yapilir


        Scenario: TC-42) Sigortalinin Gun icindeki Diger Provizyonlarinin Listelenmesi
          And Provizyon Islemleri butonuna tiklanir
          And Yeni Provizyon Talebi butonuna tiklanir
          And Arama Cubuguna TCKN girisi yapilir
          And Arama Kriterleri ekranindaki Ara butonuna tiklanir
          And Sayfa alt kisimdaki page bire kaydirilir
          Then Ekranda -Sigortali icin bugun kaydedilen provizyonlar- basliginin da geldigi gorulur


































