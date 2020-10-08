Feature: login
@smokeTest
  Scenario Outline: To verify the user should login using valid credential
    Given user is on login page
    When user enters <username> as username and <password> as password
    And clicks on login button
    Then User is navigated to the home page

 Examples:
 |username|password|
 |ael|12345|
 |joel|12345|