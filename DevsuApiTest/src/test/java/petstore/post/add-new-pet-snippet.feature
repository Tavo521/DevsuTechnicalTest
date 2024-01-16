@ignore
 Feature: Add new pet to the store

  Background:
    * url api.baseUrl
    * path petStorePath = '/pet'

    @Add
    Scenario: Add new pet to the store
      Given request bodyRequest
      When method post
      Then status 200
      And match $ == responseSuccessfulPost

