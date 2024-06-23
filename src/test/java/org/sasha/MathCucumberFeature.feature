Feature: Math

  Scenario: Addition and subtraction
    Given 5; 3
    When adding numbers
    Then addition result: 8
    When subtracting numbers
    Then subtraction result: 2
