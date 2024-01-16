@ignore
Feature: Get the new pet added

  Background:
    * url api.baseUrl

    @Get
    Scenario: Get the pet added previously
      Given path '/pet/' + id
      When method get
      Then status 200
      And match $ == responseSuccessfulGet




