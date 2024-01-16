Feature: Get the new pet added

  Background:
    * url api.baseUrl

  @Get @ignore
  Scenario: Get the pet added previously
    Given path '/pet/' + id
    When method get
    Then status 200
    And match $ == responseSuccessfulGet

  Scenario Outline: Give a invalid id
    Given path '/pet/' + id
    When method get
    Then status 404
    And match $ == failResponseGet

    Examples:
      | id          |
      | -1          |
      | 100000      |
      | 21634527163 |
      | -1458       |



