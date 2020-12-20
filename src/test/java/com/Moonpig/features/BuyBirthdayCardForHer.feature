Feature: Buy Birthday Card For Her
  As a customer
  I want the ability to enter my desired text
  So that I can buy a bespoke card

  Background:
    Given I navigate to moonpig homepage

  Scenario: Customer can successfully buy birthday card for teen
    When I click on Birthday cards
    And I click on Birthday cards for her
    And I click on teens
    Then a list of Birthday cards for teens are displayed
    And I click on Cards For Parents
    And cards for parents are displayed