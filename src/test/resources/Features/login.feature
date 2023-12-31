@SmokeTest
Feature: Feature to test login functionality

  Scenario: Check Login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page

  #Scenario Outline: Check Login is successful with valid credentials
    #Given user is on login page
    #When user enters <username> and <password>
    #And clicks on login button
    #Then user is navigated to home page
#
    #Examples: 
      #| username | password |
      #| user1    | pass1    |
      #| user2    | pass2    |
