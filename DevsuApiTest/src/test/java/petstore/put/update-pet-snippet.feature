@ignore
Feature: Update a pet

  Background:
    * url api.baseUrl
    * path petStorePath = '/pet'

  @Update
  Scenario Outline: Add new pet to the store
    Given request updateBodyRequest
    When method put
    Then status 200
    And match $ == responseSuccessfulPut

    Examples:
      | id  | name  |
      | 100 | Rogue |