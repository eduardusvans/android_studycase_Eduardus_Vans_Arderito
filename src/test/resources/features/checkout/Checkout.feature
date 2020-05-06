@Android @checkout
Feature: Checkout

  Scenario: User checkout from Favorites
    Given User is on Home Page
    When User click "Green Tea Latte"
    And User click charge button on shopping cart
    And User see checkout pop up
    And User Choose Cash suggest
    And User click charge button on checkout pop up
    And User click no, thank you button
    Then User redirect to Home Page

  Scenario: User checkout from Library
    When User click Library toolbar
    And User click category "Latte" on library page
    And User click "Green Tea Latte"
    And User click charge button on shopping cart
    And User click see checkout pop up
    And User Choose Cash suggest
    And User click charge button on checkout pop up
    And User click no, thank you button
    Then User redirect to Home Page

  Scenario: Edit item quantity on item detail pop up
    When User click item on shopping cart
    And User will see item detail pop up
    And User add one item quantity
    And User subtract one item quantity
    And User click save button
    Then User redirect to Home Page