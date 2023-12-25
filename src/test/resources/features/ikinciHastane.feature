Feature: İkinci Hastane Kontrolleri
  Background: İkinci Hastane- Login Olunmasi
    Given APS Giris ekranina gidilir
    And Kullanici Kodu dogru sekilde girilir - İkinci Hastane
    And Sifre dogru sekilde girilir
    When Giris butonuna tiklandiginda
    Then Anasayfanin geldigi gorulur


    Scenario: TC-43) Medula Numara Kontrolu
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      And Arama Cubuguna TCKN girisi yapilir -Sedanur
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden -Tamamlayici Saglik Sigortasi- olan police secilir
      Then Medula Numara alaninin onyuze geldigi gorulur


    Scenario: TC-44) SGK Pop-up Mesaj Kontrolu
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      And Arama Cubuguna TCKN girisi yapilir -Sedanur
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden -Tamamlayici Saglik Sigortasi- olan police secilir
      And SGK tercihi -Yok- olarak degistirilir
      Then -Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesajinin ciktigi gorulur


    Scenario: TC-45) SGK Kullanmama Nedeni Hata Mesaji
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      And Arama Cubuguna TCKN girisi yapilir -Sedanur
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden -Tamamlayici Saglik Sigortasi- olan police secilir
      And SGK tercihi -Yok- olarak degistirilir
      Then -Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesajinin ciktigi gorulur
      And Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesaji EVET secilir
      And Doktor Secimi icin sec dropdown ina tiklanir - Medula
      And Doktor secilir - Nalan Sarac
      And Doktor Secimi Sec butonuna tiklanir
      And Sayfa asagi kaydirilir -Adli Vaka-Evet butonuna
      And Sikayet alanina metin girisi yapilir
      And Sikayet Baslangic Tarihi secimi yapilir
      And Tani Girisi alanina kod girilir - Migren
      And Tani Kodu- Ekle butonuna tiklanir
      And Sayfa asagi kaydirilir
      And Tani Girisi- Kaydet butonuna tiklanir
      Then -Kaydetme islemini gerceklestirebilmek icin SGK Kullanilmama Nedenini secmelisiniz- mesajinin geldigi gorulur



    Scenario: TC-46) SGK Kullanmama Nedeni -Diger- olarak secildiginde Provizyonun Ret Almasi
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      And Arama Cubuguna TCKN girisi yapilir - Ugur Ahmet
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden -grup saglik sigortasi- olan police secilir
      And SGK tercihi -Yok- olarak degistirilir
      Then -Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesajinin ciktigi gorulur
      And Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesaji EVET secilir
      And Doktor Secimi icin sec dropdown ina tiklanir
      And SGK kullanmama nedeni seçilir -Diger
      And Doktor Secimi icin sec dropdown ina tiklanir - Medula
      And Doktor secilir - Ali Kemal Ulas
      And Doktor Secimi Sec butonuna tiklanir
      And Sayfa asagi kaydirilir -Adli Vaka-Evet butonuna
      And Sikayet alanina metin girisi yapilir
      And Sikayet Baslangic Tarihi secimi yapilir
      And Tani Girisi alanina kod girilir- Akut larengofarenjit
      And Tani Kodu- Ekle butonuna tiklanir
      And Sayfa asagi kaydirilir
      And Tani Girisi- Kaydet butonuna tiklanir
      And İslem Kalem Alanina metin girilir - C reaktif protein (CRP)
      And İslem Kalemi Ara butonuna tiklanir
      And Ilac adedi eklemek icin Ekle butonuna tiklanir
      And Sayfa ilgili Kaydet elementine kaydirilir
      When Kaydet butonuna tiklandiginda
      Then Ret statusunde hata mesaji alindigi gorulur
      And Sayfa ilgili Provizyon Formu Bas elementine kaydirilir
      Then SGK kullanilmadan talep edilen islemler kapsam disidir- uyari mesajinin alindigi gorulur


    Scenario: TC-47)SGK Kullanmama Nedeni Dis Hekim Secildiginde Provizyonun -ONAY- alinmasi kontrolu
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      And Arama Cubuguna TCKN girisi yapilir - Ugur Ahmet
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden -grup saglik sigortasi- olan police secilir
      And SGK tercihi -Yok- olarak degistirilir
      Then -Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesajinin ciktigi gorulur
      And Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesaji EVET secilir
      And Doktor Secimi icin sec dropdown ina tiklanir
      And SGK kullanmama nedeni seçilir - SGK Anlasmasiz Hekim  Dis Hekim
      And Doktor Secimi icin sec dropdown ina tiklanir
      And SGK kullanmama nedeni seçilir -Diger
      And Doktor Secimi icin sec dropdown ina tiklanir - Medula
      And Doktor secilir - Ali Kemal Ulas
      And Doktor Secimi Sec butonuna tiklanir
      And Sayfa asagi kaydirilir -Adli Vaka-Evet butonuna
      And Sikayet alanina metin girisi yapilir
      And Sikayet Baslangic Tarihi secimi yapilir
      And Tani Girisi alanina kod girilir- Akut larengofarenjit
      And Tani Kodu- Ekle butonuna tiklanir
      And Sayfa asagi kaydirilir
      And Tani Girisi- Kaydet butonuna tiklanir
      And İslem Kalem Alanina metin girilir - C reaktif protein (CRP)
      And İslem Kalemi Ara butonuna tiklanir
      And Ilac adedi eklemek icin Ekle butonuna tiklanir
      And Sayfa ilgili Kaydet elementine kaydirilir
      When Kaydet butonuna tiklandiginda
      Then İlgili provizyon mesajinin alindigi gorulur
      Then LogOut yapilir


    Scenario: TC-48) Islem Tutar Alaninin Guncellenmesi
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      And Arama Cubuguna TCKN girisi yapilir - Ugur Ahmet
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden -grup saglik sigortasi- olan police secilir
      And SGK tercihi -Yok- olarak degistirilir
      Then -Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesajinin ciktigi gorulur
      And Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesaji EVET secilir
      And Doktor Secimi icin sec dropdown ina tiklanir
      And SGK kullanmama nedeni seçilir - SGK Anlasmasiz Hekim  Dis Hekim
      And Doktor Secimi icin sec dropdown ina tiklanir
      And SGK kullanmama nedeni seçilir -Diger
      And Doktor Secimi icin sec dropdown ina tiklanir - Medula
      And Doktor secilir - Ali Kemal Ulas
      And Doktor Secimi Sec butonuna tiklanir
      And Sayfa asagi kaydirilir -Adli Vaka-Evet butonuna
      And Sikayet alanina metin girisi yapilir
      And Sikayet Baslangic Tarihi secimi yapilir
      And Tani Girisi alanina kod girilir- Akut larengofarenjit
      And Tani Kodu- Ekle butonuna tiklanir
      And Sayfa asagi kaydirilir
      And Tani Girisi- Kaydet butonuna tiklanir
      And İslem Kalem Alanina metin girilir - C reaktif protein (CRP)
      And İslem Kalemi Ara butonuna tiklanir
      And Ilac adedi eklemek icin Ekle butonuna tiklanir
      And Sayfa ilgili Kaydet elementine kaydirilir
      And Anlasmali Kurum Tutari alanina giris yapilir
      And Eklenen İslem Kalemi Listesi - Aciklama dropdown ina tiklanir
      And Eklenen Islem Kalemi Listesi - Aciklama Dropdown - Kampanyali Fiyat secimi yapilir
      And Eklenen İslem Kalemi Listesi - Guncelle butonuna tiklanir
      Then -Uyari: Tanimli olan anlasmali tutardan yuksek tutar girisi yapilamaz.- mesajinin geldigi gorulur


    Scenario: TC-49) Islem Adet Alaninin Guncellenmesi
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      And Arama Cubuguna TCKN girisi yapilir - Ugur Ahmet
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden -grup saglik sigortasi- olan police secilir
      And SGK tercihi -Yok- olarak degistirilir
      Then -Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesajinin ciktigi gorulur
      And Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesaji EVET secilir
      And Doktor Secimi icin sec dropdown ina tiklanir
      And SGK kullanmama nedeni seçilir - SGK Anlasmasiz Hekim  Dis Hekim
      And Doktor Secimi icin sec dropdown ina tiklanir - Medula
      And Doktor secilir - Ali Kemal Ulas
      And Doktor Secimi Sec butonuna tiklanir
      And Sayfa asagi kaydirilir -Adli Vaka-Evet butonuna
      And Sikayet alanina metin girisi yapilir
      And Sikayet Baslangic Tarihi secimi yapilir
      And Tani Girisi alanina kod girilir- Akut larengofarenjit
      And Tani Kodu- Ekle butonuna tiklanir
      And Sayfa asagi kaydirilir
      And Tani Girisi- Kaydet butonuna tiklanir
      And İslem Kalem Alanina metin girilir - C reaktif protein (CRP)
      And İslem Kalemi Ara butonuna tiklanir
      And Ilac adedi eklemek icin Ekle butonuna tiklanir
      And Sayfa ilgili Kaydet elementine kaydirilir
      And Eklen İslem Kalemi Listesi - Adet alani degistirilir
      And Eklenen İslem Kalemi Listesi - Guncelle butonuna tiklanir
      Then -Uyari: Ayni islem kaleminden birden fazla giris yapilmak istenmistir. Bu islem kalemi icin sadece iki adet talep edebilirsiniz- mesajinin verildigi gorulur

    Scenario: TC-50) Islem Kalem Ekrani Is Kesici Mesaji
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      And Arama Cubuguna TCKN girisi yapilir -Sedanur
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden -Tamamlayici Saglik Sigortasi- olan police secilir
      And SGK tercihi -Yok- olarak degistirilir
      Then -Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesajinin ciktigi gorulur
      And Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesaji EVET secilir
      And Doktor Secimi icin sec dropdown ina tiklanir
      And SGK kullanmama nedeni seçilir - SGK Anlasmasiz Hekim  Dis Hekim
      And Doktor Secimi icin sec dropdown ina tiklanir - Medula
      And Doktor secilir - Ali Kemal Ulas
      And Doktor Secimi Sec butonuna tiklanir
      And Sayfa asagi kaydirilir -Adli Vaka-Evet butonuna
      And Sikayet alanina metin girisi yapilir
      And Sikayet Baslangic Tarihi secimi yapilir
      And Tani Girisi alanina kod girilir- Akut larengofarenjit
      And Tani Kodu- Ekle butonuna tiklanir
      And Sayfa asagi kaydirilir
      And Tani Girisi- Kaydet butonuna tiklanir
      And Aradigimi Bulamadim butonuna tiklanir
      And Detayli İslem Kalemi Arama ekranindaki İslem Kalem Adi alanina metin girisi yapilir- LAB CRP AFIAS
      And Detayli İslem Kalemi Arama ekranindaki Ara butonuna tiklanir
      And Detayli İslem Kalemi Arama ekranindaki ilk sonuc Ekle butonuna tiklanir
      Then -Uyari: TSS policelerde islem kalem alanindan giris yapilmalidir-  mesajinin verildigi gorulur


    Scenario: TC-51) Islem Kalemi Kaldirma Hatasi
      And Provizyon Islemleri butonuna tiklanir
      And Provizyon Takibi-Guncelleme butonuna tiklanir
      And Provizyon Kayit Tarihi olarak ayin ilk gunu secilir
      And Provizyon Durumu secilir - Ret
      And Kisi Sorgulama Alanina TCKN girisi yapilir -ugurAhmetTCKN
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Arama sonuclari - Ekranda ilk listelenen kayit icin -Guncelle- butonuna tiklanir - Ret icin
      And Sayfa ilgili Kaydet elementine kaydirilir
      And Eklenen Islem kalemi listesinde bulunan kayit secilir
      And Eklenen Islem kalemi Listesi- Kaldir butonuna tiklanir
      And Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesaji EVET secilir
      Then -Uyari: Red veya bekleme statulu islem kalemlerini kaldiramazsiniz- mesajinin verildigi gorulur


    Scenario: TC-52) SGK Yok secildiginde Islem Kalem Ekran Davranisi -bir
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      And Arama Cubuguna TCKN girisi yapilir -Sedanur
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden -Tamamlayici Saglik Sigortasi- olan police secilir
      And SGK tercihi -Yok- olarak degistirilir
      Then -Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesajinin ciktigi gorulur
      And Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesaji EVET secilir
      And Doktor Secimi icin sec dropdown ina tiklanir
      And SGK kullanmama nedeni seçilir - SGK Anlasmasiz Hekim  Dis Hekim
      And Doktor Secimi icin sec dropdown ina tiklanir - Medula
      And Doktor secilir - Ali Kemal Ulas
      And Doktor Secimi Sec butonuna tiklanir
      And Sayfa asagi kaydirilir -Adli Vaka-Evet butonuna
      And Sikayet alanina metin girisi yapilir
      And Sikayet Baslangic Tarihi secimi yapilir
      And Tani Girisi alanina kod girilir- Akut larengofarenjit
      And Tani Kodu- Ekle butonuna tiklanir
      And Sayfa asagi kaydirilir
      And Tani Girisi- Kaydet butonuna tiklanir
      And İslem Kalem Alanina metin girilir - C reaktif protein (CRP)
      And İslem Kalemi Ara butonuna tiklanir
      And Ilac adedi eklemek icin Ekle butonuna tiklanir
      Then -Uyari: Ilgili islem kalemi icin Medula Takip Numarasina ekleme yapildiktan sonra, provizyon guncelleme alanindan Medula Bilgilerini Al butonu ile ekleme yapilmalidir.- mesajinin verildigi gorulur


    Scenario: TC-53) SGK Yok secildiginde Islem Kalem Ekran Davranisi-iki
      And Provizyon Islemleri butonuna tiklanir
      And Yeni Provizyon Talebi butonuna tiklanir
      And Arama Cubuguna TCKN girisi yapilir -Sedanur
      And Arama Kriterleri ekranindaki Ara butonuna tiklanir
      And Police listesinden -Tamamlayici Saglik Sigortasi- olan police secilir
      And SGK tercihi -Yok- olarak degistirilir
      Then -Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesajinin ciktigi gorulur
      And Sgk kullanmadan devam ediyorsunuz Onayliyor musunuz- mesaji EVET secilir
      And Doktor Secimi icin sec dropdown ina tiklanir
      And SGK kullanmama nedeni seçilir - SGK Anlasmasiz Hekim  Dis Hekim
      And Doktor Secimi icin sec dropdown ina tiklanir - Medula
      And Doktor secilir - Ali Kemal Ulas
      And Doktor Secimi Sec butonuna tiklanir
      And Sayfa asagi kaydirilir -Adli Vaka-Evet butonuna
      And Sikayet alanina metin girisi yapilir
      And Sikayet Baslangic Tarihi secimi yapilir
      And Tani Girisi alanina kod girilir- Akut larengofarenjit
      And Tani Kodu- Ekle butonuna tiklanir
      And Sayfa asagi kaydirilir
      And Tani Girisi- Kaydet butonuna tiklanir
      And İslem Kalem Alanina metin girilir - vitamin D
      And İslem Kalemi Ara butonuna tiklanir
      And Ilac adedi eklemek icin Ekle butonuna tiklanir
      Then Hata almadan eklenebildigi gorulur












