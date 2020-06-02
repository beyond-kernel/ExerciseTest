Feature: Ready a process

  Scenario Outline: Read a simples process
    Given user user has an existent id equal "<id>"
    When the user clicks on read process button
    Then user should see "<message>" message
    Examples:
      | id  | message   |
      | 828 | success   |
      | 666 | not found |
      |     | success   |
