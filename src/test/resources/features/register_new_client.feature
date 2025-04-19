Feature: Adding new client

  As a graphic designer
  I want to register a new client
  So that I can track and manage their projects

  Scenario: Successfully registering a new client
    Given I am on the client registration page
    When I enter valid client details
    And I submit the registration form
    Then I should see a confirmation message
    And the new client should be added to my client list

#  Scenario: Attempting to register with missing required information
#    Given I am on the client registration page
#    When I submit the registration form without entering all required details
#    Then I should see an error message indicating the missing information
#    And the client should not be added to my client list
