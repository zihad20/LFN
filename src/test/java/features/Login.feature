Feature: LFN Login

  Scenario: I want to login as an LFN Administrator User
    Given I have enter login information
    When I click on submit
    And I observed the text "User List"