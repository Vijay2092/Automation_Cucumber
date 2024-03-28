Feature: Search Functionality for Amazon Website
  As a user of the Amazon website
  I want to be able to search for products
  So that I can find and purchase the items I need

  Background:
    Given I am on the Amazon homepage

  Scenario: Search for a product by name
    When I enter "<product_name>" into the search bar
    And I click on the search button
    Then I should see search results related to "<product_name>



    