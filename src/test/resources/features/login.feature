
Feature: Login testi


  Scenario: TC[001] Gecerli email ve password ile login olabilmeliyim.

    Given kayitli kullanici "loginURL" e gider
    Then  email text box'a gecerli emailini girer
    And   password text box'a gecerli password'unu girer
    And   login ol butonuna tiklar
    And   sayfayi kapatir


