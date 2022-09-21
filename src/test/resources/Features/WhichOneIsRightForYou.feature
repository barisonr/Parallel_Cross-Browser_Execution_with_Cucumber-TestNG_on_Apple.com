Feature: Which one is right for you?

  @Regression
  Scenario: The user should be able to reach the Buy page of the MacBook Air with the Buy button in
  "Which Mac notebook is right for you?" section so user can begin the purchase.

    Given an unregistered user is on the "M2 MacBook Air" product page
    When click the Buy "M2 MacBook Air" in the "Which Mac notebook is right for you?"
    Then the "Choose your new MacBook Air" page should open

  @Regression
  Scenario: The user should be able to reach the Buy page of the iPhone 14 Pro with the Buy button in
  "Which iPhone is right for you?" section so user can begin the purchase.

    Given an unregistered user is on the "iPhone" product page
    When click the Buy "iPhone 14 Pro" in the "Which iPhone is right for you?"
    Then the "Buy iPhone 14 Pro" page should open

  @Regression
  Scenario: The user should be able to reach the Buy page of the iPad Air with the Buy button in
  "Which iPad is right for you?" section so user can begin the purchase.

    Given an unregistered user is on the "iPad Air" product page
    When click the Buy "iPad Air" in the "Which iPad is right for you?"
    Then the "Buy iPad Air" page should open