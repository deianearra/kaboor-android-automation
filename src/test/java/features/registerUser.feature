@register
Feature: Registration User

  @register
  Scenario: As a user, I should be able to log in using the correct registered data as well as log out in the Kaboor app
    Given user open Kaboor app
    When user navigate to register page
    * user input email
    * user tap Buat Akun button after input email
    * user input nomor HP, nama lengkap, password
    * user tap Buat Akun button
    Then user register successfully
