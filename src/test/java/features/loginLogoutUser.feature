@loginLogout
Feature: Login User

  @loginLogout
  Scenario: As a user, I should be able to log in using the correct registered data as well as log out in the Kaboor app
    Given user open Kaboor app
    When user navigate to login page
    * user fill correct credential
    * user tap Masuk button
    Then user login successfully
    * user take screenshot "user-login-successfully"
    When user tap Keluar button
    * user tap Keluar button on bottomsheet
    Then user logout successfully
    * user take screenshot "user-logout-successfully"
