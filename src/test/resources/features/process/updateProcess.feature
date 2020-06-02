Feature: Update a Process
  Background:
    Given : the user access site http://agapito-server.herokuapp.com/processos
  Scenario: Update a simples process
    And The user fill "vara" with value "3"
    And The user fill "numero_processo" with value "123123123"
    And The user fill "natureza" with value "Guarda"
    And The user fill "partes" with value "José x Maria"
    And The user fill "urgente" with value "S"
    And The user fill "arbitramento" with value "S"
    And The user fill "assistente_social" with value "Maria 123"
    And The user fill "data_entrada" with value "2020-10-15"
    And The user fill "data_saida" with value "2020-11-25"
    And The user fill "data_agendamento" with value "2020-10-16"
    And The user fill "status" with value "Aguardando"
    And The user fill "observacao" with value "teste"
    And The user clicks on btn-save

    And The user fill "observacao" with value "Nova teste"
    When The user clicks on btn-update

    Then user should see "success" message


  Scenario: Update a simples process with read field
    Given The user fill "observacao" with value "Nova teste"
    And The user clicks on btn-update
    When the user search the last process save
    Then The user see "observacao" in the field "Nova teste"


  Scenario: Update a process with id non-existent
    Given The user fill "observacao" with value "Nova teste"
    When The user clicks on btn-update with invalid id
    Then user should see "not found" message