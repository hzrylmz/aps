
Feature: Login Kontrolleri


  Scenario: TC-1) Basarili sekilde login olunabilmesi kontrolu
    Given APS Giris ekranina gidilir
    And Kullanici Kodu dogru sekilde girilir
    And Sifre dogru sekilde girilir
    When Giris butonuna tiklandiginda
    Then Anasayfanin geldigi gorulur
    And Profil ismi butonuna tiklanir
    When LogOut butonuna tiklandiginda
    Then Login ekranina donuldugu gorulur


    Scenario: TC-2) Kullanici Kodu ve Sifre alani bos birakilarak login olunamamasi kontrolu
      Given APS Giris ekranina gidilir
      And Kullanici Kodu alani bos birakilir
      And Sifre alani bos birakilir
      When Giris butonuna tiklandiginda
      Then Hata mesajinin alindigi gorulur


#    Scenario: TC-3) Kullanici Kodu alani bos birakildiginde login olunamamasi kontrolu
#      Given APS Giris ekranina gidilir
#      And Kullanici Kodu alani bos birakilir
#      And Sifre dogru sekilde girilir
#      When Giris butonuna tiklandiginda
#      Then Hata mesajinin alindigi gorulur











