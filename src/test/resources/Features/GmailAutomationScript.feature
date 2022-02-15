Feature: Feature to test Gmail Functionality

  Scenario: User should be able to send an email and verify the contents of the email
    Given I am in gmail
    When I create a message
    Then I should be able to send the message
    And I should see the message in my inbox
    And I should see that the contents of my message is the same as what I sent
