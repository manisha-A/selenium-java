Feature: As a user, I should be able to purchase a book on amazon

  Scenario: As a user, I should be able to purchase a book on amazon
    Given I am on amazon shopping home page
    When I search for "How Google Tests Software"
    Then I should be able to add the book to my cart