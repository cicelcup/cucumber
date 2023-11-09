 Feature: Test calculator
  Learning Cucumber

  Scenario Outline: Add two numbers
    Given I have a calculator
    When I add <number1> and <number2>
    Then the result should be <sum>

    Examples:
      | number1 | number2 | sum |
      | 2       | 3       | 5   |
      | -5      | 8       | 3   |
      | 0       | 0       | 0   |
      | 10      | -5      | 5   |