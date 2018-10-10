Feature: Login Action
  This login feature deals with the login functionality of the page

  Background: User is on Genie Page
    Given User opens YesBank Genie url on Chrome Firefox and IE
    When User is on Login Page

  Scenario Outline: Successful Login with Valid Credentials
    And User enters "<Username>" and "<Password>"
    And Click on submit
    Then User should land into Landing Page of Genie
    And User logout from Genie
    And User close the browser
    Examples:
      | Username                 | Password    |
      | webapptest0604@gmail.com | @Test0604   |

  Scenario Outline: Successful Login with Invalid Credentials
    And User enters "<Username>" and "<Password>"
    And Click on submit
    Then Message displayed Invalid Credentials
    And User close the browser
    Examples:
      | Username                 | Password    |
      | webapp@gmail.com         | nabsbs      |
      | abc@yahoo.com            | @Test0604   |
      | webapptest0604@gmail.com | @Test1234   |
      |                          |             |
      |                          | zbxccfdvahd |
      | webapptest0604@gmail.com |             |




