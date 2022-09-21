Feature: Customize product's color on Buy Page

  Scenario Outline: The user should be able to see the picture of an iPad Air in the selected color
  so that user can choose the color.

    Given the user is on the "Buy iPad Air" page
    When "<color>" is selected
    Then product image should change
    Examples:
      | color      |
      | Space Gray |
      | Pink       |
      | Purple     |
      | Blue       |
      | Starlight  |
