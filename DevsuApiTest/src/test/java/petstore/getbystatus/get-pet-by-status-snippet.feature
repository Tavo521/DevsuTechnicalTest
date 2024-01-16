@ignore
Feature: Get the pet by the status

  Background:
    * url api.baseUrl
    * path petStorePath = '/pet/findByStatus'
    * params {status: "#(status)"}

  @GetByStatus
  Scenario: Get the pet by status
    * def temp = karate.jsonPath(response, "$.[?(@.id=='" + id + "')].category.name")
    When method get
    Then status 200
    And match temp contains newName

