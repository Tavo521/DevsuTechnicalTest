Feature: Update a pet

  Background:
    * url api.baseUrl
    * path petStorePath = '/pet'
    * def responseSuccessful = read("successful-response-put.json")

  Scenario Outline: Add new pet to the store
    Given request {"id": #(id),"category": {"id": 1,"name": #(name)},"name": "Catty","photoUrls": ["Foto"],"tags": [{"id": 0,"name": "string"}],"status": "sold"}
    When method put
    Then status 200
    And match $ == responseSuccessful

    Examples:
      | id  | name  |
      | 100 | Rogue |