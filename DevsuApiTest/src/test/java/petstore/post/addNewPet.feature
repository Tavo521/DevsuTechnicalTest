Feature: Add new pet to the store

  Background:
    * url api.baseUrl
    * path petStorePath = '/pet'
    * def responseSuccessful = read("successful-response-post.json")
    
    Scenario Outline: Add new pet to the store
      Given request {"id": #(id),"category": {"id": 1,"name": #(name)},"name": "Catty","photoUrls": ["Foto"],"tags": [{"id": 0,"name": "string"}],"status": "available"}
      When method post
      Then status 200
      And match $ == responseSuccessful

      Examples:
      | id  | name  |
      | 100 | Roger |