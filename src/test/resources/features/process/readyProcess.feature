Feature: Ready a process

  Scenario: Read a simples process
    Given user user has an existent id equal "820"
    When the user clicks on read process button
    Then user should see "success" message