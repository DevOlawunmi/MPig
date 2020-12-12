Feature: Buy Personalised Christmas Card For Parents

  As a customer
  I want the ability to enter my desired text
  So that I can buy a bespoke card

  Background:
    Given I navigate to moonpig homepage

  Scenario: Customer can view Christmas card options
    When I click on Christmas
    Then a list of Christmas card options are displayed
    And I click on Cards For Parents
    And cards for parents are displayed
