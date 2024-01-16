Feature: Update a pet

  Background:
    * url api.baseUrl
    * path petStorePath = '/pet'

  @Update @ignore
  Scenario Outline: Update a existing pet in the store
    Given request updateBodyRequest
    When method put
    Then status 200
    And match $ == responseSuccessfulPut

    Examples:
      | id  | name  |
      | 100 | Rogue |

  Scenario Outline: Try to update a pet with unexisted id
    Given request updateBodyRequest
    When method put
    Then status 404
    And match $ == failResponsePut

    Examples:
      | id       | name  | newName |
      | -1       | Rogue | Cata    |
      | 1091019  | Roger | German  |
      | -2312    | Leo   | Milo    |
      | 11111111 | Agua  | Panela  |

