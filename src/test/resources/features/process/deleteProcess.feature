Feature: Delete a process
  Background:
    Given : the user access site http://agapito-server.herokuapp.com/processos
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

  Scenario: Delete a simples process
    Given The user clicks on btn-save
    When The user clicks on btn-delete

    Then user should see "no content" message


  Scenario: Delete an  process id non-existent
    Given The user clicks on btn-save
    When The user clicks on btn-delete with invalid id

    Then user should see "not found" message