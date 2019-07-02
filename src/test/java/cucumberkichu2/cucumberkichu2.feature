Feature: Test Calculator
calculator functionality


  Scenario Outline: calculation of two numbers
    Given I enter <value1> in the calculator
    And I press "<function>" symbol
    
    And I have entered <value2> in the calculator
      When I press equal symbol
    Then The result should be <value3> on the screen

    Examples: 
      | function | value1 | value2  | value3 |
      | add      |     5  |     5   |    10  |
      | subtract |     7  |     2   |    5   |
      | multiply |     3  |     3   |    9   |
      | divide   |     9  |     3   |    3   |
