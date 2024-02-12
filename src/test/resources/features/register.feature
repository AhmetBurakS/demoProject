
Feature: Register testi

  @Burak
  Scenario: TC[002] Register sayfasinda gerekli bilgileri girdikten sonra basarili bir sekilde kayit olmaliyim.

    Given kullanici "registerURL" e gider
    Then  full name text box'a adini soyadini girer
    And   company name text box'a sirket ismini girer
    And   email address text box'a mail adresini girer
    When  password text box'a sifresini girer
    And   sign up butona tiklar
    Then  dashboard sayfasinda oldugunu dogrular
    And   sayfayi kapatir