Feature: Sign In Functionality for Amazon Website
  As a user of the Amazon website
  I want to be able to sign in with my account
  So that I can access my account-related features and manage my orders

  Background:
    Given I am on the Amazon sign-in page

    Scenario: Successful sign-in with valid credentials
#     // Given I am on the Amazon sign-in page
      When I have entered a valid email click continue
      And I have entered a valid password click signIn
      Then I should be signed in successfully

  Scenario Outline: Sign-in with incorrect email displays appropriate error message
    When I have entered an incorrect email "<email>" click continue
    And I have entered a valid password "<password>" click signIn
#    Then I should see an error message indicating "<error_message>"
#    Examples:
#      | email | password | error_message |

#
    Examples:
      | email                        | password |
      | abc@gmail                    |          |
      | patilvijaysing2092@gmail.com | 12345    |
##    Then I should see an error message indicating "<error_message>"
#
#
#    Examples:
#      | email              | error_message                                    |
#      | abc@gmail   | We cannot find an account with that email address       |
#
##
#  Scenario Outline: Sign-in with incorrect password displays appropriate error message
#    Given I have entered a valid email "<email>"
#    When I click on the continue button
#    And I have entered an incorrect password "<password>"
#    When I click on the Sign In button
#    Then I should see an error message indicating "<error_message>"

#    Examples:
#      | email              | password      | error_message                                  |
#      | patilvijaysing2092@gmail.com   | 123456  | Your password is incorrect |
#



