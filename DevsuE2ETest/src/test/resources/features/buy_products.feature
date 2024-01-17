Feature: As a user I want to add several products to my shopping cart and then complete the purchase of these products.

  Scenario: Successful product purchase
    Given user login to the shopping page
    When Add products to the shopping cart
    And The shopping cart is displayed with the added products
    And The purchase is completed by filling out the purchase form
    Then The message that the purchase was successfully completed is displayed